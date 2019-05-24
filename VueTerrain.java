package proj.ihm;

import java.awt.Color;
import java.awt.Graphics;

public class VueTerrain implements Drawable{
	
	private int x, y, larg, haut;
	private Color c;
	public static final Color C_SCENE = Color.BLUE;
	public static final Color C_EXIT = Color.PINK;
	public static final Color C_SAFE = Color.GREEN;
	

	public VueTerrain(int xi, int yi, int largi, int hauti, Color ci) {
		x = xi;
		y = yi;
		larg = largi;
		haut =hauti;
		c = ci;
		
	}
	
	@Override
	public void draw(Graphics g) {

			g.setColor(c);
			g.fillRect(x, y, larg, haut);
			}
			
			
			
		
	
	
	@Override
	public int getPriority() {
		return 0;
	}

}
