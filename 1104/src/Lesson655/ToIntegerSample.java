package Lesson655;//435



public class ToIntegerSample {
	public static void main(String args[]) {

		int i = 10000;

		System.out.println("10進数:" +i);
		System.out.println("2進数:" + Integer.toBinaryString(i));
		System.out.println("8進数"  + Integer.toOctalString(i));
		System.out.println("16進数" + Integer.toHexString(i));
	}
}
