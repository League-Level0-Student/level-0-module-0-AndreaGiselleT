package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String name= JOptionPane.showInputDialog("what is your name?");
	JOptionPane.showMessageDialog(null, "I know that you went swimming last summer, "+name+". Muhahaha");
}
}
