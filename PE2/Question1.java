import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		int len = n.length();
		char[] array = n.toCharArray();
		for (int i=len-1;i>=0;i--) {
			System.out.print(array[i]);
		}
		boolean answer = istPalindrom(array);
		if (answer == true) {
			System.out.println(" is palindrome");
		}
		else {
			System.out.println(" is not a palindrome");
		}
	}
	
	
	
	public static boolean istPalindrom(char[] word){
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
	}

}
