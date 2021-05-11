import java.io.IOException;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

public class Circunferencia extends Objeto implements Identificable {

	public Circunferencia() {
		super();
	}
	public Circunferencia(int x, int y, char c, TextColor backgroundColor,TextColor foregroundColor, boolean active) {
		super(x, y, c, backgroundColor,foregroundColor,active);
	}
	@Override
	public void draw(Screen screen) {
		TextGraphics tGraphics = screen.newTextGraphics();
		try {
			screen.startScreen();
			screen.clear();
			tGraphics.putString(0,0, "* * ".replace('*', c));
			tGraphics.putString(1,1, "*   * ".replace('*', c));
			tGraphics.putString(2,2, "* * ".replace('*', c));
			screen.refresh();

			screen.readInput();
			screen.stopScreen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String nombreDeClase() {
		// TODO Auto-generated method stub
		return "Circunferencia";
	}

}
