package accenture;

import java.util.HashSet;

public class intersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int []a1= {1,2,3,4,5};
		int []a2= {6,7,3,9,10,5};
		System.out.println("intersection of two arrays :");
		for (int i=0;i<a1.length;i++) 
		{
		for(int j=0;j<a2.length;j++)
		{
			if(a1[i]==a2[j])
			{
				System.out.println(a2[j]);
			}
			
		}
		}
		*/
		String[]s1= {"one","two","three","four","five","four"};
		String[]s2= {"three","four","five",};
		HashSet<String>set=new HashSet<String>();
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s2.length;j++) 
			{
				if(s1[i].equals(s2[j]))
			 {
					set.add(s1[i]);				
			 }
			}
		}

	}

}
