package Lesson612;//397



class Product{

	private String code;
	private int price;

	public Product() {
		code = "abc";
		price = 100;
	}

	public void setCode(String c) {
		if( c != "") {// cと" "が異なっているならtrue。同じであればelse
			code = c;
		} else {
			System.out.println("商品コードが入力されていません。");
		}
	}

	public String getCode() {
		return code;
	}

	public void setPrice( int p) {
		if( p > 0) {
			price = p;
		} else {
			System.out.println("負の値はセット出来ません。");
		}
	}
	public int getPrice() {
		return price;
	}
}

public class Sample11_7_5_0 {
	public static void main(String[] args) {
		Product pro = new Product();
		pro.setCode("");
		pro.setPrice(-800);

		String cd = pro.getCode();
		int pr = pro.getPrice();

		System.out.println(cd);
		System.out.println(pr);
	}
}
