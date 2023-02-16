package looping;

public class Reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int plate=1234;int count=0;
      while(plate>0) {
      System.out.print(plate%10+" ");
      plate=plate/10;
      count++;
	}
      System.out.println("");
      System.out.println("count of digits: "+count);
	}
}
