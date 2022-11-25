import java.util.Scanner;
public class Test {
    static int[] barcos = {5,4,2,1};
    //Pide la coordenada para cada barco a colocar
    public static void posicionBarco(char[][] tablero, int[] barcos, char[][]tableroDisparosJugador,String coordenadas){
        for (int i=0;i< barcos.length;i++){
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Dime la coordenada donde quieres el barco " + barcos[i] + " casillas"+ ANSI_RESET);
            Scanner sc = new Scanner(System.in);
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Introduce una coordenada: " + ANSI_RESET);
            coordenadas = sc.next().toUpperCase();
            compruebaCoordenadaBarco(coordenadas);
            pidePosicionBarco(tablero,tableroDisparosJugador,barcos, coordenadas);
        }
    }
    public static String compruebaCoordenadaBarco(String coordenadas){
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

    public static void pidePosicionBarco(char[][] tablero,char[][]tableroDisparosJugador, int[]barcos,String coordenadas){
        Scanner sc = new Scanner(System.in);
        String pos;
        System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Quieres el barco en posición Vertical(V) u Horizontal(H)?"+ ANSI_RESET);
        pos = sc.next();
        verticalHorizontal(pos);
    }
    //Comprueba que le dicen correctamente la posición
    public static boolean verticalHorizontal(String pos){
        if (pos.compareTo("V")==0){
            System.out.println("vertical");
            return true;
        }else if(pos.compareTo("H")==0){
            System.out.println("horizontal");
            return true;
        }else{
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_RED+"error"+ANSI_RESET);
            return false;
        }
    }
    //Creamos el barco
    public static void crearBarco(String pos,int[]barcos, char[][] tableroJugador,char[][]tableroDisparosJugador, String coordenadas) {
        int sumV = 0;
        int sumH = 0;
        for (int cont=0;cont< barcos.length;cont++){
            if (pos.compareTo("V")==0) {
                for (int q=0;q<1;q++){
                    if ((coordenadas.charAt(1)-'0'-3)+barcos[q] <= tableroJugador[1].length){
                        for (int i = 0; i < barcos[cont]; i++) {
                            tableroJugador[coordenadas.charAt(0) - 'A' + sumV][coordenadas.charAt(1) - '0'] = '#';
                            sumV++;
                        }
                    } else{
                        cont--;
                    }
                }
                Mostrar.mostrarTablero(tableroJugador, tableroDisparosJugador);
            }else if (pos.compareTo("H")==0){
                for (int q=0;q<1;q++) {
                    if ((coordenadas.charAt(1) - '0' - 3) + barcos[q] <= tableroJugador[1].length) {
                        for (int i = 0; i < barcos[cont]; i++) {
                            tableroJugador[coordenadas.charAt(0) - 'A'][coordenadas.charAt(1) - '0'+sumH] = '#';
                            sumV++;
                        }
                    } else {
                        cont--;
                    }
                }
                Mostrar.mostrarTablero(tableroJugador, tableroDisparosJugador);

            }else {
                System.out.println(ANSI_BLACK_BACKGROUND+ANSI_RED+"LEE BIEN"+ ANSI_RESET);
            }
        }
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED = "\u001B[31m";
}