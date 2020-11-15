import java.net.URL;

import javafx.application.Application;

/*
 * Jancarlo Sevilla
 * 10/17/2020
 * Module-6-UI Design
 * 
 */


public class M6Test {
	
	/**
	 * This is the main method. It runs the application running the Filechooser.class
	 * This displays a menu for the user to choose a text file and once the program is run
	 * A pop-up window will detail the number of occurrences of words from greatest to least 
	 * 
	 * @param args Filechooser class is run in the M6Test class.
	 */

	public static void main(String args[]) 
	{ 
		
		 //URL url = M6Test.class.getClassLoader().getResource("module2-poem.txt");
	      //System.out.println("Value = " + url);
		Application.launch(Filechooser.class, args);
		 

	} 
}
