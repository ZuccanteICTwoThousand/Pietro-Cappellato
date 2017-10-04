package pkg08x01;

import zuclib.Tartaruga;

/**
 * @author matteo.ragazzo
 */
public class Poligono {
	private Tartaruga t=new Tartaruga();
	private int numLati;
	private double lungLato;

	public Poligono(int numeroLati, double lunghezza, Tartaruga tarta){
		numLati=numeroLati;
		lungLato=lunghezza;
		t=tarta;
	}
	public double perimetro(){
		return numLati*lungLato;
	}
	
	public double area(){
		double[] nfisso={0,0,0.289,0.5,0.688,0.866,1.038,1.207,1.374,1.539,1.866};
		return (this.perimetro()*(nfisso[numLati-1]*lungLato))/2;
	}
	
	public void disegna(){
		for(int i=0;i<numLati;i++){
			t.avanti(lungLato);
			t.destra(360/numLati);
		}
	}
	
	public Tartaruga getTartaruga(){
		return t;
	}

}
