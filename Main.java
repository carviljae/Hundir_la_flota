import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[][] tablero = new char[11][11];
        char[][] tableroDisparosJugador = new char[11][11];
        char[][] tableroPC = new char[11][11];
        char[][] tableroDisparosPC = new char[11][11];

        Mostrar.rellenarTablero(tablero, tableroDisparosJugador);
        Mostrar.rellenarTableroPC(tableroPC, tableroDisparosPC);

        Mostrar.mostrarTablero(tablero, tableroDisparosJugador);
        Mostrar.mostrarTablero2(tableroPC, tableroDisparosPC);

        Entrada.pidecoordenada();
    }
}