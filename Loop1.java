package looping;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the starting number:");
      int s=sc.nextInt();
      System.out.println("Enter the ending number:");
      int e=sc.nextInt();
      
      for(int a=s;a<=e;a++) {
    	  if(a/2==0 && a/4==0) {
    		 System.out.println(a);
    	  }
    	  
      }
	}

}
