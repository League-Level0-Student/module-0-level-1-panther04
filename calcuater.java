package calculater;

import javax.swing.JOptionPane;

public class calcuater {
public static void main(String[] args) {
	String andres=JOptionPane.showInputDialog("enter your first number");
	int num1=Integer.parseInt(andres);
	String leyva=JOptionPane.showInputDialog("enter your second number");
	int num2=Integer.parseInt(leyva);
	String angela=JOptionPane.showInputDialog("do you want to add,subtract,multiply,or divide");
	if(angela.equals("add")) {
	int v=num1+num2;
	JOptionPane.showMessageDialog(null, v);
	}
	if(angela.equals("subtract")) {
		int v=num1-num2;
		JOptionPane.showMessageDialog(null, v);
	}
	if(angela.equals("multiply")) {
		int v=num1*num2;
		JOptionPane.showMessageDialog(null, v);
	}
	if(angela.equals("divide")) {
		int v=num1/num2;
		JOptionPane.showMessageDialog(null, v);
	}
}
}