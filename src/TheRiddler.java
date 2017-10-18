import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int leyva=(0);
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String andres=JOptionPane.showInputDialog("There where 2 animals and 2 people.The 2 people went to go get some food when they came back  they saw the 2 animals in blood.What happend to the 2 animals. ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(andres.equals("the animals where fighting and they where pittbulls")){
JOptionPane.showMessageDialog(null, "correct");
leyva=leyva+1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else{
	JOptionPane.showMessageDialog(null, "wrong");
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,leyva);
	}
}

