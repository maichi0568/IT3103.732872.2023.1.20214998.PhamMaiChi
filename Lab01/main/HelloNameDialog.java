// Example 3: HelloNameDialog.java
package main;

import javax.swing.JOptionPane;

public class HelloNameDialog {

	public static void main(String[] args) {
		// Khai báo biến result để lưu trữ kết quả nhập vào từ hộp thoại
		String result;
		// Hiển thị hộp thoại yêu cầu người dùng nhập tên và lưu kết quả vào biến result
		result = JOptionPane.showInputDialog("Phạm Mai Chi\nPlease enter your name:");
		// Hiển thị hộp thoại xác nhận với nội dung "Hi <result>!"
		JOptionPane.showConfirmDialog(null, "Hi "+ result + "!");
		// Thoát chương trình với mã thoát 0
		System.exit(0);
	}

}
