package dio.academia.controller;

import dio.academia.DTO.AvaliacaoFisicaDTO;
import dio.academia.model.AvaliacaoFisica;
import dio.academia.service.AvaliacaoFisicaInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avalicoes")
public class AvalicaoFisicaController {
    @Autowired
    private AvaliacaoFisicaInterfaceService service;
    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaDTO avaliacaoFisicaDTO){
        return service.createAvaliacaoFisica(avaliacaoFisicaDTO);
    }
    @GetMapping
    public List<AvaliacaoFisica> showAll(){
        return service.showAllAvalicaoFisica();
    }
}
