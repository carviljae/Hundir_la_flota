import java.util.Scanner;

public class Barcos {
    String[] portaaviones = new String[5];
    String[] destructor = new String[4];
    String[] submarino = new String[3];
    String[] pesquero = new String[1];
    public static void coordenadaBarco(){

        Entrada.pideCoordenada();
    }
    public static void posicionBarco(){
        Scanner sc = new Scanner(System.in);
        String pos;
        System.out.println("Quieres el barco en posición Vertical(V) u Horizontal(H)?");
        pos = sc.next();
        colocarBarco(pos);
    }
    public static void colocarBarco(String pos){
        if (pos=="V"){
         // vertical(tablero, coordenadas);
        } else if (pos=="H") {

        }else
            System.out.println("LEE BIEN");
    }
    public static void vertical(char[][]tablero,String coordenadas){

    }
}
