package view;
import controller.Controlador;
import java.util.Scanner;
public class Menu {

    // Generamos una instancia de controlador, para comunicarnos con este
    Controlador controlador = new Controlador();

    // Orquesta el menú y realiza la ejecución del programa
    public void orquestaMenu(){
        int op;
        do {
            muestraMenu();
            System.out.println(" ");
            System.out.println("Selecciona la opción que requieras");
            System.out.println(" ");
            op = opcionDeMenu();
            switch (op){
                case 1:
                    System.out.println("Has seleccionado la opción 1 hehe");
                    controlador.readReserva();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2 hehe");
                    controlador.readEvent();
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción 3 hehe");
                    controlador.agregarEvento();
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción 4 hehe");
                    controlador.actualizarEvento();
                    break;
                case 5:
                    System.out.println("Has seleccionado la opción 5 hehe");
                    controlador.deleteEvento();
                    break;
                case 0:
                    System.out.println("PROGRAMA TERMINADO");
                    break;
                default:
                    System.out.println("Te equivocaste de opción :c");
            }
           // op = opcionDeMenu();
        } while (op != 0);
    }

    // Muestra el menú por consola
    public void muestraMenu(){
        System.out.println("===========================");
        System.out.println(" MENÚ PRINCIPAL");
        System.out.println("---------------------------");
        System.out.println("1. Listar Reservas");
        System.out.println("2. Listar Eventos");
        System.out.println("3. Agregar Evento");
        System.out.println("4. Actualizar Evento");
        System.out.println("5. Eliminar Evento");
        System.out.println("0. Salir");
        System.out.println("---------------------------");
    }

    // Opción de menú a ingresar por el usuario
    public int opcionDeMenu(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

}
