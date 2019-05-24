package proj.ihm;



import java.awt.Color;
import java.awt.Graphics;

public class VueRond implements Drawable {
	private double x, y, rayon;
	public VueRond(double x, double y, double r) {
		this.x = x;
		this.y = y;
		rayon = r;
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval((int) x, (int) y, (int) (2*rayon), (int) (2*rayon));
	}
	
	public int getPriority() {
		return 0;
	}
	
	public void move() {
		x ++;
		y++;
	}

}
