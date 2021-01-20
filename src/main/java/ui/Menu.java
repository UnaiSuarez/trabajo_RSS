package ui;

import controller.DAOFactory;
import controller.fuentes.DAOFuentes;
import controller.fuentes.DAOFuentesXML;
import entities.Fuente;
import entities.Noticia;

import java.util.List;
import java.util.Scanner;

public class Menu {

    //NO HACER :(
    //static ControlReservas controlReservas = new ControlReservasFile();

    public static void muestraPrincipal(){
        while(true) {
            System.out.print("1) Actualizar noticia\n2) Buscar noticia\n0) Salir\nOpción: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = Integer.parseInt(scanner.nextLine());
            if (opcion == 1) {
                introduceReserva();
            } else if (opcion == 2) {
                muestraBusquedaFuente();
            }
            else if(opcion == 0){
                break;
            }
        }
    }

    private static void introduceReserva(){
        Scanner scanner = new Scanner(System.in);
        //datos de la reserva
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("URL: ");
        String url = scanner.nextLine();
        //creo la reserva
        Fuente fuente = new Fuente(nombre,url);
        //guardo la reserva
        //controlReservas.inserta(reserva);
        DAOFactory.getInstance().getDAOFuentes().inserta(fuente);
    }

    private static void muestraBusquedaFuente(){
        List<Fuente> fuentes = DAOFactory.getInstance().getDAOFuentes().getFuentes();
        Scanner scanner = new Scanner(System.in);
        System.out.println(fuentes);
        System.out.println("Elije una noticia:");
        String nombre = scanner.nextLine();
        List<Noticia> noticias = DAOFactory.getInstance().getDAOFuentes().busca(nombre);
        noticias.forEach(noticia -> {
            System.out.println(noticia.getTitulo());
            System.out.println(noticia.getDescripcion());
            System.out.println(noticia.getEnlace());
        });
    }
}
