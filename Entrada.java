import java.util.Scanner;

public class Entrada {

    //Pide una coordenada y llama a los metodos para comprobar que esté correcta
    public static String pideCoordenada(){
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Introduce una coordenada: " + ANSI_RESET);
        coordenadas = sc.next().toUpperCase();

        if(!esCorrectoTamanyo(coordenadas)){
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_RED+"ERROR"+ANSI_RESET);
            pideCoordenada();
        } else if(!primerCaracterLetra(coordenadas)){
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_RED+"ERROR"+ANSI_RESET);
            pideCoordenada();
        } else if (!segundoCaracterNumero(coordenadas)) {
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_RED+"ERROR"+ANSI_RESET);
            pideCoordenada();
        } else
            System.out.println(ANSI_BLACK_BACKGROUND+ANSI_GREEN+"Coordenada aceptada"+ ANSI_RESET);
        return coordenadas;
    }

    //Comprueba que el tamaño de la coordenada sea 2
    public static boolean esCorrectoTamanyo(String coordenadas) {
        if (coordenadas.length() == 2) {
            return true;
        } else {
            return false;
        }
    }
    //Comprueba que el primer caracter de la coordenada sea una letra entre la A y la K
    public static boolean primerCaracterLetra(String coordenadas){
        if (coordenadas.charAt(0)<='K' && coordenadas.charAt(0)>='A'){
            return true;
        }else {
            return false;
        }
    }
    //Comprueba que el segundo caracter de la coordenada sea un numero entre el 0 y el 9
    public static boolean segundoCaracterNumero(String coordenadas){
        if (coordenadas.charAt(1)<=57 && coordenadas.charAt(1)>=48){
            return true;
        }else {
            return false;
        }
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED = "\u001B[31m";
}
