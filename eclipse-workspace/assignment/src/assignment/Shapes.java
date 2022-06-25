package assignment;
import javax.swing.*;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=;
		int h=;
		JFrame f= new JFrame();
		DrawingCanvas dc = new DrawingCanvas(w,h);
		f.setSize(w,h);
		f.setTitle("Drawing Shapes in Java");
		f.add(dc);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		

	}

}
