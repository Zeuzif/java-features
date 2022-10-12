package java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * the resource is no more needed to be declared localy in try with
		 * resource block
		 */
		FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");
		try (fileStream) {
			fileStream.flush();
		} catch (IOException e1) {
			System.out.println("Error");
		}
	}

}
