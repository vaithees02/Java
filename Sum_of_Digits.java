package looping;

import java.util.Scanner;

public class Sum_of_Digits {
	static int sum1=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub  Sum of Digits
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		Sum_of_Digits sum=new  Sum_of_Digits();
        int result= sum.loop1(a);
		/*
		 * while(result>9) { result= sum.loop1(a); }
		 */
        System.out.println("Enter the sum of digit number:"+result);
        
	}

	private int loop1(int a) {
		// TODO Auto-generated method stub
		
        while(a>0){ 
        	sum1=sum1+a%10;
        	a=a/10;
        	}
        return sum1;
        
	}

}
