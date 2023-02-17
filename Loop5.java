package training;

public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Loop5 H=new Loop5();
    // H.primes(); prime number
     //H.prime2();
    // H.primes1();
     H.reverse();  //reverse and polindrome
	}
	private void reverse() {
		// TODO Auto-generated method stub
		int no=1234;
		int rev=0;
		while(no>0) {            //reverse
			rev=(rev*10)+no%10;
			no=no/10;
		}
		System.out.println(rev);
		if(no==rev) {
			System.out.println("number is palindrome");
		}else
		{
			System.out.println("number is not palindrome");
		}
	}
	private void primes1() {
		// TODO Auto-generated method stub
		int no=1234;
		int total=0;
		while(no>0) {
			total=total+no%10;
			no=no/10;
			total++;
		}
		System.out.println(total);
	}
	private void prime2() {
		int no=0;
		while(no<2) {
			int no1=5;
			while(no1>0) {
				System.out.print(no1+" ");
				no1--;
			}
			System.out.println(" ");
			System.out.println(no);
			no++;
			
		}
		
	}
	private void primes() {
		// TODO Auto-generated method stub
	int no=1;
	int prime=0;
	while(prime<20) {
		int div=2;
		int count=0;
		while(div<no) {
		if(no%div==0) {
			count++;
		}
		div++;
	}
	if(count==0) {
		System.out.println(no);
		prime++;
	}
no++;
	}
	}
}
