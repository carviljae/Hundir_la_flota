import java.util.Scanner;
public class Test {
    static int[] barcos = {5,4,2,1};
    //Pide la coordenada para cada barco a colocar
    public static void posicionBarco(char[][] tablero, int[] barcos,String coordenadas){
        for (int i=0;i< barcos.length;i++){
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Dime la coordenada donde quieres el barco " + barcos[i] + " casillas"+ ANSI_RESET);
            coordenadaBarco(coordenadas);
            Scanner sc = new Scanner(System.in);
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Introduce una coordenada: " + ANSI_RESET);
            coordenadas = sc.next().toUpperCase();
            compruebaCoordenadaBarco(coordenadas);
            pidePosicionBarco(tablero, coordenadas);
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
    //Pide una coordenada
    public static void coordenadaBarco(String coordenadas){
        // Entrada.pideCoordenada();
            /*Scanner sc = new Scanner(System.in);

            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Introduce una coordenada: " + ANSI_RESET);
            coordenadas = sc.next().toUpperCase();
            return coordenadas;*/
    }
    //Pregunta la posición a colocar los barcos
    public static void pidePosicionBarco(char[][] tablero,String coordenadas){
        Scanner sc = new Scanner(System.in);
        String pos;
        System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Quieres el barco en posición Vertical(V) u Horizontal(H)?"+ ANSI_RESET);
        pos = sc.next();
        verticalHorizontal(pos);
        crearBarco(pos, tablero, coordenadas);
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
    public static void crearBarco(String pos, char[][] tablero, String coordenadas) {


        if (pos.compareTo("V")==0) {
            for (int i=0; i<barcos.length;i++) {
                tablero[coordenadas.charAt(1)-48][coordenadas.charAt(0)-65]='*';
            }
            Mostrar.mostrarTablero(tablero, tablero);
        }else if (pos.compareTo("H")==0){
            for (int i=0; i<barcos.length;i++) {
                tablero[i][0] = '*';
            }
            Mostrar.mostrarTablero(tablero, tablero);

        }else {
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_RED+"LEE BIEN"+ ANSI_RESET);
        }
    }
    //Colocamos el barco en el tablero
    public static void colocarBarco(String pos, char[][] tablero){

    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED = "\u001B[31m";
}