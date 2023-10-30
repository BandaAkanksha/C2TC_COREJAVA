package accenture;
import java.util.Scanner;

public class InsertElementinArray {

	public static void main(String[] args) {
		int n,pos,x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of elements you want in a array");
		n=s.nextInt();
		int a[]=new int[n+1];
		System.out.println("enter all elements :");
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the position where you want to insert:");
		pos=s.nextInt();
		System.out.println("enter number");
		x=s.nextInt();
		/*int []a= {1,2,3,4,5};
		 x=3;
		 pos=2;
	     n=a.length+1;
	     */
		for(int i=(n-1);i>=(pos-1);i--)
		{
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.println("after inserting:");
		for(int i=0;i<n;i++)
		{
		System.out.println(a[i]+",");
		{
			System.out.println(a[n]);
		}
			
			
		}
		

	}

}
