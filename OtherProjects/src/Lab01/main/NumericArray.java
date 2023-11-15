package Lab01.main;
import java.util.Arrays;
public class NumericArray {

	public static void main(String args[]) {
		int[] numbers = {12, 23, 10, 9, 19};
		// Sap xep mang
		// Bubble sort
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Sap xep numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
		System.out.println("Mang da duoc sap xep: " + Arrays.toString(numbers));
		int sum = 0;
		// Tinh tong cac phan tu trong mang
		for ( int i : numbers) {
			sum += i;
		}
		// Tinh trung binh gia tri cac phan tu trong mang
		double average = (double) sum/numbers.length;
		
		System.out.println("Tong cac phan tu trong mang: " + sum);
		System.out.println("Trung binh gia tri cac phan tu: " + average);
	}

}
