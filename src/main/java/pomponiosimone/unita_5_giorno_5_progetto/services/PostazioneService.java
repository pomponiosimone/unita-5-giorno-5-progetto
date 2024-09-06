package pomponiosimone.unita_5_giorno_5_progetto.services;



import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Postazione;
import pomponiosimone.unita_5_giorno_5_progetto.exceptions.ValidationException;
import pomponiosimone.unita_5_giorno_5_progetto.repositories.PostazioneRepository;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;

    public void savePostazione(Postazione newPostazione) {




        postazioneRepository.save(newPostazione);

        log.info("Nuova postazione " + newPostazione.getId() + " salvata");
    }



}