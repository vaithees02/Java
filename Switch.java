package ControlStatement;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int number=sc.nextInt();
      switch(number){
    	  case 1:
    		  System.out.println("happy");
    	  break;
    		  case 2:
        		  System.out.println("sad");
        	  break;
        		  case 3:
            		  System.out.println("good");
            	  break;
    		 default:
    			 System.out.println("Invalid value");
         break;
      }
	}
}
