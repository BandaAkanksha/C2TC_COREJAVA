package accenture;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12321;
		int temp=num;
		int rev=0;
		while(num>0)
		{
			
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			System.out.println(rev);
			}
			{
				if (rev==temp)
				
					System.out.println("it is a palindrome");
				else 
				
					System.out.println("it is not a palindrome");   
			}

	}
		

  
}	
