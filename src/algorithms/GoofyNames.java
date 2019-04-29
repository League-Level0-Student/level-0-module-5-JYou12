package algorithms;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";
		int e;
		String n = "";
		String m = "";
		int ch = 0;
		boolean run = true;
		// 1. Ask the user to enter their name
		String name = JOptionPane.showInputDialog("What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.
		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.
		// 4. Create a String variable to store the next character of the name
		// using .substring(start, end)
		// HINT: replace 'start' and 'end' to get String with character at i
		// 5. Use MODULO to set this variable to upper case for EVEN characters
		// and lower case for ODD characters.
			for (e = 0 ; e<name.length();e++) {
					
				if(run == true) {
	            name.charAt(ch);
	            m += "" + name.charAt(e);
	            n += m.toUpperCase();
	            ch += 2;
	         run = false;
				}else {
	            name.charAt(e);
	           	n+= name.charAt(e);
		        n += "" + name.charAt(e);
				
				}
	            	
	            }
			System.out.println(n);
	}
			
		
		// 6. ADD this String (containing 1 char) to the goofyName String

		// 7. Use pop-up to show user their Goofy name

	}

