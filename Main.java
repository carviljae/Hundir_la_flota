import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[][] tablero = new char[11][11];
        char[][] tableroDisparosJugador = new char[11][11];
        char[][] tableroPC = new char[11][11];
        char[][] tableroDisparosPC = new char[11][11];

        mostrar.rellenarTablero(tablero, tableroDisparosJugador);
        mostrar.rellenarTableroPC(tableroPC, tableroDisparosPC);

        mostrar.mostrarTablero(tablero, tableroDisparosJugador);
        mostrar.mostrarTablero2(tableroPC, tableroDisparosPC);

        prueba2.pidecoordenada();
    }
}