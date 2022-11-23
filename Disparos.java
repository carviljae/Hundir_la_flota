import java.util.Scanner;

public class Disparos {
    public static void pideCoordendaDisparo(char[][] tablero, String coordenadas){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i< 20;i++){
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Introduce una coordenada de disparo: " + ANSI_RESET);
            coordenadas = sc.next().toUpperCase();
            compruebaCoordenadaDisparo(coordenadas);
            disparo(tablero, coordenadas);
        }
    }
    public static String compruebaCoordenadaDisparo(String coordenadas){
        if(!Entrada.esCorrectoTamanyo(coordenadas)){
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_RED+"ERROR"+ANSI_RESET);
            Entrada.pideCoordenada();
        } else if(!Entrada.primerCaracterLetra(coordenadas)){
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_RED+"ERROR"+ANSI_RESET);
            Entrada.pideCoordenada();
        } else if (!Entrada.segundoCaracterNumero(coordenadas)) {
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_RED+"ERROR"+ANSI_RESET);
            Entrada.pideCoordenada();
        } else
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Coordenada aceptada"+ ANSI_RESET);
        return coordenadas;

    }


    public static void disparo( char[][] tablero, String coordenadas) {
        for (int i = 0; i < 20; i++) {
            tablero[coordenadas.charAt(1) - 48][coordenadas.charAt(0) - 65] = '*';
        }
        Mostrar.mostrarTableroJugador(tablero, tablero);
    }


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED = "\u001B[31m";
}
