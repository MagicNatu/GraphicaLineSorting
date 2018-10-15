import java.awt.*;
import javax.swing.*;

public class OvalPaint extends JPanel {

  public void paint(Graphics g) {
 
    int[] lines = new int[500];
    MyDraw s;
    
    for(int i = 0; i < lines.length-1; i++){
    	lines[i] = i;
    }
    
	  for(int i = 0; i < lines.length-1; i++){
			g.drawLine (i, lines[i], i, lines[lines.length-1-i]); 
}

  }

  public static void main(String args[]) {
    JFrame frame = new JFrame("OvalPaint");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // OvalPaint panel = new OvalPaint();
    
    frame.getContentPane().add(new OvalPaint());

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}