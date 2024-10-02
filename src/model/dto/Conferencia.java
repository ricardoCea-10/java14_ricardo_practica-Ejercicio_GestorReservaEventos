package model.dto;
import java.time.LocalDate;

public class Conferencia extends Evento {

    // Atributos:
    private String nombreProductora;
    private int cantidadExpositores;

    // Constructores:
    public Conferencia() {
    }

    public Conferencia(String nombreEvento, String lugar, LocalDate fecha, int hora,
                       String nombreProductora, int cantidadExpositores) {
        super(nombreEvento, lugar, fecha, hora);
        this.nombreProductora = nombreProductora;
        this.cantidadExpositores = cantidadExpositores;
    }

    // Getters & Setters:
    public String getNombreProductora() {
        return nombreProductora;
    }

    public void setNombreProductora(String nombreProductora) {
        this.nombreProductora = nombreProductora;
    }

    public int getCantidadExpositores() {
        return cantidadExpositores;
    }

    public void setCantidadExpositores(int cantidadExpositores) {
        this.cantidadExpositores = cantidadExpositores;
    }

    // toString
    @Override
    public String toString() {
        return "Conferencia{" +
                "nombreProductora='" + nombreProductora + '\'' +
                ", cantidadExpositores=" + cantidadExpositores +
                '}'+ super.toString();
    }

    // Métodos abstractos implementados:
    @Override
    public void agregarComentario() {

    }

    @Override
    public void agregarCalificacion() {

    }
}
