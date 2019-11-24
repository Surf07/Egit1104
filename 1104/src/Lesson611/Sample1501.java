package Lesson611;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1501 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));

		System.out.println("なんか入力して下さい。");
		String s = new String(in.readLine());

		System.out.println("入力値は「"+s+"」です。");
	}
}
