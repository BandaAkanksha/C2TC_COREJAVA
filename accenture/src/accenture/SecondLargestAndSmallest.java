/*package accenture;


public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7,9,11};
		int temp=0;
		for (int i=0;i<a.length;i++)
		{
			for( int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
				temp =a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
			System.out.println("second largest :"+a[a.length-2]);	
			System.out.println("second smallest:"+a[1]);
		
	}

}
*/
package accenture;

public class SecondLargestAndSmallest {

    public static void main(String[] args) {
        int a[] = {5, 3, 1, 7, 9, 4, 15};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : a) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest: " + secondLargest);
        System.out.println("Second smallest: " + secondSmallest);
    }
}

