package controller;

import model.dto.Evento;
import model.dto.Reserva;
import model.service.EventoService;
import model.service.ReservaService;
import view.EventoView;
import java.util.List;

public class Controlador {
    // creamos una instancia del Servicio de Eventos (EventosService) y
    // del Servicio de Reservas (ReservaService):
    EventoService eventoService = new EventoService();
    ReservaService reservaService = new ReservaService();
    // Creamoas además una instancia de EventoView, para trabajar funciones de agregarEvento:
    EventoView eventoView = new EventoView();

    // Read Eventos:
    public void readEvent(){
        List<Evento> lista = eventoService.getEventos();
        for (Evento evento : lista) {
            System.out.println(evento.toString());
        }
    }

    // Read Reservas:
    public void readReserva(){
        List<Reserva> lista = reservaService.getReservas();
        for (Reserva reserva : lista) {
            System.out.println(reserva.toString());
        }
    }

    // Create Evento:
    public void agregarEvento(){
       Evento evento = eventoView.agregarEvento();
       eventoService.addEvento(evento);
    }

    // Actualizar Evento:
    public void actualizarEvento(){
        // mostramos la lista de eventos:
        List<Evento> lista = eventoService.getEventos();
        long i = 1;
        for (Evento evento : lista) {
            System.out.println(i +". "+ evento.toString());
            i++;
        }
        // Solicitamos al usuario un evento para actualizar:
        short numeroEvento = eventoView.opcionActualizarEvento(); // Comunicación con vista.
        numeroEvento = (short) (numeroEvento-1); // transformamos el int (-1) a un short.

        // El usuario agrega un nuevo evento a la lista:
        Evento evento = eventoView.actualizarEvento(); // Comunicación con vista.
        eventoService.updateEvento(numeroEvento, evento); // Comunicación con Servicio.

    }

    // Delete Evento:
    public void deleteEvento(){
        // mostramos la lista de eventos:
        List<Evento> lista = eventoService.getEventos();
        long i = 1;
        for (Evento evento : lista) {
            System.out.println(i +". "+ evento.toString());
            i++;
        }
        // Solicitamos al usuario un evento para eliminar, y luego lo eliminamos de la lista:
        short opcion = eventoView.opcionEliminarEvento(); // comunicación con vista.
        opcion = (short) (opcion-1); // transformamos el int (-1) a un short.
        eventoService.removeEvento(opcion); // comunicación con servicio.
    }



}
