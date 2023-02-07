package dio.academia.repository;

import dio.academia.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRep extends JpaRepository<Aluno,Integer> {

}
