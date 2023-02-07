package dio.academia.controller;

import dio.academia.DTO.AlunoDTO;
import dio.academia.model.Aluno;
import dio.academia.model.AvaliacaoFisica;
import dio.academia.service.AlunoInterfaceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoInterfaceService service;
    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoDTO alunoDTO){
        return service.createAluno(alunoDTO);
    }
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAvaliacaoFisicaById(@PathVariable(name = "id") Integer id){
        return service.showAvaliacaoFisicaById(id);
    }
    @GetMapping
    public List<Aluno> showAllAlunos(){
        return service.showAlunos();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteAluno(@PathVariable(name = "id") Integer id){
        service.deleteAluno(id);
    }
    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable(name = "id") Integer id,@RequestBody AlunoDTO alunoDTO){
        return service.updateAluno(id,alunoDTO);
    }
}
