package pomponiosimone.unita_5_giorno_5_progetto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {
}