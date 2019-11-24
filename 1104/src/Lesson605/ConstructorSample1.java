package Lesson605;



class ConstructorSample1{
	
	ConstructorSample1(){
	System.out.println("ConstructorSample1のコンストラクタ");
}

public static void main(String[] args) {
	System.out.println("コンストラクタ呼び出し前");
	ConstructorSample1 Sample1 = new ConstructorSample1();

	System.out.println("コンストラクタ呼び出し後");
}
}
