package training;

public class loop2 {
public static void main(String[] args) {
	loop2 a=new loop2();
	a.ad();
	a.bd();
	a.cd();
	a.dd();
}
public void dd() {
	// TODO Auto-generated method stub
	
}

public void cd() {
	int i=12345;
	int total=0;
	int a=0;
	while(i>0) {
		total=total+i%10;
		i=i/10;
	}
	a=total%10;
	total=total/10;
	System.out.println(total+a);
}
public void bd() {
	int no=12345;
	int total=0;
		while(no>0) {
		total=total+(no%10);
		
		no=no/10;
		}
		System.out.println(total);
}
public void ad() {
int no=12345;
int count=0;
	while(no>0) {
		System.out.print(no%10);     //reverse a given number program
		no=no/10;
		count++;
}
	System.out.println(count);
}
}
