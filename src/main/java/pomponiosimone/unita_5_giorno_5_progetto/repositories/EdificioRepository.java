package pomponiosimone.unita_5_giorno_5_progetto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Edificio;

import java.util.UUID;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, UUID> {
    boolean existsByNomeEdificio(String nomeEdificio);
}