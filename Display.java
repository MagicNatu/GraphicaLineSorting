import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
 
public class Display implements KeyListener, ActionListener {
	MyDraw draw = new MyDraw(this);
	
    JFrame mainWindow;
    int height = draw.lines.length+10;
    int width = draw.lines.length+10;
    JPanel panel = new JPanel();
    String[] sortingAlgorithms = {"Bubble sort", "Quicksort", "Merge sort"};
    JComboBox sortChoice = new JComboBox(sortingAlgorithms);
    
    public void HideMenu(){
    	if(panel.isVisible()){
    	//	panel.setVisible(false);
    		panel.hide();
    	}
    	else panel.show();
    //	else panel.setVisible(true);
    }
    
    public Display(){
    	mainWindow = new JFrame();
        mainWindow.setSize(height,width);
       // mainWindow.setLayout(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       // JButton b = new JButton();
        
        
        //panel.setPreferredSize(new Dimension(200,600));
        panel.setBackground(Color.blue);
        panel.setBounds(width-200, 0, 200, height);
       
        mainWindow.add(panel);
        panel.setVisible(false);
        mainWindow.addKeyListener(this);
        mainWindow.setVisible(true);
        //panel.add(b);
        
        sortChoice.setSelectedIndex(2);
        sortChoice.addActionListener(this);
        panel.add(sortChoice);
   
        //JButton
    }
   
    public String function(String s) {
        return s;
    }
    public static void main(String[] args) throws InterruptedException {
        Display d = new Display();
          	
    	d.mainWindow.getContentPane().add(d.draw,BorderLayout.CENTER);
    	//d.panel.setVisible(false);
    	MySort sort = new MySort(d.draw.lines, d.draw);
    	sort.Bubblesort();
    //	sort.quickSort(0,699);
       
    }


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char ch = e.getKeyChar();
		if(ch =='m'){
			HideMenu();
			
		}
		if(ch == 's'){
		
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
 
}