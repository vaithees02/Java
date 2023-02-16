package looping;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Prime number: ");
		int prime=sc.nextInt();
		int no=2;int count=0;
		while(no<prime) {
			if(prime%no==0) {
				System.out.println("its not prime");
			     count++;
			     break;
			}
				no++;
		}
		if(count==0) {
			System.out.println("its prime");
		}

	}

}
