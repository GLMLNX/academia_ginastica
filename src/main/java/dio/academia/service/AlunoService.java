package dio.academia.service;

import dio.academia.DTO.AlunoDTO;
import dio.academia.model.Aluno;
import dio.academia.model.AvaliacaoFisica;
import dio.academia.repository.AlunoRep;
import dio.academia.repository.AvaliacaoFisicaRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService implements AlunoInterfaceService{
    @Autowired
    private AlunoRep alunoRep;
    @Autowired
    private AvaliacaoFisicaRep avaliacaoFisicaRep;
    @Override
    @Transactional
    public Aluno createAluno(AlunoDTO alunoDTO) {
        var aluno= new Aluno();
        BeanUtils.copyProperties(alunoDTO,aluno);
        return alunoRep.save(aluno);
    }

    @Override
    public Optional<Aluno> getAluno(Integer id) {
        return alunoRep.findById(id);
    }

    @Override
    public List<Aluno> showAlunos() {
        return alunoRep.findAll();
    }

    @Override
    public void deleteAluno(Integer id) {
        alunoRep.deleteById(id);
    }

    @Override
    public Aluno updateAluno(Integer id, AlunoDTO alunoDTO) {
        Optional<Aluno> aluno=alunoRep.findById(id);
        BeanUtils.copyProperties(alunoDTO,aluno);
        if (aluno.isEmpty()){
            return null;
        }
        return alunoRep.save(aluno.get());
    }

    @Override
    public List<AvaliacaoFisica> showAvaliacaoFisicaById(Integer id) {
        return alunoRep.findById(id).get().getAvaliacaoFisicaList().stream().toList();
    }
}
