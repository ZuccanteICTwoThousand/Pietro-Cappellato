package ricorsiva;

import java.util.Scanner;
import static zuclib.GraficaSemplice.*;

public class Ricorsiva {

    public static void main(String[] args) {
        double centroX = 0.5;
        double centroY = 0.5;
        double lato = 0.8;
        int n;
        setFinestra(800, 800, "Quadato");
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci N");
        n = input.nextInt();
        quad(centroX, centroY, lato, 0, n);

    }

    public static void quad(double centroX, double centroY, double lato, int i, int n) {
        setColore(ROSSO);
        if (i < n) {
            quadrato(centroX, centroY, lato);
            cerch(centroX + lato / 4, centroY + lato / 4, lato / 4, i + 1, n);
            cerch(centroX + lato / 4, centroY - lato / 4, lato / 4, i + 1, n);
            cerch(centroX - lato / 4, centroY + lato / 4, lato / 4, i + 1, n);
            cerch(centroX - lato / 4, centroY - lato / 4, lato / 4, i + 1, n);
        }
    }

    public static void cerch(double centroX, double centroY, double lato, int i, int n) {

        if (i < n) {
            setColore(VERDE);
            cerchio(centroX, centroY, lato);
            quad(centroX, centroY, lato * Math.sqrt(2), i + 1, n);
        }
    }
}
