import java.util.Scanner;

public class barcos {
    String[] portaaviones = new String[5];
    String[] destructor = new String[4];
    String[] submarino = new String[3];
    String[] pesquero = new String[1];
    public static void coordenadabarco(){
        entrada.pidecoordenada();
    }
    public static void posicionbarco(){
        Scanner sc = new Scanner(System.in);
        String pos;
        System.out.println("Quieres el barco en posición Vertical(V) u Horizontal(H)?");
        pos = sc.next();
        colocarbarco(pos);
    }
    public static void colocarbarco(String pos){
        if (pos=="V"){
           // vertical(tablero, coordenadas);
        } else if (pos=="H") {

        }else
            System.out.println("LEE BIEN");
    }
    //public static void vertical(char[][]tablero,String coordenadas){

    //}
}
