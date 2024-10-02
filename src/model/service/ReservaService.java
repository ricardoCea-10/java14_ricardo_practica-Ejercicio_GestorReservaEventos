package model.service;
import model.dto.Evento;
import model.dto.Reserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservaService {

    // Creamos una instancia de la clase "Reserva" y "EventoService".
    // "Reserva" para generar una lista de reservas
    // "EventoService" para luego poder obtener los eventos de aquí.
    List<Reserva> reserva = new ArrayList<Reserva>();
    EventoService eventoService = new EventoService();

    // Instanciamos las reservas dentro del contructor "vacio"
    // Primero cremos una lista de eventos para obtenerlos
    public ReservaService() {

        List<Evento> eventos = eventoService.getEventos();

        reserva.add(new Reserva("YoPadre", LocalDate.now(), 1000000, eventos.get(1)));
        reserva.add(new Reserva("YoHijo", LocalDate.now(), 600000, eventos.get(2)));
    }

    // Servicio: ver lista de reservas:
    public List<Reserva> getReservas(){
        return reserva;
    }
    public void addReserva(Reserva reserva){

    }
}
