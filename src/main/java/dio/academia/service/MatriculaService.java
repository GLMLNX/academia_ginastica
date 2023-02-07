package dio.academia.service;

import dio.academia.DTO.MatriculaDTO;
import dio.academia.model.Matricula;
import dio.academia.repository.MatriculaRep;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MatriculaService implements MatriculaInterfaceService{
    @Autowired
    private MatriculaRep matriculaRep;
    @Override
    public Matricula createMatricula(MatriculaDTO matriculaDTO) {
        var matricula= new Matricula();
        BeanUtils.copyProperties(matriculaDTO,matricula);
        return matriculaRep.save(matricula);
    }

    @Override
    public Optional<Matricula> getMatricula(Long id) {
        return matriculaRep.findById(id);
    }

    @Override
    public List<Matricula> showAllMatricula() {
        return matriculaRep.findAll();
    }

    @Override
    public void deleteMatricula(Long id) {
        matriculaRep.deleteById(id);
    }
}
