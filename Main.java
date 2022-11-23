import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos las variables
        char[][] tablero = new char[10][10];
        char[][] tableroDisparosJugador = new char[10][10];
        char[][] tableroPC = new char[10][10];
        char[][] tableroDisparosPC = new char[10][10];
        int[] barcos = {5,4,2,1};
        String coordenadas="";

        //Rellenamos los tableros con ~
        Mostrar.rellenarTableroJugador(tablero, tableroDisparosJugador);
        Mostrar.rellenarTableroPC(tableroPC, tableroDisparosPC);

        //Mostramos los tableros enteros
       Mostrar.mostrarTableroJugador(tablero, tableroDisparosJugador);
        Mostrar.mostrarTableroPC(tableroPC, tableroDisparosPC);




        //Nos pide saber la coordenada del barco y su orientacion
        Prueba.pideCoordendaDisparo(tablero, coordenadas);
    }
}