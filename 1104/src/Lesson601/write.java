package Lesson601;




import java.io.FileOutputStream;
import java.io.IOException;


public class write {
	public static void main(String[] arg) {

		byte data[] = {'w','r','i','t','e','.','j','a','v','a'};

		try {
			FileOutputStream f = new FileOutputStream(arg[3]);
			f.write(data);
			f.close();
		}catch(IOException e) {e.printStackTrace();}
	}
}
