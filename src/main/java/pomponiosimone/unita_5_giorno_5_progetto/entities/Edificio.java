package pomponiosimone.unita_5_giorno_5_progetto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String citta;
    private String nomeEdificio;


    // COSTRUTTORI

    public Edificio(String città, String nomeEdificio) {
        this.citta = citta;
        this.nomeEdificio = nomeEdificio;
    }


    // TO STRING

    @Override
    public String toString() {
        return "Edificio{" +
                "id=" + id +
                ", città='" + citta + '\'' +
                ", nomeEdificio='" + nomeEdificio + '\'' +
                '}';
    }

}