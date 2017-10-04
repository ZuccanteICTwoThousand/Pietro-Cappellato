
/**
 @author pietro.cappellato
 */
public class Cerchio implements Comparable {
	private final double raggio;
	private final Punto centro;

	Cerchio(double raggio, Punto p) {
		this.raggio = raggio;
		this.centro = p;

	}

	public Punto getCenter() {
		return centro;
	}

	public double getRadius() {
		return raggio;
	}

	public double getDiameter() {
		return this.getRadius() * 2;
	}

	public double getCirc() {
		return this.raggio * 2 * Math.PI;
	}

	@Override
	public int compareTo(Object o) {
		Cerchio c = (Cerchio) (o);
		if (getCirc() == c.getCirc()) {
			return 0;
		} else {
			if (getCirc() > c.getCirc()) {
				return 1;
			} else {
				return -1;
			}
		}
	}

}
