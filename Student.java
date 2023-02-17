package training;

import java.util.Scanner;

public class Student
{
      public static void main(String args[])
      {
    	  int a=0;
    	  while(a<=0) {
          String name;
          int roll, maths, tamil, english;
          Scanner SC=new Scanner(System.in);
          System.out.println("Student Details:"); 
          System.out.print("Enter Name: ");
          name=SC.nextLine();
          System.out.print("Enter Roll Number: ");
          roll=SC.nextInt();
          System.out.print("Enter marks in Maths, Tamil and English: ");
          maths=SC.nextInt();
          tamil=SC.nextInt();
          english=SC.nextInt();
          int total=maths+english+tamil;
          float perc=(float)total/3;
          System.out.println("Roll Number:" + roll +"\tName: "+name);
          System.out.println("Marks :");
          System.out.println("Tamil :"+tamil);
          System.out.println("English :"+english);
          System.out.println("Maths :"+maths);
          System.out.println("Total: "+total +"\tPercentage: "+perc);
    	  a++;
    	  }
      }
          
}