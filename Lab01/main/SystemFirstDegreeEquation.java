// The system of first-degree equations (linear system) with two variables
// A system of first-degree equations with two variables x1 and x2 can be written as follows
// a11*x1 + a12*x2 = b1
// a21*x1 + a22*x2 = b2
package main;

import javax.swing.JOptionPane;

public class SystemFirstDegreeEquation {

	public static void main(String args[]) {
		String stra11, stra12, stra21, stra22, strb1, strb2;
		// Nhập giá trị a11, a12, a21, a22, b1, b2
		stra11 = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nNhap gia tri cua a11: ",
				"Nhap a11", JOptionPane.INFORMATION_MESSAGE);
		stra12 = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nNhap gia tri cua a12: ",
				"Nhap a12", JOptionPane.INFORMATION_MESSAGE);
		stra21 = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nNhap gia tri cua a21: ",
				"Nhap a21", JOptionPane.INFORMATION_MESSAGE);
		stra22 = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nNhap gia tri cua a22: ",
				"Nhap a22", JOptionPane.INFORMATION_MESSAGE);
		strb1 = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nNhap gia tri cua b1: ",
				"Nhap b1", JOptionPane.INFORMATION_MESSAGE);
		strb2 = JOptionPane.showInputDialog(null, "Phạm Mai Chi- 20214998\nNhap gia tri cua b2: ",
				"Nhap b2", JOptionPane.INFORMATION_MESSAGE);
		// Chuyển đổi các chuỗi thành số thực
		double a11 = Double.parseDouble(stra11);
		double a12 = Double.parseDouble(stra12);
		double a21 = Double.parseDouble(stra21);
		double a22 = Double.parseDouble(stra22);
		double b1 = Double.parseDouble(strb1);
		double b2 = Double.parseDouble(strb2);
		// Tính định thức D, D1, D2
		double D = a11*a22 - a21*a12;
		double D1 = b1*a22 - b2*a12;
		double D2 = a11*b2 - a21*b1;
		// Kiểm tra và hiển thị kết quả
		if (D == 0 && D1 == 0 && D2 == 0) JOptionPane.showMessageDialog(null,"Phạm Mai Chi- 20214998"+"\n"+"He co vo so nghiem");
		else if (D == 0) {
			if (D1 != 0 || D2 != 0) JOptionPane.showMessageDialog(null,"Phạm Mai Chi"+"\n"+"He vo nghiem");
		} else if (D != 0) JOptionPane.showMessageDialog(null,"Phạm Mai Chi"+"\n"+
														"He co 1 nghiem"+"\n"+"x1 = "+(D1/D)+"\n"+
														"x2 = " + (D2/D));
	}

}
