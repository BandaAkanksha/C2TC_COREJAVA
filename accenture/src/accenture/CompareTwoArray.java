package accenture;

public class CompareTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a1= {2,5,1,7,4,9};
		int[]a2= {2,5,1,7,4,9};
		boolean equalOrNot=true;
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					equalOrNot=false;
				}
			}
		}
					
		else
		{
			equalOrNot=false;
		}
		if (equalOrNot)
		{
		System.out.println("two array are equal");
		}
		else
		{
			System.out.println("two array are not equal");
		}
		

	}
}


