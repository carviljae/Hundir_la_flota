import java.util.Scanner;
public class Prueba {
        String[] portaaviones = new String[5];
        static String[] destructor = new String[4];
        String[] submarino = new String[3];
        String[] pesquero = new String[1];
        public static void coordenadabarco(){
            System.out.println("posicion barco ");
            Entrada.pideCoordenada();

        }
    public static void pidePosicionBarco(char[][] tablero){
        Scanner sc = new Scanner(System.in);
        String pos;
        System.out.println("Quieres el barco en posición Vertical(V) u Horizontal(H)?");
        pos = sc.next();
        colocarbarco(pos, tablero);
    }

        public static void posicionbarco(char[][] tablero){

            coordenadabarco();
            pidePosicionBarco(tablero);

        }
        public static void colocarbarco(String pos, char[][] tablero) {
            if (pos.compareTo("V")==0) {
                for (int i=0; i<destructor.length;i++) {
                    System.out.println(tablero[i][0]);
                }
                }else if (pos.compareTo("H")==0){
               //String coodenadas = Entrada.pideCoordenada();
                //for (int p= coordenadas.charAt[0], l = coordenadas.charAt[1]; l< destructor.length; l++) {
                         //   tablero[p][l] = '*';
                       // }
                    //}

                }else {
                System.out.println("LEE BIEN");
            }

        }
       // public static void vertical(char[][]tablero,String coordenadas){

      //  }
}

