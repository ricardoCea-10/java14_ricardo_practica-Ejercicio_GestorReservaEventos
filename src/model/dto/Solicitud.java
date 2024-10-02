package model.dto;

import java.time.LocalDate;

public class Solicitud {

    // Atributos clase:
    private Usuario usuario;
    private Reserva reserva;
    private int Valor;
    private LocalDate fecha;

    // Constructores:
    public Solicitud() {
    }
    public Solicitud(Usuario usuario, Reserva reserva, int valor, LocalDate fecha) {
        this.usuario = usuario;
        this.reserva = reserva;
        Valor = valor;
        this.fecha = fecha;
    }

    // Getters & Setters:
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // toString:
    @Override
    public String toString() {
        return "Solicitud{" +
                "usuario=" + usuario +
                ", reserva=" + reserva +
                ", Valor=" + Valor +
                ", fecha=" + fecha +
                '}';
    }
}
