import java.util.Random;

import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

public class Objeto {
	private char c;
	private int x, y;
	private TextColor backgroundColor;
	private TextColor foregroundColor;
	private boolean active;
	private static  final char [] chars = {'@', '#', '$', '%', '*'};
	private Random r = new Random();
	
	public Objeto(int x, int y, char c, TextColor backgroundColor,TextColor foregroundColor, boolean active) {
		this.x=x;
		this.y=y;
		this.c=c;
		this.backgroundColor=backgroundColor;
		this.foregroundColor= foregroundColor;
		this.active=active;
	}
	public Objeto() {
		this.x=0;
		this.y=0;
		this.c=randomChar();
		this.backgroundColor=TextColor.ANSI.BLACK;
		this.foregroundColor=randomRGBColor();
		this.active=true;
	}
	
	public char randomChar() {
		int valor= r.nextInt(chars.length);
		return chars[valor];
	}
	public TextColor.RGB randomRGBColor(){
		return TextColor.RGB(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}
	public TextColor.ANSI randomANSIColor(){
		
		return TextColor.ANSI(r.nextInt(9));
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void randomTopPosition(int width) {
		x=r.nextInt();//Pienso que está en cualquier lado de la parte de la fila 
		y=0;//Pienso que está arriba
	}
	public void putString(Screen screen, int x, int y, String s) {
		TextGraphics a = screen.newTextGraphics();
		a.putString(x, y, s);
	}
	public void update(int width, int height) {
		//No sé cómo sacar el tamaño de la pantalla, así que pongo 255, como que si la supera desaparezca
		if(height>=255) {
			this.active=false;
		}else {
			this.x=width;
			this.y=height;
		}
	}
	public void draw(Screen screen) {
		
	}
	
	
	
	
	
	
	
}
