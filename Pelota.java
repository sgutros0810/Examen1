import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.screen.Screen;

public class Pelota extends Circunferencia{
	
	public Pelota() {
		super();
	}
	public Pelota(int x, int y, char c, TextColor backgroundColor,TextColor foregroundColor, boolean active) {
		super(x, y, c, backgroundColor,foregroundColor,active);
	}
	@Override
	public void draw(Screen screen) {
		//No sé usar el putString
	}
	@Override
	public String nombreDeClase() {
		return "Pelota";
	}
}
