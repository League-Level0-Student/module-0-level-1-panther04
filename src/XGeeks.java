
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variabl
		String andres = "speed";
		String issac = "invisible";
		String dave = "jumping";
		String eligah = "strength";
		String andrea = "mind reading";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String speed = JOptionPane.showInputDialog("enter a name");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (speed.equals("andres")) {
			JOptionPane.showMessageDialog(null, andres);
		}
		if (speed.equals("issac")) {

			JOptionPane.showMessageDialog(null, issac);

		}
		if (speed.equals("dave")) {
			JOptionPane.showMessageDialog(null, dave);
		}
		if (speed.equals("eligah")){
			JOptionPane.showMessageDialog(null, eligah);
	}
		if(speed.equals("andrea")){
			JOptionPane.showMessageDialog(null, andrea);
}
}
}