package pomponiosimone.unita_5_giorno_5_progetto.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "Prenotazione")
public class Prenotazione {

    //Attributi

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private LocalDate data;
    private boolean stato;
    @ManyToOne
    @JoinColumn(name = "utente_username")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;


//Costruttore completo
    public Prenotazione(LocalDate data, Long id, boolean stato, Utente utente) {
        this.data = data;
        this.id = id;
        this.stato = true;
        this.utente = utente;

    }

//To string
    @Override
    public String toString() {
        return "Prenotazione{" +
                "data=" + data +
                ", id=" + id +
                ", stato=" + stato +
                ", utente=" + utente +
                '}';
    }
}
