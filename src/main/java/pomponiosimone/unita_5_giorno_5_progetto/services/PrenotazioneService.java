package pomponiosimone.unita_5_giorno_5_progetto.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pomponiosimone.unita_5_giorno_5_progetto.entities.Prenotazione;
import pomponiosimone.unita_5_giorno_5_progetto.exceptions.ValidationException;
import pomponiosimone.unita_5_giorno_5_progetto.repositories.PrenotazioneRepository;


@Service
@Slf4j
public class PrenotazioneService {

        @Autowired
        private PrenotazioneRepository prenotazioneRepository;

        public void savePrenotazione(Prenotazione newPrenotazione){

            prenotazioneRepository.save(newPrenotazione);

            log.info("nuova Prenotazione "+ newPrenotazione.getId() +"  salvata");
        }}


