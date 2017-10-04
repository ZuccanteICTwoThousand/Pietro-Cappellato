package pkg08x01;

import zuclib.GraficaSemplice;
import zuclib.Tartaruga;
import static zuclib.GraficaSemplice.*;

/**
 @author matteo.ragazzo/cappellato.pietro
 */
public class Main {
	static Tartaruga prova = new Tartaruga();

	public static void main(String[] args) {
		prova.setGrossezza(0.00915);

		prova.setColore(INDACO);
		topdisegni(0.1, 0.1, 90, 4, 0.8, false);

		prova.setColore(ROSSO);
		topdisegni(0.2, 0.55, 90, 4, 0.25, true);

		prova.setColore(VERDE_CHIARO);
		topdisegni(0.775, 0.55, 180, 5, 0.165, true);

		prova.setColore(CIANO);
		topdisegni(0.4025, 0.1855, 180, 6, 0.1545, true);

		prova.setColore(NERO);
		topdisegni(0.8145, 0.1855, 180, 3, 0.2875, true);
	}

	public static void topdisegni(double x, double y, int angolo, int lati, double dimensione, boolean falsoCheVero) {
		prova.pennaSu();
		prova.gotoXY(x, y);
		prova.setAngolo(angolo);
		prova.pennaGiu();
		Poligono pol = new Poligono(lati, dimensione, prova);
		pol.disegna();
		if (falsoCheVero) {
			GraficaSemplice.testo(x, y - 0.025, "Perm: " + (float) (pol.perimetro()));
			GraficaSemplice.testo(x, y - 0.05, "Area: " + (float) (pol.area()));
			System.out.println("Il perimetro è: " + (float) (pol.perimetro()));
			System.out.println("L'area è: " + (float) (pol.area()));
			System.out.println("----------------------------------");
		}
	}

}
