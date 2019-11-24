package Lesson641;//419



interface SampleIF1{
	public static final int NUM = 100;
	public abstract void multiplier(double n);
	public abstract void divider(double n);
}


class SuperCls{

	double val;
	void show() {
		System.out.println(val);
	}
}

class SubCls extends SuperCls implements SampleIF1{
	@Override
	public void multiplier(double n) {
		if (NUM > n) {
			val = n*2;
		}else {
			val = n;
		}
	}
     @Override
     public void divider(double n) {
    	 if (NUM < n)
    		 val = n / 2;
    	 else {
    		 val = n;
    	 }
     }
     @Override
     void show() {
    	 System.out.println("処理結果は" + val);
     }
}

public class Sample12_3_5_0 {
	public static void main(String[] args) {
		SubCls sc = new SubCls();
		sc.multiplier(50);
		sc.show();

		sc.divider(300);
		sc.show();
	}
}




