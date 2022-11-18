import java.util.Scanner;
public class prueba2 {

    public static boolean compruebaCoordenadas(char[][] tablero, char[][] tableroDisparosJugador){
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        System.out.println("Introduce una coordenada: ");
        coordenadas = sc.next();

        tamañocoordenada(coordenadas);
        caractercoordenada(coordenadas);
        numerocoordenada(coordenadas);
        return compruebaCoordenadas(tablero,tableroDisparosJugador);
    }
    public static void pidecoordenada(){
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        System.out.println("Introduce una coordenada: ");
        coordenadas = sc.next();
    }
    public static void tamañocoordenada(String coordenadas){
        boolean correcto = false;
        if (coordenadas.length()==2) {
            correcto = true;
        }else
            correcto=false;
        System.out.println("Coordenada del tamaño equivocado");
    }
    public static void caractercoordenada(String coordenadas){
        boolean correcto = false;
        if (coordenadas.charAt(0)<'K'){
            correcto=true;
        }else
            correcto=false;
        System.out.println("El primer caracter no es letra");
    }
    public static void numerocoordenada(String coordenadas){
        boolean correcto = false;
        if (coordenadas.charAt(1)<10){
            correcto=true;
        }else
            correcto=false;
        System.out.println("El segundo caracter no es numero");
    }

}
