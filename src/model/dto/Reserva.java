package model.dto;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    // Atributos Clase:
    private String nombreReserva;
    private LocalDate fechaReserva;
    private long precioBase;
    private Evento evento;
    private List<Solicitud> solicitud;

    // constructores (Excluimos el parametro "Solicitud", ya que las solicitudes se crean
    // a partir de las reservas)
    public Reserva() {
    }
    public Reserva(String nombreReserva, LocalDate fechaReserva, long precioBase, Evento evento) {
        this.nombreReserva = nombreReserva;
        this.fechaReserva = fechaReserva;
        this.precioBase = precioBase;
        this.evento = evento;
    }

    // Getters & Setters
    public String getNombreReserva() {
        return nombreReserva;
    }

    public void setNombreReserva(String nombreReserva) {
        this.nombreReserva = nombreReserva;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public long getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(long precioBase) {
        this.precioBase = precioBase;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Solicitud> getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(List<Solicitud> solicitud) {
        this.solicitud = solicitud;
    }

    // toString
    @Override
    public String toString() {
        return "Reserva{" +
                "nombreReserva='" + nombreReserva + '\'' +
                ", fechaReserva=" + fechaReserva +
                ", precioBase=" + precioBase +
                ", evento=" + evento +
                '}';
    }
}
