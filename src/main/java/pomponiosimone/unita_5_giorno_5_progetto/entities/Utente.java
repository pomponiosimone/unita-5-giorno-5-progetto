package pomponiosimone.unita_5_giorno_5_progetto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
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

//Costruttore

    public Utente(String email, String nomeECognome, int nPrenotazioni, String username) {
        this.email = email;
        this.nomeECognome = nomeECognome;
        this.nPrenotazioni = nPrenotazioni;
        this.username = username;
    }


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
