import java.util.Scanner;
public class Prueba {
        static int[] barcos = {5,4,2,1};
        //Pide la coordenada para cada barco a colocar
    public static void posicionBarco(char[][] tablero, int[] barcos){
        for (int i=0;i< barcos.length;i++){
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Dime la coordenada donde quieres el barco " + barcos[i] + " casillas"+ ANSI_RESET);
            coordenadaBarco();
            pidePosicionBarco(tablero);
        }
    }
    //Pide una coordenada
        public static void coordenadaBarco(){
            Entrada.pideCoordenada();
        }
        //Pregunta la posición a colocar los barcos
    public static void pidePosicionBarco(char[][] tablero){
        Scanner sc = new Scanner(System.in);
        String pos;
        System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Quieres el barco en posición Vertical(V) u Horizontal(H)?"+ ANSI_RESET);
        pos = sc.next();
        verticalHorizontal(pos);
        crearBarco(pos, tablero);
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
        public static void crearBarco(String pos, char[][] tablero) {
        //int k=coordenadas.charAt(0)-'A';
            if (pos.compareTo("V")==0) {
                for (int i=0; i<barcos.length;i++) {
                    tablero[i][0]='*';
                }
                Mostrar.mostrarTableroJugador(tablero, tablero);
                }else if (pos.compareTo("H")==0){
                    for (int i=0; i<barcos.length;i++) {
                    System.out.print(tablero[0][i]+" ");
                    }
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