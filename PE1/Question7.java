import java.util.Arrays;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum =0;
		int len = Integer.toString(n).length();
		int[] iarray = new int[len];
		for (int index = 0; index < len; index++) {
		    iarray[index] = n % 10;
		    n /= 10;
		    if (iarray[index] % 2 == 0) {
		    	sum += iarray[index];
		    }
		    
//		    System.out.println(iarray[index]);
		}
		Arrays.sort(iarray);
		for(int i = iarray.length - 1; i >= 0; i--){
			  System.out.print(iarray[i]);
			  
			  
			}
		System.out.println();
		System.out.println("sum of even  numbers "+ sum);
		if (sum>15) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
