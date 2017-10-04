import java.util.*;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.next();
		}
		ArrayList<String> arraylist= new ArrayList<String>(Arrays.asList(arr));
		arraylist.add("Something");
		for (String str: arraylist)
		  {
			System.out.println(str);
	       	  }

	}

}
