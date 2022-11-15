public class prueba {
    public static void main(String[] args) {
        char[][] tablero = new char[11][11];
        char[][] tableroDisparosJugador = new char[11][11];
        char[][] tableroPC = new char[11][11];
        char[][] tableroDisparosPC = new char[11][11];

        rellenarTablero(tablero, tableroDisparosJugador);
        rellenarTableroPC(tableroPC, tableroDisparosPC);

        mostrarTablero(tablero, tableroDisparosJugador);
        mostrarTablero2(tableroPC, tableroDisparosPC);


    }

    private static void mostrarTablero2(char[][] tableroPC, char[][] tableroDisparosPC) {
        char letra = 'A';


        for (int i = 0; i < tableroPC.length; i++) {
            System.out.print(letra + "  ");
            letra++;
            for (int j = 0; j < tableroPC.length - 1; j++) {
                System.out.print(tableroPC[j][i] + "  ");

            }
            System.out.println();
        }
        for (int t = -1; t < tableroPC.length - 1; t++) {

            if (t == -1) {
                System.out.print(" ");
            } else {
                System.out.print("  " + t);
            }

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
        for (int t = -1; t < tableroPC.length - 1; t++) {

            if (t == -1) {
                System.out.print(" ");
            } else {
                System.out.print("  " + t);
            }
        }
    }


    private static void rellenarTablero(char[][] tablero, char[][] tableroDisparosJugador) {
        for (int k = 0; k < tablero[0].length; k++) {
            for (int x = 0; x < 10; x++) {
                tablero[x][k] = '~';

            }
        }
    }

    private static void rellenarTableroPC(char[][] tableroPC, char[][] tableroDisparosPC) {
        for (int k = 0; k < tableroPC[0].length; k++) {
            for (int x = 0; x < 10; x++) {
                tableroPC[x][k] = '~';

            }
        }
    }

    private static void mostrarTablero(char[][] tablero, char[][] tableroDisparosJugador) {
        char letra = 'A';

        for (int i = 0; i < tablero.length; i++, letra++) {
            System.out.print(letra + "  ");
            for (int j = 0; j < tablero.length - 1; j++) {
                System.out.print(tablero[j][i] + "  ");

            }
            System.out.println();
        }
        for (int t = -1; t < tablero.length - 1; t++) {

            if (t == -1) {
                System.out.print(" ");
            } else {
                System.out.print("  " + t);
            }


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
        for (int t = -1; t < tablero.length - 1; t++) {

            if (t == -1) {
                System.out.print(" ");
            } else {
                System.out.print("  " + t);
            }
        }
        System.out.println();
        System.out.println();
    }
}
