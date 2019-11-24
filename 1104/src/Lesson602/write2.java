package Lesson602;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class write2 {
	public static void main(String argv[]) {

		try {
			FileOutputStream f = new FileOutputStream(argv[0]);
			PrintWriter p = new PrintWriter(f);

			float fI = 3.1415f;

			p.println("your float value is;" + fI);
			p.close();
		} catch(IOException ioe) {}
	}
}
