package dio.academia.service;

import dio.academia.DTO.AlunoDTO;
import dio.academia.model.Aluno;
import dio.academia.model.AvaliacaoFisica;

import java.util.List;
import java.util.Optional;

public interface AlunoInterfaceService {
    Aluno createAluno(AlunoDTO alunoDTO);
    Optional<Aluno> getAluno(Integer id);
    List<Aluno> showAlunos();
    void deleteAluno(Integer id);
    Aluno updateAluno(Integer id, AlunoDTO alunoDTO);
    List<AvaliacaoFisica> showAvaliacaoFisicaById(Integer id);
}
