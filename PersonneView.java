package proj.ihm;
import proj.physics.*;

import java.awt.Color;
import java.awt.Graphics;

public class PersonneView implements Drawable {

	private Personne p;
	public PersonneView(Personne p) {
		this.p = p;
	}
	
	
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
	
		g.fillOval((int)p.getPosX(), (int)p.getPosY(), (int)p.getRayon(), (int)p.getRayon());
	
		g.setColor(Color.BLACK);
		g.drawOval((int)p.getPosX(), (int)p.getPosY(), (int)p.getRayon(), (int)p.getRayon()); 
		
		if(p.getCptChocs() > Personne.NBCHOCS) {
			g.setColor(Color.RED);
			g.fillOval((int)p.getPosX(), (int)p.getPosY(), (int)p.getRayon(), (int)p.getRayon());
			
		}
	}
	
	public int getPriority() {
		return 0;
	}

}
