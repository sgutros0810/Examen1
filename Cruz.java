import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.screen.Screen;

public class Cruz extends Objeto implements Identificable{

	public Cruz() {
		super();
	}
	public Cruz(int x, int y, char c, TextColor backgroundColor,TextColor foregroundColor, boolean active) {
		super(x, y, c, backgroundColor,foregroundColor,active);
	}
	@Override
	public void draw(Screen screen) {
		//No sé usar el putString
	}
	public String nombreDeClase() {
		return "Cruz";
	}
}
