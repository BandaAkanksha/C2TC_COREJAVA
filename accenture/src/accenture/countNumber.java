package accenture;

public class countNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=87469877;
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			count++;
			num=num/10;
		
		}
		System.out.println(count);
		

	}

}
