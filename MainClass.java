import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass extends JPanel {

  public void paintComponent(Graphics g) {
    g.drawLine(25, 25, 120, 120);
    int[] lines = new int[100];
	  for(int i = 0; i < lines.length-1; i++){
			g.drawLine (i, lines[i], i, lines[lines.length-1-i]);
	  }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new MainClass());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}