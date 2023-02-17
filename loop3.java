package training;

public class loop3 {
    
	public static void main(String[] args) {
		loop3 lo=new loop3();
		//lo.ad(12345);
		//lo.b();
		int no=1;int prime=0;
		while(no<=50) {
			lo.c(no);
			no++;
			prime++;
		}
	
	}

	public void c(int no) {
     int div,count;
     div=2;count=0;
     while(div<no) {
		if(no%div==0) {
			//System.out.print(div+" ");
			count++;
			
		}
		div++;
     }
    // System.out.println();
     //System.out.println(count);
     if(count==0) {
    	
	System.out.println(no+ "  is prime number");
	;
     }//else {
		//System.out.println(no+ "is not prime no");
     //} 
    
	}
	public void b() {
		int i=12345;
		int total=0;
		while(i>0) {
			System.out.print(i%10);
			total=total+i%10;
			i=i/10;
		}
		System.out.println("--------");
		System.out.println(total);
		int a=0;
		while(total>0) {
			a=a+total%10;
		total=total/10;
		}System.out.println(total);
		System.out.println(a);
	}

	public void ad(int a) {
		int total=0;
		while(a>0) {
			System.out.print(a%10);
			total=total+a%10;
			a=a/10;
			}
		System.out.println("\n--------");
		if(total>9) 
	           ad(total);
	        else
	        System.out.println(total);	   
	}
	}
