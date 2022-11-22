public class Mostrar {
    //Muestra los tableros del PC
    static void mostrarTableroPC(char[][] tableroPC, char[][] tableroDisparosPC) {
        char letra = 'A';

        for (int i = 0; i < tableroPC.length; i++, letra++) {
            for (int q = 0; q < 2; q++) {
                System.out.print(ANSI_BLUE+"        " + letra + "  ");
                for (int h = 0; h < tableroPC.length - 1; h++) {
                    System.out.print(tableroPC[h][i] + "  ");
                }
            }
            System.out.println();
        }
        for (int t = -1; t < tableroPC.length - 1; t++) {
            if (t == -1) {
                System.out.print("         ");
            } else {
                System.out.print("  " + t);
            }
        }
        for (int t = -1; t < tableroPC.length - 1; t++) {
            if (t == -1) {
                System.out.print("           ");
            } else {
                System.out.print("  " + t);
            }
        }
        System.out.println();
        System.out.println();
    }
    //Muestra los tableros del jugador
    static void mostrarTableroJugador(char[][] tablero, char[][] tableroDisparosJugador) {
        char letra = 'A';

        for (int i = 0; i < tablero.length; i++, letra++) {
            for (int q = 0; q < 2; q++) {

                System.out.print(ANSI_BLUE+"        " + letra + "  ");
                for (int h = 0; h < tablero.length - 1; h++) {

                    System.out.print(tablero[h][i] + "  ");
                }
            }
            System.out.println();
        }
        for (int t = -1; t < tablero.length - 1; t++) {
            if (t == -1) {
                System.out.print("         ");
            } else {
                System.out.print(ANSI_BLUE+"  " + t + ANSI_RESET);
            }
        }
        for (int t = -1; t < tablero.length - 1; t++) {
            if (t == -1) {
                System.out.print("           ");
            } else {
                System.out.print(ANSI_BLUE+"  " + t + ANSI_RESET);
            }
        }
        System.out.println();
        System.out.println();
    }
    //Rellena los tableros del jugador
    static void rellenarTableroJugador(char[][] tablero, char[][] tableroDisparosJugador) {
        for (int k = 0; k < tablero[0].length; k++) {
            for (int x = 0; x < 10; x++) {
                tablero[x][k] = '~';
            }
        }
    }
    //Rellena los tableros del PC
    static void rellenarTableroPC(char[][] tableroPC, char[][] tableroDisparosPC) {
        for (int k = 0; k < tableroPC[0].length; k++) {
            for (int x = 0; x < 10; x++) {
                tableroPC[x][k] = '~';
            }
        }
    }
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
}