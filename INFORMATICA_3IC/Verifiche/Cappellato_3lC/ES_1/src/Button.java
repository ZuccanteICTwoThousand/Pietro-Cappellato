
/**
 @author pietro.cappellato
 */
public class Button implements Screen {
	public String name;
	public int x, y;
	public boolean pressed = false;

	public Button(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public Button(String name) {
		this(name, 0, 0);
	}

	@Override
	public void push() {
		this.pressed = !this.pressed;
	}

	@Override
	public Button merge(Object b) {
		Button merge = (Button) b;
		String merged = this.name + " " + merge.name;
		int mergedX = (this.x + merge.x) / 2;
		int mergedY = (this.y + merge.y) / 2;
		Button shish = new Button(merged, mergedX, mergedY);
		return shish;
	}

	@Override
	public void move(int X, int Y) {
		this.x = x;
		this.y = y;
	}
}
