package pomponiosimone.unita_5_giorno_5_progetto.exceptions;


import java.util.UUID;

public class NotFoundException extends RuntimeException {
    NotFoundException(UUID id) {
        super("Il record con id " + id + " non è stato trovato!");
    }
}
