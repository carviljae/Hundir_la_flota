import java.util.Scanner;
public class Disparos {
    //PIDE UNA COORDENADA PARA DISPARAR
    public static void pideCoordendaDisparo(char[][] tablero, char[][] tableroDisparoJugador,char[][] tableroPC, char[][]tableroDisparosPC, String coordenadas){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i< 20;i++){
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Introduce una coordenada de disparo: " + ANSI_RESET);
            coordenadas = sc.next().toUpperCase();
            compruebaCoordenadaDisparo(coordenadas);
            disparosJugador(tablero, tableroDisparoJugador,tableroPC,tableroDisparosPC, coordenadas);
        }
    }
    //COMPRUEBA QUE LA COORDENADA DEL DISPARO SEA CORRECTA
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
    //MARCA LA COORDENADA DICHA ANTERIORMENTE PARA "DEFINIR" EL DISPARO
    public static void disparosJugador(char[][] tablero, char[][]tableroDisparosJugador, char[][] tableroPC, char[][]tableroDisparosPC, String coordenadas) {

            tableroDisparosJugador[coordenadas.charAt(0) - 'A'][coordenadas.charAt(1) - '0'] = '*';
            tableroPC[coordenadas.charAt(0) - 'A'][coordenadas.charAt(1) - '0'] = '*';

            Mostrar.crearTablero(tablero, tableroDisparosJugador);
            Mostrar.crearTablero(tableroPC,tableroDisparosPC);
    //DECIR TOCADO O AGUA SEGUN DONDE IMPACTE
        if (tableroPC[coordenadas.charAt(0) - 'A'][coordenadas.charAt(1) - '0'] == tableroDisparosJugador[coordenadas.charAt(0) - 'A'][coordenadas.charAt(1) - '0'] && tableroPC[coordenadas.charAt(0) - 'A'][coordenadas.charAt(1) - '0'] == '#') {
            System.out.println(ANSI_BLACK_BACKGROUND+"Tocado"+ANSI_RESET);
            tableroDisparosJugador[coordenadas.charAt(0) - 'A'][coordenadas.charAt(1) - '0'] = 'x';
        } else {
            System.out.println(ANSI_BLACK_BACKGROUND+"Agua\n"+ANSI_RESET);
        }
    }
    //DISPAROS DEL PC
    public static void disparosPc(char[][] x, char[][] y, int[] barcos) {

            int letra =(int)(Math.random()*9);
            int num = (int)(Math.random()*9);
            y[letra][num] = '#';
            if (x[letra][num] == y[letra][num] && x[letra][num] == '#') {
                System.out.println(ANSI_BLACK_BACKGROUND+"Tocado\n"+ANSI_RESET);
            }
            else {
                System.out.println(ANSI_BLACK_BACKGROUND+"Agua\n"+ANSI_RESET);
            }
    }

    //CODIGOS PARA USAR LOS COLORES
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED = "\u001B[31m";
}
