package accenture;

public class EvenLengthInString {
	for(String word:s.split(""))
	{
		if(word.length()%2==0)
			System.out.println(word);
	}

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		/*
		String s1="Akanksha";
		int n1=s1.length();
		
		String s2="banda";
		int n2=s2.length();
		
		if(n1%2==0)
		{
			System.out.println(s1);
		}
		if(n2%2==0)
		{
			System.out.println(s2);
		}
		*/
		String s="i am software developer";
		printWords(s);
		
	}

}
