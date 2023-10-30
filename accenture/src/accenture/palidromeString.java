package accenture;

public class palidromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String n=s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			rev=rev+c;
			
		}
		System.out.println(rev);
		if(rev.equals(n))
		{
			System.out.println("it is a palidrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}

	}

}
