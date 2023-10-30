//WAp for swapping a two numbers and also swap the two number without using variable
package accenture;

public class swapNumber {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int x=100;
	    int y=200;
	    /*
		System.out.println("before swapping");
		System.out.println("x ="+x);
		System.out.println("y ="+y);
	    int temp=x;//storing x in temp
		x=y;//assigning y to x
		y=temp;//assigning x to y i.e temp
	    System.out.println("after swapping");
		System.out.println("x ="+x);
	    System.out.println("y ="+y);
	    */
		x=x-y;
		y=x+y;
		x=y-x;
		System.out.println(x);
		System.out.println(y);
		

	}

}
