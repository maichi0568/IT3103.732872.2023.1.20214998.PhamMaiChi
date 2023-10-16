// Example 5: ShowTwoNumbers.java
package main;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {

	public static void main(String[] args) {
		// Khai báo biến strNum1 và strNum2 để lưu trữ chuỗi số nhập vào từ hộp thoại
		String strNum1, strNum2;
		// Chuỗi thông báo sẽ được hiển thị sau khi nhập số
		String strNotification = "Phạm Mai Chi- 20214998\nYou've just entered: ";
		
		// Hiển thị hộp thoại yêu cầu người dùng nhập số thứ nhất và lưu kết quả vào biến strNum1
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		// Cập nhật chuỗi thông báo với số thứ nhất vừa nhập
		strNotification += strNum1 + " and ";
		
		// Hiển thị hộp thoại yêu cầu người dùng nhập số thứ hai và lưu kết quả vào biến strNum2
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		// Cập nhật chuỗi thông báo với số thứ hai vừa nhập
		strNotification += strNum2;
		
		// Hiển thị hộp thoại thông báo với nội dung là chuỗi thông báo đã cập nhật
		JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		// Thoát chương trình với mã thoát 0
		System.exit(0);
	}

}
