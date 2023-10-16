/*package main;
import javax.swing.JOptionPane;
public class ChoosingOption {

	public static void main(String args[]) {
		int option = JOptionPane.showConfirmDialog(null,
				"Pham Mai Chi- 20214998"+"\n"+
				"Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (option==JOptionPane.YES_OPTION?"YES":"NO"));
		System.exit(0);
	}
}*/
package main;
import javax.swing.JOptionPane;

public class ChoosingOption {

	public static void main(String args[]) {
		Object[] options = { "Yes", "No" }; // Customize the options here

		int option = JOptionPane.showOptionDialog(null,
				"Pham Mai Chi- 20214998" + "\n" + "Do you want to change to the first class ticket?",
				"Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "YES" : "NO"));
		System.exit(0);
	}
}
