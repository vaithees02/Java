package training;

public class Library {
static String libraryName="Gopal";
static int fees;
String readerName="ram";
	public Library(int fees) {
		// TODO Auto-generated constructor stub
		
		System.out.println(fees);
	
	}

	public Library(int i, int j) {
		System.out.println("parameter");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library reader=new Library(1000,200);
System.out.println(reader.readerName);
reader.num(10,20);
reader.bookfees();
System.out.println(reader.fees);
	}

	public void bookfees() {
		// TODO Auto-generated method stub
		System.out.println("fees");
	}

	public void num(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}

}
