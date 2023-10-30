//WAP to check the number is spy number or note
package accenture;

public class spyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int sum=0;
		int mul=1;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			num=num/10;
		}
		if(sum==mul)
		{
			System.out.println("spy number");
		}
		else
		{
			System.out.println("not a spy number");
		}
	}

}
