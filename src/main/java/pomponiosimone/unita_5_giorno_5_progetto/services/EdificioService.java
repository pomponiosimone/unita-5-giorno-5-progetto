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

    public void saveEdificio(Edificio newEdificio){
     if(edificioRepository.existsByNomeEdificio(newEdificio.getNomeEdificio())) throw new ValidationException("L'Edificio " + newEdificio.getNomeEdificio() + " esiste già");
     edificioRepository.save(newEdificio);

        log.info("nuovo Edificio "+ newEdificio.getNomeEdificio() +"  salvato");
}}
