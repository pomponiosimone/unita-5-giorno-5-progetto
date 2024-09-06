package pomponiosimone.unita_5_giorno_5_progetto.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Edificio;
import pomponiosimone.unita_5_giorno_5_progetto.exceptions.ValidationException;
import pomponiosimone.unita_5_giorno_5_progetto.repositories.EdificioRepository;

@Service
@Slf4j
public class EdificioService {
    @Autowired
    private EdificioRepository edificioRepository;
    public void saveEdificio(Edificio newEdificio) {
        if (newEdificio == null) {
            throw new ValidationException("L'edificio non può essere nullo");
        }

        // Controllo se esiste già l'edificio
        if (edificioRepository.existsByNomeEdificio(newEdificio.getNomeEdificio())) {
            log.error("Tentativo di salvare un edificio esistente: {}", newEdificio.getNomeEdificio());
            throw new ValidationException("L'Edificio " + newEdificio.getNomeEdificio() + " esiste già");
        }

        // Salva il nuovo edificio
        edificioRepository.save(newEdificio);
        log.info("Nuovo Edificio salvato: {}", newEdificio.getNomeEdificio());
    }
}
