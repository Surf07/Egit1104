package Lesson652;




class SampleClass{

	private String str;

	public void fnc() {
		System.out.println("fnc");

		this.str = "hoge";
		this.fnc2();
	}

	public void fnc2() {
		System.out.println("fnc2");
		System.out.println(str);
	}
}

public class Test {
	public static void main(String args[]) {
		
		SampleClass sb = new SampleClass();
		sb.fnc();
	}
}
