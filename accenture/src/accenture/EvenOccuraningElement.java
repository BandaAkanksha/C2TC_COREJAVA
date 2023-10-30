package accenture;

public class EvenOccuraningElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("elements of the array are ");
		for (int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("even number are ");
		for(int i=0;i<num.length;i++)
		if (num[i]%2==0)
		{
			System.out.println( num[i]);
		}
		System.out.println("odd number are ");
		for (int i=0;i<num.length;i++)
			if(num[i]%2==1)
		{
		System.out.println(num[i]);
		}

	
	}

}
