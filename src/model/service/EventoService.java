package model.service;
import jdk.jfr.Event;
import model.dto.Concierto;
import model.dto.Conferencia;
import model.dto.Evento;
import model.dto.ObraDeTeatro;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class EventoService {

    // Asignamos una fecha a LocalDate:
    LocalDate fechaEventos1 = LocalDate.of(2024, 8, 29);
    LocalDate fechaEventos2 = LocalDate.of(2024, 10, 19);
    LocalDate fechaEventos3 = LocalDate.of(2026, 1, 7);

    // Generamos un ArrayList de eventos:
    List<Evento> lista = new ArrayList<Evento>();

    // Constructor "vacio" crea objetos en la lista:
    public EventoService() {
        lista.add(new Concierto("Rock in Rio", "Rio de Janeiro",
                fechaEventos1, 1900, "Avenged Sevenfold",
                "NicoB", 5, 3));
        lista.add(new Concierto("Rock in Lisboa", "Lisboa",
                fechaEventos1, 2200, "Guns and Roses",
                "JackWhite", 9, 4));
        lista.add(new ObraDeTeatro("Los Cascanueces", "Santiago", fechaEventos2,
                1300, "WiWaa", 60));
        lista.add(new Conferencia("Microsoft Lanzamiento", "Silicon Valey", fechaEventos3,
                1300, "MicrosoftProduction", 15));
    }

    // Servicio: obtener lista de eventos:
    public List<Evento> getEventos(){
        return lista;
    }

    // Servicio: añadir evento a la lista:
    public void addEvento(Evento evento){
        lista.add(evento);
    }

    // Servicio: actualizar un evento de la lista:
    public void updateEvento(int op, Evento evento){
        lista.set(op, evento);
    }

    // Servicio: eliminar evento de la lista:
    public void removeEvento(short opcion){
        lista.remove(opcion);
    }

}
