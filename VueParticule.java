package proj.ihm;
import proj.physics.*;


import java.awt.Color;
import java.awt.Graphics;

public class VueParticule implements Drawable{
	private CerclePhysique c;

	public VueParticule(CerclePhysique c) {
		this.c = c;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		
		
		g.drawOval((int)c.getPosX(),(int)c.getPosY(), (int) (2 * c.getRayon()), (int) (2 * c.getRayon()) );
		
	}

	@Override
	public int getPriority() {
		return 0;
	}

}
