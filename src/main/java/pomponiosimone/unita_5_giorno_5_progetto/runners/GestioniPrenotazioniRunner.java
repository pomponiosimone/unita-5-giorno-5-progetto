package pomponiosimone.unita_5_giorno_5_progetto.runners;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

import pomponiosimone.unita_5_giorno_5_progetto.entities.Edificio;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Postazione;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Prenotazione;
import pomponiosimone.unita_5_giorno_5_progetto.entities.Utente;
import pomponiosimone.unita_5_giorno_5_progetto.enums.TipoPostazione;
import pomponiosimone.unita_5_giorno_5_progetto.services.EdificioService;
import pomponiosimone.unita_5_giorno_5_progetto.services.PostazioneService;
import pomponiosimone.unita_5_giorno_5_progetto.services.PrenotazioneService;
import pomponiosimone.unita_5_giorno_5_progetto.services.UtenteService;

@Component
public class GestioniPrenotazioniRunner implements CommandLineRunner {

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private PrenotazioneService prenotazioneService;


    @Override
    public void run(String... args) throws Exception {


        Edificio edificio1 = new Edificio("Roma","Pascoli RRItaliani", "Via Miami, 50");
        Edificio edificio2 = new Edificio("Milano", "ModernWar", "via Nodi, 50");
        Edificio edificio3 = new Edificio("Pisa", "CityLife", "Via benessere, 43");

        edificioService.saveEdificio(edificio1);
        edificioService.saveEdificio(edificio2);
        edificioService.saveEdificio(edificio3);


        Postazione postazione1 = new Postazione( "Postazione Privata", TipoPostazione.PRIVATO, 1, edificio1);
        Postazione postazione2 = new Postazione( "Postazione Open Space", TipoPostazione.OPEN_SPACE, 5, edificio1);
        Postazione postazione3 = new Postazione("Sala Riunioni Grande", TipoPostazione.RIUNIONI, 10, edificio2);
        Postazione postazione4 = new Postazione("Postazione Privata", TipoPostazione.PRIVATO, 1, edificio3);
        Postazione postazione5 = new Postazione("Open Space", TipoPostazione.OPEN_SPACE, 4, edificio3);

        postazioneService.savePostazione(postazione1);
        postazioneService.savePostazione(postazione2);
        postazioneService.savePostazione(postazione3);
        postazioneService.savePostazione(postazione4);
        postazioneService.savePostazione(postazione5);

        Utente utente1 = new Utente("mario.rossi@email.com", "Mario Rossi", 0, "mrossi");
        Utente utente2 = new Utente("giulia.luca@email.com", "Giulia Luca", 0, "gluca");
        Utente utente3 = new Utente("davide.ferrari@email.com", "Davide Ferrari", 0, "dferrari");


        utenteService.saveUtente(utente1);
        utenteService.saveUtente(utente2);
        utenteService.saveUtente(utente3);


        Prenotazione prenotazione1 = new Prenotazione(utente1, postazione1, LocalDate.of(2023, 4, 15));
        Prenotazione prenotazione2 = new Prenotazione(utente2, postazione3, LocalDate.of(2024, 9, 10));
        Prenotazione prenotazione3 = new Prenotazione(utente3, postazione5, LocalDate.of(2024, 12, 25));
        Prenotazione prenotazione4 = new Prenotazione(utente1, postazione4, LocalDate.of(2022, 9, 13));

        prenotazioneService.savePrenotazione(prenotazione1);
        prenotazioneService.savePrenotazione(prenotazione2);
        prenotazioneService.savePrenotazione(prenotazione3);
        prenotazioneService.savePrenotazione(prenotazione4);


        System.out.println("Dati inseriti con successo nel database:");
}}
