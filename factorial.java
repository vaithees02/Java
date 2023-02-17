package training;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* for(int no=1;no<=7;no++)
        {
	    System.out.println("* ");
        }*/
		factorial f=new factorial();
		//f.v();
		//f.i();
	     //f.h();
		f.t();
		//f.a();
	/*
		for(i		System.out.print("* ");
			}
			System.out.println("  ");
		}
	}nt row=1;row<=10;row++)
		{
			for(int col=1;col<=7;col++)
			{
				if(row==1 && col>=1 && col<=6 || col==1 || row==5&&col>=1&&col<=6 || row-col==4 || col==7&&row>=2&&row<=4){
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();         //  if(row==1 && col>=1 && col<=6 || col==1 || row==5&&col>=1&&col<=6 )
		}*/

}

	public void a() {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(col==1&&row>=4&&row<=7 ||row+col==4||col==4||row+col==8&&col<=4) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

	public void t() {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(col==4||row==3&&col<=2&&col>=6) {
				System.out.print("* ");
			}else {
			System.out.println("  ");
		    }
			}
			System.out.println();
		}
	}

	public void h() {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(col==2) {
					System.out.print("* ");
				}else {
				System.out.println("  ");
			    }
				}
				System.out.println();
			}
		
	}

	public void i() {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(col==2) {
					System.out.print("* ");
				}else {
				System.out.println("  ");
			    }
				}
				System.out.println();
			}
	}

	public void v() {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(col==2) {
					System.out.print("* ");
				}else {
				System.out.println("  ");
			    }
				}
				System.out.println();
			}
}
}
