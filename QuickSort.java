import java.util.Arrays;

import javax.swing.JOptionPane;

public class QuickSort {
	
	private String name;
	private int age;

	public QuickSort(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void printPerson() {
		JOptionPane.showMessageDialog(null, name + " " + age);
		
	}
	
}