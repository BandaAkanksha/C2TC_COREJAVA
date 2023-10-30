package accenture;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {5,25,98,56,34};	
		System.out.println("original order:");
		{
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
		}

	}
		System.out.println("descending order :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(a.length-1);

}
}
