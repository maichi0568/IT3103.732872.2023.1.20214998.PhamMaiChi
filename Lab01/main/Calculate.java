package main;

import javax.swing.JOptionPane;

public class Calculate {

	public static void main(String[] args) {
		// Khai báo biến strNum1 và strNum2 để lưu trữ chuỗi số nhập vào từ hộp thoại
		String strNum1, strNum2;
		// Hiển thị hộp thoại yêu cầu người dùng nhập số thứ nhất và lưu kết quả vào biến strNum1 và biến strNum2
		strNum1 = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nPlease input the first number: ",
				"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nPlease input the second number",
				"Input the second number", JOptionPane.INFORMATION_MESSAGE);
		// Chuyển đổi chuỗi số thành kiểu double bằng phương thức parseDouble và lưu vào biến num1 và num2
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		// Hiển thị hộp thoại thông báo với tổng, hiệu, tích và thương của hai số đã nhập
		JOptionPane.showMessageDialog(null,"Phạm Mai Chi"+"\nSum: "+(num1+num2)+"\n"+
		"Difference: "+(num1-num2)+"\n"+
		"Product: "+(num1*num2)+"\n"+
		"Quotient: "+(num1/num2)+"\n");
	}
}
