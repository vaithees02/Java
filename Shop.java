package training;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shop s=new Shop();

s.fruits("apple","mango");
s.vegetables();

	}

	public void billPayment() {
		// TODO Auto-generated method stub
	System.out.println("1kg tomato rate is 100");
	}

	public void vegetables() {
		// TODO Auto-generated method stub
		String veg1="tomato";
		String veg2="onion";
		System.out.println(veg1);
		this.billPayment();
	}

	public void fruits(String a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
	public void fruits(String a,String b) {
		// TODO Auto-generated method stub
		System.out.println(a +"\n"+b );
	}
	
}
