package model.dto;
import java.time.LocalDate;

public class Concierto extends Evento {

    // Atributos:
    private String nombreBandaPrincipal;
    private String nombreTelonero;
    private int cantidadDeMusicosBandaPrincipal;
    private int cantidadDeMusicosBandaTelonera;

    // Contructores:
    public Concierto() {
    }

    public Concierto(String nombreEvento, String lugar, LocalDate fecha,
                     int hora, String nombreBandaPrincipal, String nombreTelonero,
                     int cantidadDeMusicosBandaPrincipal, int cantidadDeMusicosBandaTelonera) {
        super(nombreEvento, lugar, fecha, hora);
        this.nombreBandaPrincipal = nombreBandaPrincipal;
        this.nombreTelonero = nombreTelonero;
        this.cantidadDeMusicosBandaPrincipal = cantidadDeMusicosBandaPrincipal;
        this.cantidadDeMusicosBandaTelonera = cantidadDeMusicosBandaTelonera;
    }

    // Getters & Setters:
    public String getNombreBandaPrincipal() {
        return nombreBandaPrincipal;
    }

    public void setNombreBandaPrincipal(String nombreBandaPrincipal) {
        this.nombreBandaPrincipal = nombreBandaPrincipal;
    }

    public String getNombreTelonero() {
        return nombreTelonero;
    }

    public void setNombreTelonero(String nombreTelonero) {
        this.nombreTelonero = nombreTelonero;
    }

    public int getCantidadDeMusicosBandaPrincipal() {
        return cantidadDeMusicosBandaPrincipal;
    }

    public void setCantidadDeMusicosBandaPrincipal(int cantidadDeMusicosBandaPrincipal) {
        this.cantidadDeMusicosBandaPrincipal = cantidadDeMusicosBandaPrincipal;
    }

    public int getCantidadDeMusicosBandaTelonera() {
        return cantidadDeMusicosBandaTelonera;
    }

    public void setCantidadDeMusicosBandaTelonera(int cantidadDeMusicosBandaTelonera) {
        this.cantidadDeMusicosBandaTelonera = cantidadDeMusicosBandaTelonera;
    }

    // toString:


    @Override
    public String toString() {
        return "Concierto{" +
                "nombreBandaPrincipal='" + nombreBandaPrincipal + '\'' +
                ", nombreTelonero='" + nombreTelonero + '\'' +
                ", cantidadDeMusicosBandaPrincipal=" + cantidadDeMusicosBandaPrincipal +
                ", cantidadDeMusicosBandaTelonera=" + cantidadDeMusicosBandaTelonera +
                "} " + super.toString();
    }

    // Métodos abstractos implementados:
    @Override
    public void agregarComentario() {

    }

    @Override
    public void agregarCalificacion() {

    }
}
