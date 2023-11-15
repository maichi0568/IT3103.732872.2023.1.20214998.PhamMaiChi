package Lab01.main;

import java.util.Scanner;

public class Triangle {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		// Yêu cầu người dùng nhập chiêu cao của tam giác
		System.out.println("Nhap chieu cao cua tam giac: ");
		int n = keyboard.nextInt();
		for (int i=1; i<=n; i++) {
			// In ra số khoảng trắng
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			// In ra dấu sao (*)
			for (int k=1;k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
