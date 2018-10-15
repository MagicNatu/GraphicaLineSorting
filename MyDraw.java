import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.JFrame;


public class MyDraw extends Applet {	
	int[] lines = new int[500];
	Display f;
	ArrayList <Integer> list = new ArrayList();
	
	MyDraw(Display m) {
		f = m;	
		for (int i = 0; i < lines.length; i++){
			lines[i] = i+1;
		}
		
		for (int i: lines){
			list.add(i);
		}
		
		Collections.shuffle(list);
		for (int i = 0; i < list.size(); i++) {
		    lines[i] = list.get(i);
		//    System.out.println(lines[i]);
		  }    
	}
	
	public void paintComponent(int[] array) {
		Graphics g = f.mainWindow.getGraphics();
		super.paintComponents(g);
		g.clearRect(0, 0, f.width, f.height);
		for(int i = 0; i<array.length-1;i++){
			g.drawLine(i, f.height, i, f.height-array[i]);
		}
			
	}
		
		
	
	
	@Override public void paint (Graphics g){
		g = (Graphics) g.create();
		//super.paintComponents(g);
		
		
		for(int i = 0; i < lines.length-1; i++){
			g.drawLine (i, lines[i], i, lines[lines.length-1-i]); 
	//	}
	}
	}
}
