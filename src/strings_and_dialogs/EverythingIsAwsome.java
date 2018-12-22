package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwsome {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("what do you like?");
	JOptionPane.showMessageDialog(null, name + " is awesome ");
}
}
