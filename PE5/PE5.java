import java.util.Scanner;

public class PE5 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countable c1 = (sentence) -> {
			return sentence.length();
		};
		Scanner scan = new Scanner(System.in);
		String something = scan.nextLine();
		System.out.println(c1.Count(something));

	}

}
