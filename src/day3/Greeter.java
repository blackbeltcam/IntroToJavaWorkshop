package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog(null,"Hello there. My name is Cameron, what's yours?");
	JOptionPane.showMessageDialog(null,"Hello "+answer);
	
	
}
}
