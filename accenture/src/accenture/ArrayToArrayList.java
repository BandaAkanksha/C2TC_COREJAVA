package accenture;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]array=new String[]{"android","jsp","java","struts","hadoop"};
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(array));
		System.out.println(list);

	}

}
