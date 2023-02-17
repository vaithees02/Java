package training;

import java.util.Arrays;

public class Jan30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*     int[] a= {3,1,2,0,5,4,6};
           int i=a[a[0]];
           int m=a[i];
           int r=a[m*2];
           System.out.println(a[i]+a[r]);*/
    Jan30 sort=new Jan30();
    sort.Bubble();
 //   sort.Bubble2();
	}

	private void Bubble2() {
		// TODO Auto-generated method stub
		
	}

	private void Bubble() {
		int[] a= {7,8,12,10,6,13,4};
		System.out.println(Arrays.toString(a));
		
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(a[j-1]>a[j]) {
				int	temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int sum=0;
		
		for(int index=0;index<a.length;index++) {
		sum=sum+a[index];
		}
    System.out.println(sum);

	}
}