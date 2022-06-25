
import javax.swing.*;
import javax.swing.text.AbstractDocument.BranchElement;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class DrawRec extends JFrame{
    static int option;
    public DrawRec(){
        setTitle("Drawing of shapes");
        setSize(800,700);
        setBackground(Color.YELLOW);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        option = Integer.parseInt(JOptionPane.showInputDialog(null, "      MAIN MENU\nPlease choose the shape of your choice\n 1. RECTANGLE\n 2. CIRCLE\n 3. TRIANGLE\n 4. EXIT"));
        if(!(option > 5) && !(option < 0)){
            switch (option){
                case 1:
// draw a rectangle
                	
                int width = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter desired width of the rectangle\n    From 8 to 70\n\n"));
                int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the height of the rectangle\n    From 8 to 60\n\n"));
                if (!(width < 8) && !(height < 8)) {
                    if (width <=70 && height<= 60) {
                        if (width != height) {
                            g.setColor(Color.BLUE);
                            g.fillRect((800-(width*10))/2, (700-(height*10))/2,width*10, height*10);
                        
                        }
                        //displayed when dimensions input are equal
                        else{
                            JOptionPane.showMessageDialog(null, "Width and Height of arectangle are never equal");
                            System.exit(0);
                    }
                    
                }
                    // displayed when values are greater than the ones specified (width <=70 && height<= 60)
                else{
                    JOptionPane.showMessageDialog(null, "Enter the values in the range given");
                    System.exit(0);
                    }
                
                }
                // displayed when input is less than the one specified (<8)
                else{
                JOptionPane.showMessageDialog(null, "Please enter the values in the range given");
                System.exit(0);
                }
                // if the input meets the requirements the program proceeds to draw
                break;
                
                case 2:
  // draw a circle
                	
                    int radius = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the radius of the circle\n    From 5 to 75\n\n"));
            
                    if (radius<=75 && !(radius < 5)) {
                        g.setColor(Color.BLACK);
                        g.fillOval((400-(radius*10)/2), (350-(radius*10)/2),radius*10,radius*10);
                
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Enter the radius in the range given");
                        System.exit(0);
                    }
                break;
                
                case 3:
 // draw a triangle
                	
                	int widths = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter desired width of the triangle\n    From 10 to 100\n\n"));
                    int heights = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the height of the triangle\n    From 20 to 100\n\n"));
                    if (!(widths < 9) && !(heights < 19)) {
                        if (widths <=100 && heights<= 100) {
                         g.setColor(Color.BLACK);
                                
                                
                                g.fillPolygon(new int [] {400,400-widths,widths+400}, new int[] {100,heights*6,heights*6},3 );                                                 
                               
                    }
                        // displayed when values are greater than the ones specified (width <=70 && height<= 60)
                    else{
                        JOptionPane.showMessageDialog(null, "Enter the values in the range given");
                        System.exit(0);
                        }
                    
                    }
                	
                   
                break;
 //exit the program
                
                case 4:
                    JOptionPane.showMessageDialog(null, "THANK YOU FOR USING THE PROGRAM!😘😘");
                    System.exit(0);
                break;
                default:
                    JOptionPane.showMessageDialog(null, "You did not Choose an Option\n     The program will exit");
                    System.exit(0);
                break;
            } 
        }
        else{
            JOptionPane.showMessageDialog(null, "Enter the correct option");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new DrawRec();
    }
}
