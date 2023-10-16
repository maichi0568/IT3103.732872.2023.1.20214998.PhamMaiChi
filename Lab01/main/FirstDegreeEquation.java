// The first-degree equation (linear equation) with one variable
package main;

import javax.swing.JOptionPane;

public class FirstDegreeEquation {

	public static void main(String args[]) {
		String stra, strb;
		// Hiển thị hộp thoại yêu cầu người dùng nhập giá trị của a và lưu kết quả vào biến stra
		stra = JOptionPane.showInputDialog(null, "Nhap gia tri cua a: ",
				"Nhap gia tri cua a", JOptionPane.INFORMATION_MESSAGE);
		// Hiển thị hộp thoại yêu cầu người dùng nhập giá trị của b và lưu kết quả vào biến strb
		strb = JOptionPane.showInputDialog(null, "Nhap gia tri cua b = ",
				"Nhap gia tri cua b", JOptionPane.INFORMATION_MESSAGE);
		// Chuyển đổi chuỗi số thành kiểu double bằng phương thức parseDouble và lưu vào biến a và b
		double a = Double.parseDouble(stra);
		double b = Double.parseDouble(strb);
		// Kiểm tra các trường hợp của phương trình bậc nhất
		if (a == 0) {
			if (b == 0) JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem");
			else JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
		} else JOptionPane.showMessageDialog(null, "Nghiem cua phuong trinh la x = "+(-b/a));
	}
}
