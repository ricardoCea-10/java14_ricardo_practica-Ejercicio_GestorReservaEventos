package model.dto;
import java.time.LocalDate;

public abstract class Evento {

    // Atributos:
    private String nombreEvento;
    private String lugar;
    private LocalDate fecha;
    private int hora;

    // Constructores:
    public Evento() {
    }
    public Evento(String nombreEvento, String lugar, LocalDate fecha, int hora) {
        this.nombreEvento = nombreEvento;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters & Setters
    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    // toString
    @Override
    public String toString() {
        return "Evento{" +
                "nombreEvento='" + nombreEvento + '\'' +
                ", lugar='" + lugar + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                '}';
    }

    // Metodos a implementar
    public abstract void agregarComentario();

    public abstract void agregarCalificacion();

}
