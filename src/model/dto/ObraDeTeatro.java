package model.dto;
import java.time.LocalDate;

public class ObraDeTeatro extends Evento {

    // Atributos:
    private String nombreCompania;
    private int cantidadArtistas;

    // Constructores:
    public ObraDeTeatro() {
    }
    public ObraDeTeatro(String nombreEvento, String lugar,
                        LocalDate fecha, int hora, String nombreCompania,
                        int cantidadArtistas) {
        super(nombreEvento, lugar, fecha, hora);
        this.nombreCompania = nombreCompania;
        this.cantidadArtistas = cantidadArtistas;
    }

    // Getters & Setters:
    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public int getCantidadArtistas() {
        return cantidadArtistas;
    }

    public void setCantidadArtistas(int cantidadArtistas) {
        this.cantidadArtistas = cantidadArtistas;
    }

    //toString


    @Override
    public String toString() {
        return "ObraDeTeatro{" +
                "nombreCompania='" + nombreCompania + '\'' +
                ", cantidadArtistas=" + cantidadArtistas +
                '}'+ super.toString();
    }

    // Métodos abstractos implementados
    @Override
    public void agregarComentario() {

    }

    @Override
    public void agregarCalificacion() {

    }
}
