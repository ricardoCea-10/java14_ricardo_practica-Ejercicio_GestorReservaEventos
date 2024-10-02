package model.dto;

public class Calificacion {

    // Atributos Clase:
    private double estrellas;
    private Usuario usuario;
    private Evento evento;

    // Constructores:
    public Calificacion() {
    }

    public Calificacion(double estrellas, Usuario usuario, Evento evento) {
        this.estrellas = estrellas;
        this.usuario = usuario;
        this.evento = evento;
    }

    // Getters & Setters:
    public double getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(double estrellas) {
        this.estrellas = estrellas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
