package pomponiosimone.unita_5_giorno_5_progetto.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "Edificio")
@NoArgsConstructor
@Getter
@Setter
public class Edificio {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String citta;
    private String nomeEdificio;
private String indirizzo;

    // COSTRUTTORI

    public Edificio(String città, String nomeEdificio, String indirizzo) {
        this.citta = citta;
        this.nomeEdificio = nomeEdificio;
        this.indirizzo = indirizzo;
    }


    // TO STRING


    @Override
    public String toString() {
        return "Edificio{" +
                "citta='" + citta + '\'' +
                ", id=" + id +
                ", nomeEdificio='" + nomeEdificio + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }
}