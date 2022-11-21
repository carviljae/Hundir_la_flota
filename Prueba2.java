import java.util.Scanner;
public class Prueba2 {

    public static void coordenadaDisparoJugador() {
        Entrada.pideCoordenada();

    }
    public static String pideCoordenadaDisparo(){
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        System.out.println("Introduce una coordenada: ");
        coordenadas = sc.next().toUpperCase();

        if(!Entrada.esCorrectoTamanyo(coordenadas)){
            Entrada.pideCoordenada();
        } else if(!Entrada.primerCaracterLetra(coordenadas)){
            Entrada.pideCoordenada();
        } else if (!Entrada.segundoCaracterNumero(coordenadas)) {
            Entrada.pideCoordenada();
        } else
            System.out.println("Coordenada aceptada");
        //cambioTableroDisparoJugador(coordenadas, tableroDisparosJugador);
        return coordenadas;
    }
  /* public static char cambioTableroDisparoJugador(String coordenadas, char[][] tableroDisparosJugador){

        //relleno
        for (int k = 0; k < tableroDisparosJugador[0].length; k++) {
            for (int x = 0; x < 10; x++) {
                tableroDisparosJugador[x][k] = '~';

            }

        }


    }*/
}