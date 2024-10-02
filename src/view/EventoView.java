package view;

import model.dto.Concierto;
import model.dto.Conferencia;
import model.dto.Evento;
import model.dto.ObraDeTeatro;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EventoView {

    /***
     * Procesos (métodos) para añadir un evento. Vista usuario.
     * @return
     */
    public Evento agregarEvento(){
        System.out.println("Elige el tipo de evento que quieres agregar:");
        System.out.println("Opción 1: Concierto");
        System.out.println("Opción 2: Obra de teatro");
        System.out.println("Opción 3: Conferencia");
        short opcion = elegirOpcion();

        Evento e;
        switch (opcion){
            case 1:
                e = new Concierto();
                e = agregarConcierto(e);
                break;
            case 2:
                e = new ObraDeTeatro();
                e = agregarObraDeTeatro(e);
                break;
            case 3:
                e = new Conferencia();
                e = agregarConferencia(e);
                break;
            default:
                System.out.println("Escogiste mal, ¡pollo!");
                return null;
        }
        return e;
    }

    public short elegirOpcion(){
        Scanner entrada = new Scanner(System.in);
        short op = entrada.nextShort();
        return op;
    }

    // Creamos un concierto
    private Concierto agregarConcierto(Evento evento){
        Concierto c = (Concierto) evento; // Transformamos Evento en Concierto

        System.out.println("Indica el nombre del concierto:");
        Scanner entrada = new Scanner(System.in);
        c.setNombreEvento(entrada.nextLine());

        System.out.println("Indica el lugar del concierto:");
        c.setLugar(entrada.nextLine());

        System.out.println("La fecha del concierto será por defecto hoy");
        c.setFecha(LocalDate.now());
        System.out.println(" ");

        System.out.println("Indica la hora del concierto (solo numeros del 00 al 24 hrs.):");
        c.setHora(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Indica el nombre de la banda principal:");
        c.setNombreBandaPrincipal(entrada.nextLine());

        System.out.println("Indica el nombre de la banda telonera:");
        c.setNombreTelonero(entrada.nextLine());

        System.out.println("Indica la cantidad de musicos de la banda principal:");
        c.setCantidadDeMusicosBandaPrincipal(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Indica la cantidad de musicos de la banda telonera:");
        c.setCantidadDeMusicosBandaTelonera(entrada.nextInt());
        entrada.nextLine();

        return c;
    }

    // Creamos un Evento
    private ObraDeTeatro agregarObraDeTeatro(Evento evento){
        ObraDeTeatro o = (ObraDeTeatro) evento; // Transformamos Evento en ObraDeTeatro

        System.out.println("Indica el nombre de la obra de teatro:");
        Scanner entrada = new Scanner(System.in);
        o.setNombreEvento(entrada.nextLine());

        System.out.println("Indica el lugar de la obra de teatro:");
        o.setLugar(entrada.nextLine());

        System.out.println("La fecha de la obra de teatro será por defecto hoy");
        o.setFecha(LocalDate.now());
        System.out.println(" ");

        System.out.println("Indica la hora de la obra de teatro (solo numeros del 00 al 24 hrs.):");
        o.setHora(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Indica el nombre de la compañia teatral:");
        o.setNombreCompania(entrada.nextLine());

        System.out.println("Indica la cantidad de artistas teatrales" +
                " (actores, actrices, músicos, etc)");
        o.setCantidadArtistas(entrada.nextInt());
        entrada.nextLine();

        return o;
    }

    // Creamos una conferencia
    private Conferencia agregarConferencia(Evento evento){
        Conferencia conf = (Conferencia) evento; // Transformamos Evento en Conferencia

        System.out.println("Indica el nombre de la conferencia:");
        Scanner entrada = new Scanner(System.in);
        conf.setNombreEvento(entrada.nextLine());

        System.out.println("Indica el lugar de la conferencia:");
        conf.setLugar(entrada.nextLine());

        System.out.println("La fecha de la conferencia será por defecto hoy");
        conf.setFecha(LocalDate.now());
        System.out.println(" ");

        System.out.println("Indica la hora de la conferencia (solo numeros del 00 al 24 hrs.):");
        conf.setHora(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Indica el nombre de la productora de la conferencia:");
        conf.setNombreProductora(entrada.nextLine());

        System.out.println("Indica la cantidad de expositores de la conferencia (speakers))");
        conf.setCantidadExpositores(entrada.nextInt());
        entrada.nextLine();

        return conf;
    }

    /***
     * Procesos (métodos) para actualizar un evento. Vista usuario.
     * @return
     */

    public short opcionActualizarEvento(){
        System.out.println("");
        System.out.println("Selecciona el número del evento que deseas eliminar:");
        System.out.println("");
        short opcion = elegirOpcion();
        return opcion;
    }
    public Evento actualizarEvento(){
        System.out.println("Elige el tipo de evento que quieres actualizar:");
        System.out.println("Opción 1: Concierto");
        System.out.println("Opción 2: Obra de teatro");
        System.out.println("Opción 3: Conferencia");
        short opcion = elegirOpcion();

        Evento e;
        switch (opcion){
            case 1:
                e = new Concierto();
                e = agregarConcierto(e);
                break;
            case 2:
                e = new ObraDeTeatro();
                e = agregarObraDeTeatro(e);
                break;
            case 3:
                e = new Conferencia();
                e = agregarConferencia(e);
                break;
            default:
                System.out.println("Escogiste mal, ¡pollo!");
                return null;
        }
        return e;
    }

    /***
     * Procesos (métodos) para eliminar un evento. Vista usuario.
     * @return
     */

    public short opcionEliminarEvento(){
        System.out.println("");
        System.out.println("Selecciona el número del evento que deseas eliminar:");
        System.out.println("");
        short opcion = elegirOpcion();
        return opcion;
    }



}
