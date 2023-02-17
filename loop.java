package training;

public class loop {

	public static void main(String[] args) {
	loop l=new loop();
    l.a();
    System.out.println("------");
    l.b();
    System.out.println("------");
    l.c();
    System.out.println("------");
    l.d();
    System.out.println("------");
    l.e();
    System.out.println("------");
    l.f();
    System.out.println("------");
    l.g();
	}

	public void g() {
				
	}

	public void f() {
		int	div=2;
		int no1=15;
		int no2=25;
		int greatest=25;
		while(div>greatest) {
			if(no1%div==0 || no2%div==0){
			System.out.println(div);
			}
			int a=0;		
			div=div+1;
		}
	}

	public void e() {
		
	int	div=1;
	int no1=0;
	int no2=25;
	int small=15;
	while(div<=small) {
		if(no1%div==0 && no2%div==0){
		System.out.println(div);
		}
		div=div+1;
	}
		
	}

	public void d() {
		// TODO Auto-generated method stub
		int a=0;
		int n=50;
		int div=2;
		while(div<50) {
			if(n%div==0) {    //break option loop ah cracked
			a=div;
			}
			div=div+1;
		}
		 System.out.println(a);
	
	}

	public void c() {
		int n=50;
		int div=2;
		while(div<50) {
			if(n%div==0) {    //break option loop ah cracked
				System.out.println(div);
				break;
			}
			div=div+1;
		}
		
	}

	public void b() {
		int a=1;
		while(a<=1000) {
			if(a%5==0 && a%3==0 && a%7==0) {
				System.out.println(a);
			}
			a=a+1;
		}
	}
		public void a() {
			int n=100;
			while(n<1000) {
				if(n%3==0) {
				System.out.println(n);
				}
				n=n+1;
			
	}
}
}

	
	

