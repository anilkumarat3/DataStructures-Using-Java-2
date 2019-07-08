

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaBook {
	public static void main(String args[]) throws IOException {

		File fi = new File("C:\\Users\\ditnew07021995\\Desktop\\NewFile.text");
		boolean fvar = fi.createNewFile();
		if (fvar)
			System.out.println("File Created Succusfully");
		else
			System.out.println("File is not Created");

		// FileInputStream fis=new
		// FileInputStream("C:\\Users\\ditnew07021995\\Desktop\\Storedata.txt");
		FileInputStream fis = new FileInputStream(fi);
		/*
		 * BufferedInputStream bfs = new BufferedInputStream(fis);
		 * System.out.print((char) bfs.read()); while (bfs.available() > 0) {
		 * System.out.print((char) bfs.read()); }
		 */
		BufferedReader br = new BufferedReader(new FileReader(fi));
		String bre = br.readLine();
		while (bre != null) {
			System.out.println(bre);
			bre = br.readLine();
		}

	}

}
