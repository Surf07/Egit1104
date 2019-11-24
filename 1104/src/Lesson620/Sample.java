package Lesson620;//407



class Super{ int num; }


class Sub extends Super{

	int num;
	public void get(int n) {
		super.num = n;
		num = n*100;
	}
}

public class Sample {
	public static void main(String[] args) {

		Sub sb = new Sub();
		sb.get(100);
		System.out.println(sb.num);

		Super spr = sb;
		System.out.println(spr.num);
	}
}
