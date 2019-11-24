package Lesson639;



interface SampleIF{
	public static final int NUM = 500;
	public abstract void show();
}


class SampleCls implements SampleIF{
	@Override
	public void show() {
		System.out.println(NUM);
	}
}

public class Sample12_3_4_0 {
	public static void main(String[] args) {

		SampleCls sc = new SampleCls();
		sc.show();
	}

}
