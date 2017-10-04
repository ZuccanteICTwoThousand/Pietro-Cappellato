
/**
 @author pietro.cappellato
 */
public interface Screen {
	final int maxX = 1920, maxY = 1080;

	void move(int X, int Y);

	void push();

	Button merge(Object b);
}
