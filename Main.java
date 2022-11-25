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
        String pos="";

        Mostrar.rellenarTablero(tableroJugador);
        Mostrar.rellenarTablero(tableroDisparosJugador);
        Mostrar.rellenarTablero(tableroPC);
        Mostrar.rellenarTablero(tableroDisparosPC);
        Prueba.colocarBarcosPC(tableroPC,barcos);


        Mostrar.mostrarTablero(tableroJugador, tableroDisparosJugador);
        Mostrar.mostrarTablero(tableroPC,tableroDisparosPC);

        Test.posicionBarco(tableroJugador,barcos,tableroJugador,coordenadas);
        Disparos.pideCoordendaDisparo(tableroJugador,tableroDisparosJugador,tableroPC,tableroDisparosPC, coordenadas);
    }
}