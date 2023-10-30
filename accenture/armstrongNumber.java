
public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumofcube=0,a,temp;
		int number=153;
		temp=number;
		while(number>0)
		{
			a=number%10;//getting last digit
			number=number/10;//remove last digit
			sumofcube=sumofcube+(a*a*a);
			
		}
		if(temp==sumofcube)
			System.out.println(temp+"is an armstrong number");
		else
			System.out.println(temp+"is not an armstrong number ");
			

	}

}
