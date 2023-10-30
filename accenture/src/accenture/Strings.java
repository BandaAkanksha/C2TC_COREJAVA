package accenture;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="software";
		String n=new String("Ram");
		s=s.toLowerCase();
		System.out.println(n);
		
		
		
		s=s.toUpperCase();
		System.out.println(s);
		
		s=s.concat("developer");
		System.out.println(s);
		
		
		String s1="raja vikrmaditya";
		s1=s1.substring(4);
		System.out.println(s1);
		
		String s2="mahendra singh";
		s2=s2.substring(0,5);
		System.out.println(s2);
		
		String s3="Ram";
		System.out.println(s3.length());
		System.out.println(s3.isEmpty());
		
		String s4="";
		System.out.println(s4.isEmpty());
		String s5="andman and Nicobar";
		char[]x=s5.toCharArray();
		System.out.println(x);
		
		String[]y=s5.split(" ");
		System.out.println(y);
		}

}
