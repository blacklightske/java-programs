package assignment;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Scanner;

public class DrawingCanvas extends JComponent {
	
	private int width;
	private int height;
	int tosha;

	public DrawingCanvas(int w, int h) {
		width = w;
		height = h;
	}
	
protected void paintComponent(Graphics g) {
	
	Scanner t = new Scanner(System.in);
	tosha= t.nextInt();
	Graphics2D g2d = (Graphics2D) g;
	Rectangle2D.Double r = new Rectangle2D.Double(50,t,100,250);
	g2d.setColor(new Color(100,149,23));
	g2d.fill(r);
	
	Ellipse2D.Double e = new Ellipse2D.Double(200,75,100,100);
	g2d.setColor(Color.YELLOW);
	g2d.fill(e);
	
	
	Path2D path =new Path2D.Double();
	path.moveTo(500, 80);// upper point
	path.lineTo(550, 400);//lower right point
	path.lineTo(280, 400);// lower left point
	path.closePath();
	
	g2d.setStroke(new BasicStroke(3));
	g2d.setColor(Color.darkGray);
	g2d.draw(path);
	g2d.setColor(Color.cyan);
	g2d.fill(path);
	

	

	
	
	}

}
