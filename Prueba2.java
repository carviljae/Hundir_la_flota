public class Prueba2 {
static void mostrarTableroPC(char[][] tableroPC) {
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
            System.out.print("           ");
        } else {
            System.out.print("  " + t);
        }
    }
    for (int t = -1; t < tableroPC.length - 1; t++) {
        if (t == -1) {
            System.out.print("         ");
        } else {
            System.out.print("  " + t);
        }
    }
    System.out.println();
    System.out.println();
}
    static void mostrarTableroDisparosPC(char[][] tableroDisparosPC) {
        char letra = 'A';

        for (int i = 0; i < tableroDisparosPC.length; i++, letra++) {
            for (int q = 0; q < 2; q++) {
                System.out.print("        " + letra + "  ");
                for (int h = 0; h < tableroDisparosPC.length - 1; h++) {
                    System.out.print(tableroDisparosPC[h][i] + "  ");
                }
            }
            System.out.println();
        }
        for (int t = -1; t < tableroDisparosPC.length - 1; t++) {
            if (t == -1) {
                System.out.print("           ");
            } else {
                System.out.print("  " + t);
            }
        }
        for (int t = -1; t < tableroDisparosPC.length - 1; t++) {
            if (t == -1) {
                System.out.print("         ");
            } else {
                System.out.print("  " + t);
            }
        }
        System.out.println();
        System.out.println();
    }
    static void mostrarTableroJugador(char[][] tableroJugador) {
        char letra = 'A';

        for (int i = 0; i < tableroJugador.length; i++, letra++) {
            for (int q = 0; q < 2; q++) {
                System.out.print("        " + letra + "  ");
                for (int h = 0; h < tableroJugador.length - 1; h++) {
                    System.out.print(tableroJugador[h][i] + "  ");
                }
            }
            System.out.println();
        }
        for (int t = -1; t < tableroJugador.length - 1; t++) {
            if (t == -1) {
                System.out.print("           ");
            } else {
                System.out.print("  " + t);
            }
        }
        for (int t = -1; t < tableroJugador.length - 1; t++) {
            if (t == -1) {
                System.out.print("         ");
            } else {
                System.out.print("  " + t);
            }
        }
        System.out.println();
        System.out.println();
    }
static void mostrarTableroDisparosJugador(char[][] tableroDisparosJugador) {
    char letra = 'A';

    for (int i = 0; i < tableroDisparosJugador.length; i++, letra++) {
        for (int q = 0; q < 1; q++) {
            System.out.print("        " + letra + "  ");

        }
        System.out.println();
    }
    for (int t = -1; t < tableroDisparosJugador.length - 1; t++) {
        if (t == -1) {
            System.out.print("           ");
        } else {
            System.out.print("  " + t);
        }
    }
    for (int t = -1; t < tableroDisparosJugador.length - 1; t++) {
        if (t == -1) {
            System.out.print("         ");
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
}