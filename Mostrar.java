public class Mostrar {
    //CREAMOS LOS TABLEROS
    public static void crearTablero(char[][] tablero, char[][] tableroDisparos) {
        char letra = 'A';
        int num = 0;
        int num2 = 0;
        for (int i=0;i<tablero.length;i++, letra++) {
            System.out.print("\t"+WHITE_BOLD_BRIGHT+(letra) + "\t"+ANSI_RESET);
            for (int j=0;j<tablero[0].length;j++ ) {
                System.out.print(ANSI_BLUE +tablero[i][j]+ANSI_RESET+"\t");
            }
            System.out.print("\t\t");
            System.out.print(WHITE_BOLD_BRIGHT+(letra) + "\t"+ANSI_RESET);
            for (int j=0;j<tableroDisparos[0].length;j++ ) {
                System.out.print(ANSI_BLUE +tableroDisparos[i][j]+ANSI_RESET+"\t");
            }
            System.out.println();
        }
        System.out.print("\t\t");
        for (int i=0;i< tablero.length;i++,num++) {
            System.out.print(WHITE_BOLD_BRIGHT+num + "\t"+ANSI_RESET);
        }
        System.out.print("\t\t");
        System.out.print(" " + "\t");
        for (int i=0;i< tableroDisparos.length;i++, num2++) {
            System.out.print(WHITE_BOLD_BRIGHT+num2 + "\t"+ANSI_RESET);
        }
        System.out.println("\n");
    }
    //RELLENA LOS TABLEROS
    public static void rellenarTablero(char[][] tablero){
        for (int i=0;i<tablero.length;i++) {
            for (int j=0;j<tablero.length;j++) {
                tablero[i][j] = '~';
            }
        }
    }
    //CODIGOS PARA USAR LOS COLORES
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m";
    public static final String ANSI_BLUE = "\u001B[34m";
}