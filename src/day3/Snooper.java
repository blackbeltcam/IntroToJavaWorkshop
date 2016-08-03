package day3;
//READ THIS, do not capitilize anything
import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog("What gender are you?");
	if(answer.equals("boy")){
		JOptionPane.showMessageDialog(null,"eat the chicken");
		String number=JOptionPane.showInputDialog(null,"The chicken you ate had a mechanical dna tester and I now exactly what you are afraid of. I suggest you tell me your social secrity number or I'll use this knowledge agaisnt you");
		JOptionPane.showMessageDialog(null, "Don't even try to call the police, as you are wanted");
}else{
	JOptionPane.showMessageDialog(null,"eat the salad");
}
}
}

