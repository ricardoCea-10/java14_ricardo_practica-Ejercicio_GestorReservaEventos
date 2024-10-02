
import java.util.*;

/**
 * 
 */
public abstract class Evento {

    /**
     * Default constructor
     */
    public Evento() {
    }

    /**
     * 
     */
    private String nombreEvento;

    /**
     * 
     */
    private LocalDate fecha;

    /**
     * 
     */
    private int hora;

    /**
     * 
     */
    private String lugar;

    /**
     * @param comentario
     */
    public void agregarComentario(Comentario comentario) {
        // TODO implement here
    }

    /**
     * @param calificacion
     */
    public void agregarCalificacion(Calificacion calificacion) {
        // TODO implement here
    }

}