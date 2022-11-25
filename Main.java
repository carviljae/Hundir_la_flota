import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CREAMOS LAS VARIABLES
        char[][] tableroJugador = new char[10][10];
        char[][] tableroDisparosJugador = new char[10][10];
        char[][] tableroPC = new char[10][10];
        char[][] tableroDisparosPC = new char[10][10];
        int[] barcos = {5,4,2,1};
        String coordenadas="";
        String pos="";
        int posi=0;
        //RELLENA LOS TABLEROS
        Mostrar.rellenarTablero(tableroJugador);
        Mostrar.rellenarTablero(tableroDisparosJugador);
        Mostrar.rellenarTablero(tableroPC);
        Mostrar.rellenarTablero(tableroDisparosPC);
        //COLOCA LOS BARCOS DEL PC
        Barcos.colocarBarcosPC(tableroPC,barcos);
        //MUESTRA LOS TABLEROS
        Mostrar.crearTablero(tableroJugador,tableroDisparosJugador);
        Mostrar.crearTablero(tableroPC,tableroDisparosPC);

        Test.posicionBarco(pos,tableroJugador,barcos,tableroJugador,coordenadas);
        Disparos.pideCoordendaDisparo(tableroJugador,tableroDisparosJugador,tableroPC,tableroDisparosPC, coordenadas);
    }
}