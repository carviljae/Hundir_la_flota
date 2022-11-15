import java.util.Scanner;

public class disparos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        boolean disparo=false;
        char letra='A';
        int num=1;

        System.out.println("Dime las coodenadas: ");
        coordenadas = sc.next();
        while (disparo)
            if (coordenadas.charAt(0) == letra && coordenadas.charAt(1) == num){

            }
    }

}
