import java.util.Scanner;
public class entrada {
    public static void pidecoordenada(){
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        System.out.println("Introduce una coordenada: ");
        coordenadas = sc.next();
        tamañocoordenada(coordenadas);
        caractercoordenada(coordenadas);
        numerocoordenada(coordenadas);
    }
    public static void tamañocoordenada(String coordenadas) {
        if (coordenadas.length() == 2) {
            System.out.println("Coordenada del tamaño correcto");
        } else {
            System.out.println("Coordenada del tamaño equivocado");
            pidecoordenada();
        }
    }
    public static void caractercoordenada(String coordenadas){
        if (coordenadas.charAt(0)<='K' && coordenadas.charAt(0)>='A' || coordenadas.charAt(0)<='k' && coordenadas.charAt(0)>='a'){
            System.out.println("El primer caracter es una letra");
        }else {
            System.out.println("El primer caracter no es letra o esta fuera del rango");
            pidecoordenada();
        }
    }
    public static void numerocoordenada(String coordenadas){
        if (coordenadas.charAt(1)<=57 && coordenadas.charAt(1)>=48){
            System.out.println("El segundo caracter si es numero");
        }else {
            System.out.println("El segundo caracter no es numero");
            pidecoordenada();
        }
    }
}
