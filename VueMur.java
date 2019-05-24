package proj.ihm;
import proj.physics.*;

import java.awt.Color;
import java.awt.Graphics;

public class VueMur implements Drawable{
	private RectanglePhysique r;
	public VueMur(RectanglePhysique r) {
		this.r = r;
	}
	
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		
		g.drawRect((int)r.getPosX(), (int)r.getPosY(), (int)r.getLarg(), (int)r.getHaut());
		
	}
	
	
	@Override
	public int getPriority() {
		
		return 0;
	}
	
	
	
	

}
