package dio.academia.service;

import dio.academia.DTO.AvaliacaoFisicaDTO;
import dio.academia.model.Aluno;
import dio.academia.model.AvaliacaoFisica;
import dio.academia.repository.AlunoRep;
import dio.academia.repository.AvaliacaoFisicaRep;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AvaliacaoFisicaService implements AvaliacaoFisicaInterfaceService{

    @Autowired
    private AvaliacaoFisicaRep avaliacaoFisicaRep;
    @Autowired
    private AlunoRep alunoRep;
    @Override
    public AvaliacaoFisica createAvaliacaoFisica(AvaliacaoFisicaDTO avaliacaoFisicaDTO) {
        var avalicao =new AvaliacaoFisica();
        BeanUtils.copyProperties(avaliacaoFisicaDTO,avalicao);
        return avaliacaoFisicaRep.save(avalicao);
    }

    @Override
    public Optional<AvaliacaoFisica> getAvalicaoFisica(Integer id) {
        return avaliacaoFisicaRep.findById(id);
    }

    @Override
    public List<AvaliacaoFisica> showAllAvalicaoFisica() {
        return avaliacaoFisicaRep.findAll();
    }

    @Override
    public AvaliacaoFisica updateAvalicaoFisica(Integer id, AvaliacaoFisicaDTO avaliacaoFisicaDTO) {
        Optional<AvaliacaoFisica> avaliacaoFisica=avaliacaoFisicaRep.findById(id);
        BeanUtils.copyProperties(avaliacaoFisicaDTO,avaliacaoFisica);
        if (avaliacaoFisica.isEmpty()){
            return null;
        }
        return avaliacaoFisicaRep.save(avaliacaoFisica.get());
    }

    @Override
    public void deleteAvalicaoFisica(Integer id) {
        avaliacaoFisicaRep.deleteById(id);
    }
}
