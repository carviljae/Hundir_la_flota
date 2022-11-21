import java.util.Scanner;
public class Entrada {
    public static void pidecoordenada(){
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        System.out.println("Introduce una coordenada: ");
        coordenadas = sc.next().toUpperCase();

        if(!esCorrectoTamanyo(coordenadas)){
            pidecoordenada();
        } else if(!primerCaracterLetra(coordenadas)){
            pidecoordenada();
        } else if (!segundoCaracterNumero(coordenadas)) {
            pidecoordenada();
        } else
            pidecoordenada();
    }
    public static boolean esCorrectoTamanyo(String coordenadas) {
        if (coordenadas.length() == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean primerCaracterLetra(String coordenadas){
        if (coordenadas.charAt(0)<='K' && coordenadas.charAt(0)>='A'){
            return true;
        }else {
            return false;
        }
    }
    public static boolean segundoCaracterNumero(String coordenadas){
        if (coordenadas.charAt(1)<=57 && coordenadas.charAt(1)>=48){
            return true;
        }else {
            return false;
        }
    }
}
