package Lesson623;//410



class Super{
	int num;
}

class Sub extends Super{
	int num;

	public void get(int n) {
		num = n;
		super.num = n*100;
	}
}

public class Sample12_1_7_0 {
	public static void main(String[] args) {
		Sub sb = new Sub();
		sb.get(100);
		System.out.println(sb.num);

		Super spr = sb;
		System.out.println(spr.num);
	}
}
