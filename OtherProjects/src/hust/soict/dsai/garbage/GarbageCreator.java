package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {

	public static void main(String[] args) {
		// Pham Mai Chi 20214998
		var filename = "text.txt";

		byte[] inputBytes = { 0 };
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (Exception e) {}
		var start = System.currentTimeMillis();
		// Pham Mai Chi 20214998
		var output = "";
		for (byte b: inputBytes) {
			output += (char)b;
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}


