import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.screen.Screen;

public class Diamante extends Cruz{
	
	public Diamante() {
		super();
	}
	public Diamante(int x, int y, char c, TextColor backgroundColor,TextColor foregroundColor, boolean active) {
		super(x, y, c, backgroundColor,foregroundColor,active);
	}
	@Override
	public void draw(Screen screen) {
		//No sé usar el putString
	}
	@Override
	public String nombreDeClase() {
		return "Diamante";
	}
}
