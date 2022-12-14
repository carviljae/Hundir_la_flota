import java.util.Scanner;
public class Test {
    static int[] barcos = {5,4,2,1};
    //Pide la coordenada para cada barco a colocar
    public static void posicionBarco(String pos,char[][] tableroJugador, int[] barcos, char[][]tableroDisparosJugador,String coordenadas){
        for (int i=0;i< barcos.length;i++){
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Dime la coordenada donde quieres el barco " + barcos[i] + " casillas"+ ANSI_RESET);
            Scanner sc = new Scanner(System.in);
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Introduce una coordenada: " + ANSI_RESET);
            coordenadas = sc.next().toUpperCase();
            compruebaCoordenadaBarco(coordenadas);
            pos=pidePosicionBarco(tableroJugador,tableroDisparosJugador,barcos, coordenadas);
            crearBarco(pos,barcos,tableroJugador,tableroDisparosJugador,coordenadas);
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

    public static String pidePosicionBarco(char[][] tablero,char[][]tableroDisparosJugador, int[]barcos,String coordenadas){
        Scanner sc = new Scanner(System.in);
        String pos;
        System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Quieres el barco en posición Vertical(V) u Horizontal(H)?"+ ANSI_RESET);
        pos = sc.next();
        while (!verticalHorizontal(pos)) {
            System.out.println("Posición invalida, repitela");
            pos = sc.next();
        }
        return pos;
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
        Scanner sc = new Scanner(System.in);
        char letraInicio = 'A';
        char letraFinal = 'J';
        char numeroInicio = '0';
        for (int contador = 0; contador < barcos.length; contador++) {
            int letra = coordenadas.charAt(0) - letraInicio;
            int num = coordenadas.charAt(1) - numeroInicio;
            int sum = 0;
            int sum2 = 0;
            if (pos.compareTo("V")==0) {
                //for (int i = 0; i < 1; ++i) {
                    int num2=barcos[contador];
                    for (int j=0;j<num2;num2--){
                        tableroJugador[letra+ sum][num] = '#';
                        sum++;
                        System.out.println(num2);
                    }

                   /* if ((num - 3) + barcos[i] < tableroJugador[1].length) {
                        for (int j = 0; j < barcos[contador]; ++j) {
                            tableroJugador[letra+ sum][num] = '#';
                            ++sum;
                        }
                    } else {
                        contador--;
                    }*/

               // }
                Mostrar.crearTablero(tableroJugador,tableroDisparosJugador);
            } else if (pos.compareTo("H")==0) {
                for (int i = 0; i < 1; ++i) {
                    if ((num - 3) + barcos[i] <= tableroJugador[1].length) {
                        for (int j = 0; j < barcos[contador]; ++j) {
                            tableroJugador[coordenadas.charAt(1) - numeroInicio][letra + sum2] = '#';
                            ++sum2;
                        }
                    } else {
                        contador--;
                    }

                }
            } else{
                contador--;
            }
        }
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED = "\u001B[31m";
}