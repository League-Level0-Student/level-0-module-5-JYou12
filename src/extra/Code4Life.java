package extra;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {
	static // 1. Ask the user how many hours they spent coding this week.
	String Coding = JOptionPane.showInputDialog("How much time do you spend coding a week?");
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.
	public static void main(String[] args) {
		
	
	int i = Integer.parseInt(Coding);
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja
	if(i <= 2) {
		JOptionPane.showMessageDialog(null, "Stop watching Youtube and do some coding!");
	}else if(i >= 3 && i < 5) {
		JOptionPane.showMessageDialog(null, "You are a code ninja!");
	}else if(i >= 5) {
	playBatmanTheme();
	}
	// 4. If it is more than 5, call the method below to play the Batman theme song.
	}
	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}