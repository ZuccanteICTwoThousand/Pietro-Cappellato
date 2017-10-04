
/**
 @author pietro.cappellato
 */
public class ResizeableButton extends Button {
	private int width, height;

	public ResizeableButton(int width, int height, String name, int x, int y) {
		super(name, x, y);
		this.width = width;
		this.height = height;
	}

	public ResizeableButton(String name, int x, int y) {
		super(name, x, y);
		this.width = 0;
		this.height = 0;
	}

}
