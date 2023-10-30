package accenture;

public class OccuranceOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num= {1,3,4,2,5,6,7,8,4,4};
		int count=0;
		System.out.println("elements of array are");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==4)
			{
				count++;
			}
		}
		System.out.println("count = " + count);
	}

}
