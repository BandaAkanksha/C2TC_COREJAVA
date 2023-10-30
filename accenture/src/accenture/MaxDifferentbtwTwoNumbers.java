package accenture;

public class MaxDifferentbtwTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {5,8,7,4};
		int n=a.length;
		int diff,greatest_diff;
		greatest_diff=0;
		int a1=0,a2=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				diff=Math.abs(a[i]-a[j]);
				if(diff>greatest_diff)
				{
				greatest_diff=diff;
				a1=i;
				a2=j;
				}
			}
		}
		System.out.println("greatest difference:"+ greatest_diff);
		System.out.println("two elemets with largest difference:"+a[a1]+"and"+a[a2]);

	}

}
