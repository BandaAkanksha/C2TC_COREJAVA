package accenture;

public class StringToStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="geeks for geeks";
		String a[]=s1.split(" ");
		System.out.println("String :"+ s1);
		System.out.println("string array :[");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+ ", ");
		}
		System.out.println("]");
		
		

	}

}
