package training;


public class state {
public static void main(String[] args) {
	state s=new state();
	s.loop3();
	System.out.println("---");
	s.loop2();
	s.loop1();
	s.loop4();
	s.loop5();
	
}
public void loop5() {
   int no=1;
   int mul=5;
   while(no<=20) {
	   System.out.println(no*mul);
	   no=no+1;
   }
}
public void loop4() {
   int v=1;
   while(v<=5) {
	   System.out.println(v*3);
	   v=v+1;
   }
	
}
public void loop3() {
	int a=9;
	while(a>=-1) {
		System.out.print(a+" ");
		a=a-2;
	}
	
}
public void loop1() {
	int purse=0;
	while(purse<=5)
	{
	System.out.println(purse+" ");
	purse=purse+1;
	}
}
	public void loop2() {
		int count=5;
		while(count>=1)
		{
		System.out.print(count+" ");
		count=count-1;
		}
}
}
