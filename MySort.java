
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class MySort {
	int[] values;
	MyDraw d;

	MySort(int[] vals, MyDraw draws){
		d = draws;
	} 	
	
	
	public void Bubblesort() throws InterruptedException {
	        int n = d.lines.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (d.lines[j] > d.lines[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = d.lines[j];
	                    d.lines[j] = d.lines[j+1];
	                    d.lines[j+1] = temp;
	    		        d.paintComponent(d.lines);

	                }              
	}
	
	public void quickSort(int low, int high) {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (d.lines == null || d.lines.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = d.lines[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (d.lines[i] < pivot) {
				i++;
			}
 
			while (d.lines[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = d.lines[i];
				d.lines[i] = d.lines[j];
				d.lines[j] = temp;
				i++;
				j--;
		        d.paintComponent(d.lines);

			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(low, j);
 
		if (high > i)
			quickSort(i, high);

	}
    
	
}
   





