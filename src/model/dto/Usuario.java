package model.dto;

public class Usuario {

    // Atributos clase:
    private int id;
    private String nombreUsuario;
    private String paisResidencia;
    private int credito;

    // Constructores
    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String paisResidencia, int credito) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.paisResidencia = paisResidencia;
        this.credito = credito;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    // métodos clase
    public void agregarReserva(){

    }
    public void eliminarReserva(){

    }
    public void agregarSolicitud(){

    }
    public void eliminarSolicitud(){

    }
}
