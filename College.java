package training;

import java.util.Scanner;

public class College {
//	String name;
	//int age;
//	int mobile_no;
	//String address;
	/*public College(String Student_name,int Age,int Mobile_no,String Address) {
		name=Student_name;
		age=Age;
		mobile_no=Mobile_no;
		address=Address;
		System.out.println("Name: "+Student_name+" ;Age: "+Age+" ;Mobile: "+Mobile_no+" ;Address: "+Address);
		
	}*/
	
	public static void main(String[] args) {
	
	int a=0;
	while(a<=0) {
		String Student_name;
		int Age,Mobile_no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Student details:");
	System.out.print("Enter the Student_name: ");
     Student_name=sc.next();
	System.out.print("Enter the Age: ");
	 Age=sc.nextInt();
		System.out.print("Enter the Address: ");
		 String Address=sc.nextLine();
	System.out.print("Enter the Mobile_no: ");
	 Mobile_no=sc.nextInt();

	 

	System.out.println("Student_name: "+Student_name);
	System.out.println("Age: "+Age);
	System.out.println("Mobile_no: "+Mobile_no);
	System.out.println("Address: "+Address);
	a++;
	}
	}

}
