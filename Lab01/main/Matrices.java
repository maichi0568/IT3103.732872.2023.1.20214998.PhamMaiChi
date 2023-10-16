package main;
import java.util.Scanner;
public class Matrices {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		// Nhap so hang va cot cua ma tran
		System.out.print("Pham Mai Chi- 20214998\nNhap so hang cua ma tran: ");
		int row = keyboard.nextInt();
		System.out.print("Pham Mai Chi- 20214998\nNhap so cot cua ma tran: ");
		int col = keyboard.nextInt();
		
		// Khai bao mang hai chieu
		int[][] matrixA = new int[row][col];
		int[][] matrixB = new int[row][col];
		int[][] matrixResult = new int[row][col];
		
		// Nhap so hang va cot cho ma tran A va B
		System.out.println("Nhap hang va cot cho ma tran A: ");
		inputMatrix(matrixA, keyboard);
		System.out.println("Nhap hang va cot cho ma tran B: ");
		inputMatrix(matrixB, keyboard);
		
		// Cong hai ma tran A va B
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
            	matrixResult[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
		
		// Hien thi ma tran
		System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);
        System.out.println("Tong cua hai ma tran la: ");
        displayMatrix(matrixResult);

	}
	// Phuong thuc de nhap gia tri cho ma tran
	public static void inputMatrix(int[][] matrix, Scanner keyboard) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.println("Nhap cac phan tu o hang thu "+(row+1)+ " va cot thu "+(col+1));
				matrix[row][col] = keyboard.nextInt();
			}
		}
	}
	
	// Phuong thuc de hien thi ma tran
	public static void displayMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + "\t");
			} System.out.println();
		}
	}
}
