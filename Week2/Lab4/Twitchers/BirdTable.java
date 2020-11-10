
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 * 
 * 
 */

import javax.swing.*;
import java.util.Scanner;

public class BirdTable {


   // main method begins execution of Java application
   public static void main( String args[] )
   {
	   Scanner sc = new Scanner(System.in);
      //Declare and build an array interactively - see the Temperature Project
	   //Build an array.
	      int[] hArray = new int[7];
	      
	      for (int i=0 ; i<7 ; i++) {
	    	  System.out.print("input next number: ");
	    	  hArray[i] = sc.nextInt();
	      }

	     //String to hold output
	      String output = "Day\tNo. Bl\tHistogram";

	      // for each array element, output a bar in histogram
	      for ( int counter = 0; counter < 7; counter++ ) {
	         output += 
	            "\n" + counter + "\t" + hArray[ counter ] + "\t";

	         // print bar of asterisks
	         for ( int stars = 0; stars < hArray[ counter ]; stars++ )
	            output += "*";
	      }
	      
	      //Create a new text area object to hold the text
	      JTextArea outputArea = new JTextArea();
	      outputArea.setText( output );
	      System.out.print(output);
	      JOptionPane.showMessageDialog( null, outputArea,
	         "Histogram Printing Program",JOptionPane.INFORMATION_MESSAGE );
      
	      
      //Display Output using a histogram of '*' - see Histogram Project
   
   }
}