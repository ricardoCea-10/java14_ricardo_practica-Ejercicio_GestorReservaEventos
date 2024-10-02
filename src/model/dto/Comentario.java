package model.dto;

public class Comentario {

    // Atributos clase:
    private String comentario;
    private Usuario usuario;
    private Evento evento;

    // Constructores:
    public Comentario() {
    }

    public Comentario(String comentario, Usuario usuario, Evento evento) {
        this.comentario = comentario;
        this.usuario = usuario;
        this.evento = evento;
    }

    // Getters & Setters:
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
