import java.util.Scanner;

public class first {

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
		    sum += iarray[index];
//		    System.out.println(iarray[index]);
		}
		boolean answer = istPalindrom(iarray);
		if (answer == true && sum>25) {
			System.out.println("number is palindrome and sum > 25");
		}
		else if(answer == true && sum<=25) {
			System.out.println("number is palindrome and sum <= 25");
		}else {
			System.out.println("number is not a palindrome");
		}
		
	}

public static boolean istPalindrom(int[] word){
    int i1 = 0;
    int i2 = word.length - 1;
    while (i2 > i1) {
        if (word[i1] != word[i2]) {
            return false;
        }
        ++i1;
        --i2;
    }
    return true;
}}
