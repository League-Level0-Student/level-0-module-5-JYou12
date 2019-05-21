import java.util.Random;

import javax.swing.JOptionPane;

public class GuessingGame {
	public static void main(String[] args) {
		int difficulty = 0;
		int chances = 0;
		int num = JOptionPane.showOptionDialog(null, "Select Difficulty", "Guessing Game", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "easy (100 numbers)", "medium (500 numbers)", "hard (1000 number)" }, null);
		chances = JOptionPane.showOptionDialog(null, "How many chances do you want", "Guessing Game", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "easy (30)", "medium (20)", "hard (10)" }, null);

		if (num == 0) {
			difficulty = 100;
		} else if (num == 1) {
			difficulty = 500;
		} else if (num == 2) {
			difficulty = 1000;
		}

		if (chances == 0) {
			chances = 10;
		} else if (chances == 1) {
			chances = 20;
		} else if (chances == 2) {
			chances = 30;
		}

		Random rand = new Random();
		int random = rand.nextInt(difficulty);
		
		for (int i = chances; i > 0; i--) {
			String guess = JOptionPane.showInputDialog("Guess a number");
			int number = Integer.parseInt(guess);

			if (number == random) {
				JOptionPane.showMessageDialog(null, "You WON!!!");
				System.exit(0);
			} else if (number < random) {
				JOptionPane.showMessageDialog(null, "Wrong, your guess is to low");
			} else if (number > random) {
				JOptionPane.showMessageDialog(null, "Wrong, your guess is to high");
			}

			if (chances <= 0) {
				JOptionPane.showMessageDialog(null, "YOU LOSE!");
				System.exit(0);
			}
			chances --;
		}
	}
}
