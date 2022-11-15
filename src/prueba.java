public class prueba {
    public static void main(String[] args) {
        char[][] tablero = new char[11][11];
        char[][] tablero1 = new char[11][11];
        char[][] tableroPC = new char[11][11];
        char[][] tableroPC1 = new char[11][11];

        rellenarTablero(tablero,tablero1);
        rellenarTableroPC(tableroPC, tableroPC1);
        mostrarTablero(tablero, tablero1);
        mostrarTablero2(tableroPC, tableroPC1);
       // limpiarConsola();

    }

    //public static void limpiarConsola(){
      //  System.out.print("\033[H\033[2J");
        //System.out.flush();
    //}
    private static void mostrarTablero2(char[][] tableroPC, char[][] tableroPC1) {
        char letra = 'A';


        for (int i = 0; i < tableroPC.length; i++, letra++) {
            System.out.print(letra + "  ");

            for (int j = 0; j < tableroPC.length - 1; j++) {
                System.out.print(tableroPC[j][i] + "  ");

            }

            System.out.println();
        }
        for (int t = 0; t < tableroPC.length; t++) {
            System.out.print(t + "  ");
        }
        System.out.println();
        System.out.println();
        char letras = 'A';
        for (int i = 0; i < tableroPC.length; i++, letras++) {
            System.out.print(letras + "  ");
            for (int j = 0; j < tableroPC.length - 1; j++) {
                System.out.print(tableroPC[j][i] + "  ");
            }
            System.out.println();
        }
        for (int t = 0; t < tableroPC.length; t++) {
            System.out.print(t + "  ");
        }

    }


    private static void rellenarTablero(char[][] tablero, char[][] tablero1) {
        for (int k = 0; k < tablero[0].length; k++) {
            for (int x = 0; x < 10; x++) {
                tablero[x][k] = '~';

            }
        }
    }
    private static void rellenarTableroPC( char[][] tableroPC, char[][] tableroPC1) {
        for (int k = 0; k < tableroPC[0].length; k++) {
            for (int x = 0; x < 10; x++) {
                tableroPC[x][k] = '~';

            }
        }
    }

    private static void mostrarTablero(char[][] tablero, char[][] tablero1) {
        char letra = 'A';

        for (int i = 0; i < tablero.length; i++, letra++) {
            System.out.print(letra + "  ");
            for (int j = 0; j < tablero.length - 1; j++) {
                System.out.print(tablero[j][i] + "  ");

            }
            System.out.println();
        }
        for (int t = 0; t < tablero.length; t++) {
            System.out.print(t + "  ");

        }

        System.out.println();
        System.out.println();
        char letras = 'A';
        for (int i = 0; i < tablero.length; i++, letras++) {
            System.out.print(letras + "  ");
            for (int j = 0; j < tablero.length - 1; j++) {
                System.out.print(tablero[j][i] + "  ");
            }
            System.out.println();
        }
        for (int t = 0; t < tablero.length; t++) {
            System.out.print(t + "  ");
        }
        System.out.println();
        System.out.println();
    }
}
