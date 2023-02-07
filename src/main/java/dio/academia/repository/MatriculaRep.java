package dio.academia.repository;

import dio.academia.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRep extends JpaRepository<Matricula,Long> {

}
