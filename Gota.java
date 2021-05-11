import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.screen.Screen;

public class Gota extends Objeto{
	
	public Gota() {
		super();
	}
	public Gota(int x, int y, char c, TextColor backgroundColor,TextColor foregroundColor, boolean active) {
		super(x, y, c, backgroundColor,foregroundColor,active);
	}

	@Override
	public void draw(Screen screen) {
		//no sé utilizar putString pero supongo que lo que quiere es que visualice la pantalla e imprima según el carácter c
	}
	
}
