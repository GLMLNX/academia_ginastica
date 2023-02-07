package dio.academia.repository;

import dio.academia.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRep extends JpaRepository<AvaliacaoFisica,Integer> {
}
