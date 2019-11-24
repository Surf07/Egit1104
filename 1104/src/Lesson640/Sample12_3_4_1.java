package Lesson640;//418



interface SampleIF1{
	public static final int NUM = 500;
	public abstract void showNUM();
}

interface SampleIF2{
	public static final int VAL = 1000;
	public abstract void showVAL();
}


class SampleCls implements SampleIF1,SampleIF2 {

	@Override
	public void showNUM() {
		System.out.println(NUM);
	}
	@Override
	public void showVAL() {
		System.out.println(VAL);
	}
}

public class Sample12_3_4_1 {
	public static void main(String[] args) {
		SampleCls sc = new SampleCls();
		sc.showNUM();
		sc.showVAL();
	}
}



