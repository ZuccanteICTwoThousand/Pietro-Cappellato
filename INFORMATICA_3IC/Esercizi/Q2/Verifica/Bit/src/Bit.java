
/**
 @author pietro.cappellato
 */
public class Bit {
	private boolean bit;

	Bit() {
		this(false);

	}

	Bit(boolean b) {
		bit = b;
	}

	Bit(Bit b) {
		bit = b.getBit();
	}

	public void set() {
		bit = true;
	}

	public void reset() {
		bit = false;

	}

	public void not() {
		bit = !bit;

	}

	public boolean getBit() {
		return bit;
	}

	public void and(boolean b) {
		this.bit = this.bit && b;
	}

	public void and(Bit b) {
		this.bit = this.bit && b.getBit();
	}

	public void or(boolean b) {
		this.bit = this.bit || b;
	}

	public void or(Bit b) {
		this.bit = this.bit || b.getBit();
	}
}
