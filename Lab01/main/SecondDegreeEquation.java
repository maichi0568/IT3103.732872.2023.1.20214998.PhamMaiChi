// The second-degree equation with one variable
// Form of the equation: ax^2 + bx + c = 0
// x is the variable
// a, b and c are coefficients
package main;

import javax.swing.JOptionPane;

public class SecondDegreeEquation {

	public static void main(String args[]) {
		String stra, strb, strc;
		// Hiển thị hộp thoại yêu cầu người dùng nhập giá trị của a và lưu kết quả vào biến stra, strb, strc
		stra = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nNhap gia tri cua a: ",
				"Nhap a", JOptionPane.INFORMATION_MESSAGE);
		strb = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nNhap gia tri cua b: ",
				"Nhap b", JOptionPane.INFORMATION_MESSAGE);
		strc = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nNhap gia tri cua c: ",
				"Nhap c", JOptionPane.INFORMATION_MESSAGE);
		// Chuyển đổi chuỗi số thành kiểu double bằng phương thức parseDouble và lưu vào biến a, b và c
		double a = Double.parseDouble(stra);
		double b = Double.parseDouble(strb);
		double c = Double.parseDouble(strc);
		// Kiểm tra các trường hợp của phương trình bậc hai
		if (a == 0) {
			if (b == 0) {
				if (c == 0) JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem");
				 else JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
			} else JOptionPane.showMessageDialog(null, "Nghiem cua phuong trinh la x = "+(-c/b));
		} else {
			double delta = b*b - 4*a*c;
			if (delta < 0) JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
			 else if (delta == 0) JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem kep la x = " + (-b/(2*a)));
			   else if (delta > 0) JOptionPane.showMessageDialog(null, "Phuong trinh co hai nghiem phan biet la"+ "\n" +
					   												"x1 = " + (-b+(Math.sqrt(delta)))/(2*a)+"\n"+
					   												"x2 = " + (-b-(Math.sqrt(delta)))/(2*a));
		}
	}

}
