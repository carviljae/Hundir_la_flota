public class Prueba {
    //COLOCA LOS BARCOS DEL PC PERO SI COLISIONAN O SALEN DEL MAPA PETA
    //
    //
    //SIEMPRE SALEN EN HORIZONTAL
    //
    //
    //

    public static void colocarBarcosPC(char[][] tablero, int[] barcos) {

        for (int cont = 0; cont < barcos.length; ++cont) {
            int letra = (int) (Math.random() * 9);
            int num = (int) (Math.random() * 9);
            int sumador = 1;
            for (int i = 0; i < 1; ++i) {
                if ((num) + barcos[i] <= tablero[1].length) {
                    for (int j = 0; j < barcos[cont]; ++j) {
                        tablero[letra][num + sumador] = '#';
                        ++sumador;
                    }
                } else {
                    cont--;
                }
            }
        }
    }
}