
/**
 @author pietro.cappellato
 */
public class Quadrato implements Comparable {
	private int lato;

	Quadrato() {
		this(0);
	}

	Quadrato(int l) {
		this.lato = l;

	}

	public int getLato() {
		return this.lato;
	}

	public void setLato(int l) {
		this.lato = l;
	}

	@Override
	public int compareTo(Object o) {
		Quadrato q = (Quadrato) (o);
		if (this.lato == q.getLato()) {
			return 0;
		} else {
			if (this.lato > q.getLato()) {
				return 1;
			} else {
				return -1;
			}
		}
	}

}
