package pomponiosimone.unita_5_giorno_5_progetto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Postazione;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Prenotazione;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Utente;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    boolean existsById(Long id);
    List<Prenotazione> findByUtenteAndData(Utente utente, LocalDate data);
    List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);
}