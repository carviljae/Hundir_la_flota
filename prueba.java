import java.util.Scanner;
public class prueba {

    public static boolean compruebaCoordenadas(char[][] tablero, char[][] tableroDisparosJugador){
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        String coordenadas;
        System.out.println("Introduce una coordenada: ");
        coordenadas = sc.next();

        if(Character.isLetter(coordenadas.charAt(0)) && Character.isDigit(coordenadas.charAt(1))&&coordenadas.length()==2){
            correcto = true;
            System.out.println("coordenada  valida");
            if (coordenadas.charAt(1)>=0&&coordenadas.charAt(1)< tablero.length)
            System.out.println("coordenada  valida");
            if (coordenadas.charAt(0)<'A' && coordenadas.charAt(0)> tablero.length) {
                correcto = false;
                System.out.println("coordenada  no valida");
            }
        }else if (coordenadas.charAt(0)<'A' && coordenadas.charAt(0)> tablero.length){
            correcto = false;
            System.out.println("coordenada  no valida");
        }else
            System.out.println("coordenada  no valida");

        return correcto;
    }
}
