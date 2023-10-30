package accenture;

public class sumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5675;
		int sum=0;
		while (num>0)
		{
			int rem=num%10;//fetching last digit
			sum=sum+rem;//total sum
			num=num/10;
		}
		System.out.println(sum);

	}

}
