
/**
 @author pietro.cappellato
 */
public class Punto {
	private int x, y;

	public Punto() {
		this(0, 0);
	}

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isOrigin() {
		if (this.x == 0 && this.y == 0) {
			return true;
		} else {
			return false;
		}
	}

	public double distance(Punto p) {
		return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
	}

	public String toString() {
		return "X: " + this.x + "	Y: " + this.y;
	}

}
