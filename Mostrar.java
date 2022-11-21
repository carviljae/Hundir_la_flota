public class Mostrar {
    static void mostrarTablero2(char[][] tableroPC, char[][] tableroDisparosPC) {
        char letra = 'A';

        for (int i = 0; i < tableroPC.length; i++, letra++) {
            for (int q = 0; q < 2; q++) {
                System.out.print("        " + letra + "  ");
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
    static void rellenarTablero(char[][] tablero, char[][] tableroDisparosJugador) {
        for (int k = 0; k < tablero[0].length; k++) {
            for (int x = 0; x < 10; x++) {
                tablero[x][k] = '~';
            }
        }
    }
    static void rellenarTableroPC(char[][] tableroPC, char[][] tableroDisparosPC) {
        for (int k = 0; k < tableroPC[0].length; k++) {
            for (int x = 0; x < 10; x++) {
                tableroPC[x][k] = '~';
            }
        }
    }
    static void mostrarTablero(char[][] tablero, char[][] tableroDisparosJugador) {
        char letra = 'A';

        for (int i = 0; i < tablero.length; i++, letra++) {
            for (int q = 0; q < 2; q++) {

                System.out.print("        " + letra + "  ");
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
                System.out.print("  " + t);
            }
        }
        for (int t = -1; t < tablero.length - 1; t++) {
            if (t == -1) {
                System.out.print("           ");
            } else {
                System.out.print("  " + t);
            }
        }
        System.out.println();
        System.out.println();
    }
}