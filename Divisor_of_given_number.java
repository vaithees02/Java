package looping;

import java.util.Scanner;

public class Divisor_of_given_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Divisor of given number: ");
	int n=sc.nextInt();
	int div=1;
	int count=0;
	while(div<n) {
	if(n%div==0) {
		System.out.println(div);
		count++;
	}
	div++;
	}
	System.out.println("count of divisor:"+count); 
	}

}
