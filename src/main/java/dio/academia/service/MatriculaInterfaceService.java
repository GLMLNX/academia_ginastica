package dio.academia.service;

import dio.academia.DTO.MatriculaDTO;
import dio.academia.model.Matricula;

import java.util.List;
import java.util.Optional;

public interface MatriculaInterfaceService {
    Matricula createMatricula(MatriculaDTO matriculaDTO);
    Optional<Matricula> getMatricula(Long id);
    List<Matricula> showAllMatricula();
    void deleteMatricula(Long id);

}
