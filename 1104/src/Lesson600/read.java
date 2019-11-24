package Lesson600;


import java.io.FileInputStream;
import java.io.IOException;


public class read {
	public static void main(String args[]) {

		try {
			FileInputStream f = new FileInputStream("read.java");
			int b;

			while((b=f.read())!= -1) {
				System.out.print((char)b);
			}
			System.out.flush();
		}catch(IOException e) { e.printStackTrace();}
	}
}
