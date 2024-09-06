package pomponiosimone.unita_5_giorno_5_progetto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Postazione;
import pomponiosimone.unita_5_giorno_5_progetto.enums.TipoPostazione;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {



}
