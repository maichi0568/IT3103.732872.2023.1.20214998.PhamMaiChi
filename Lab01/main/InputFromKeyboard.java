package main;
import java.util.Scanner;
public class InputFromKeyboard {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		// Yêu cầu nhập tên
		System.out.println("Pham Mai Chi- 20214998\nWhat's your name?");
		String strName = keyboard.nextLine();
		// Yêu cầu nhập tuổi
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		// Yêu cầu nhập chiều cao
		System.out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		
		System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. "
				+ "Your height is " + dHeight + ".");
	}

}
