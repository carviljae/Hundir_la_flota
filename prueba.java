import java.util.Scanner;
public class prueba {

    public static boolean compruebaCoordenadas(char[][] tablero, char[][] tableroDisparosJugador){
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        String coordenadas;
        System.out.println("Introduce una coordenada: ");
        coordenadas = sc.next();

        if (coordenadas.length()==2 && coordenadas.charAt(0) == 'A'+ tablero.length  ){
            correcto=true;
            System.out.println("coordenada valida");
        }
        else {
            correcto = false;
            System.out.println("coordenada no valida");
        }

        return correcto;
    }
}
