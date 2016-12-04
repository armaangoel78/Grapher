import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Grapher extends Applet{
	private final int width = 1000, height = 1000;
	
	public void init() {
		this.resize(width, height);
		
	}
	public void paint(Graphics g) {
		int scale = 5;
		
		g.setColor(Color.black);
		g.drawLine(0, height/2, width, height/2);
		g.drawLine(width/2, 0, width/2, height);
		for (int i = -(width/2); i < width/2; i++){
			if(i != 0)g.fillRect(i+500, applyEquation(i, scale)-500, 1, 1);
		}
	}
	
	private int applyEquation(int x, int scale) {
		int equation = (int) (1 / (1 + Math.pow(2.7182818284590452353602874713527, -x)));
		return height-(equation)*scale ;
	}
}
