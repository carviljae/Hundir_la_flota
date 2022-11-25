import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos las variables
        char[][] tableroJugador = new char[10][10];
        char[][] tableroDisparosJugador = new char[10][10];
        char[][] tableroPC = new char[10][10];
        char[][] tableroDisparosPC = new char[10][10];
        int[] barcos = {5,4,2,1};
        String coordenadas="";

        Mostrar.rellenarTablero(tableroJugador);
        Mostrar.rellenarTablero(tableroDisparosJugador);
        Mostrar.rellenarTablero(tableroPC);
        Mostrar.rellenarTablero(tableroDisparosPC);

        Mostrar.mostrarTablero(tableroJugador, tableroDisparosJugador);
        Mostrar.mostrarTablero(tableroPC,tableroDisparosPC);


        Disparos.pideCoordendaDisparo(tableroJugador,tableroDisparosJugador,tableroPC,tableroDisparosPC, coordenadas);
    }
}