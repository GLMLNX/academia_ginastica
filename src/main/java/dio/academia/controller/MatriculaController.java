package dio.academia.controller;

import dio.academia.DTO.MatriculaDTO;
import dio.academia.model.Matricula;
import dio.academia.service.MatriculaInterfaceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaInterfaceService service;
    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaDTO matriculaDTO){
        return service.createMatricula(matriculaDTO);
    }
    @GetMapping
    public List<Matricula> showAll(){
        return service.showAllMatricula();
    }
}
