package dio.academia.service;

import dio.academia.DTO.AvaliacaoFisicaDTO;
import dio.academia.model.AvaliacaoFisica;

import java.util.List;
import java.util.Optional;

public interface AvaliacaoFisicaInterfaceService {
    AvaliacaoFisica createAvaliacaoFisica(AvaliacaoFisicaDTO avaliacaoFisicaDTO);


    Optional<AvaliacaoFisica> getAvalicaoFisica(Integer id);


    List<AvaliacaoFisica> showAllAvalicaoFisica();


    AvaliacaoFisica updateAvalicaoFisica(Integer id, AvaliacaoFisicaDTO avaliacaoFisicaDTO);


    void deleteAvalicaoFisica(Integer id);
}
