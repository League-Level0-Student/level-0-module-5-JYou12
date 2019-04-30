package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {

		int prime = 0;
		String number = JOptionPane.showInputDialog("Give me a number");
		prime = Integer.parseInt(number);

		if (prime % 1 == 0 && prime % prime == 0 && !(prime % 2 == 0) && !(prime % 3 == 0)) {
			JOptionPane.showMessageDialog(null, "That is a prime number!");
		} else {
			JOptionPane.showMessageDialog(null, "That is not a prime number. :(");
		}

	}
}
