package pomponiosimone.unita_5_giorno_5_progetto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Utente")
public class Utente {

//Attributi

        @Id
        @Setter(AccessLevel.NONE)
        private String username;
        private String nomeECognome;
        private String email;
        private int nPrenotazioni;


//To string

    @Override
    public String toString() {
        return "Utente{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", nomeECognome='" + nomeECognome + '\'' +
                ", nPrenotazioni=" + nPrenotazioni +
                '}';
    }
}
