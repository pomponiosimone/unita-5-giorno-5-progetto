package pomponiosimone.unita_5_giorno_5_progetto.services;


import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Utente;
import pomponiosimone.unita_5_giorno_5_progetto.exceptions.ValidationException;
import pomponiosimone.unita_5_giorno_5_progetto.repositories.UtenteRepository;

@Service
@Slf4j
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public void saveUtente(Utente newUtente) {


        if (utenteRepository.existsByUsername(newUtente.getUsername()))
            throw new ValidationException("L'utente " + newUtente.getUsername() + " è già in utilizzo!");

        utenteRepository.save(newUtente);

        log.info("Nuovo Utente " + newUtente.getUsername() + " salvato");

    }


}
