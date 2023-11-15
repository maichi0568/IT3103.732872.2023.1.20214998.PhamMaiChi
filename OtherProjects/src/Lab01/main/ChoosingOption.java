/*package main;
import javax.swing.JOptionPane;
public class ChoosingOption {

	public static void main(String args[]) {
		// Hiển thị hộp thoại xác nhận với lựa chọn "Yes" và "No"
		int option = JOptionPane.showConfirmDialog(null,
				"Pham Mai Chi- 20214998"+"\n"+
				"Do you want to change to the first class ticket?");
		// Hiển thị thông báo về lựa chọn đã chọn
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (option==JOptionPane.YES_OPTION?"YES":"NO"));
		System.exit(0);
	}
}*/
package Lab01.main;
import javax.swing.JOptionPane;

public class ChoosingOption {

	public static void main(String args[]) {
		// Tùy chỉnh các lựa chọn
		Object[] options = { "Yes", "No" }; // Customize the options here
		// Hiển thị hộp thoại chọn lựa
		int option = JOptionPane.showOptionDialog(null,
				"Pham Mai Chi- 20214998" + "\n" + "Do you want to change to the first class ticket?",
				"Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		// Hiển thị thông báo về lựa chọn đã chọn
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "YES" : "NO"));
		System.exit(0);
	}
}
