package accenture;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a[]={10,20,30,40,50};
		System.out.println("original order:");
		for (int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		System.out.println("reverse order:" );
		for (int i=a.length-1;i>=0;i--)
		{
		System.out.println(a[i]);
		}
		*/
		int []n= {10,20,30,40,50};
		int a=n.length;
		int []b=new int[a];
		int j=a;
		for(int i=0;i<a;i++)
			
		{
			b[j-1]=n[i];
			j=j-1;
		}
		System.out.println("reversed array is:");
		for(int k=0;k<a;k++)
		{
			System.out.println(b[k]);
		}


	}

}
