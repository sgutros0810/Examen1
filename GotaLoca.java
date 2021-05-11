import com.googlecode.lanterna.TextColor;

public class GotaLoca extends Gota {
	public GotaLoca() {
		super();
	}
	public GotaLoca(int x, int y, char c, TextColor backgroundColor,TextColor foregroundColor, boolean active) {
		super(x, y, c, backgroundColor,foregroundColor,active);
	}
	public void update(int x, int y) {
		int aleatorio=r.nextInt(2);
		setY(y);
		if(aleatorio>0) {
			setX(x+1);
		}else if(aleatorio<0) {
			setX(x);
		}else {
			setX(x-1);
		}
	}

}
