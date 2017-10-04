import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean answer = isPowerOfFour(n);
		if (answer == true) {
			System.out.println("True");
		}
		else {
			System.out.println(" False");
		}

	}
	public static boolean isPowerOfFour(int num) {
	    while(num>0){
	        if(num==1){
	            return true;
	        }
	 
	        if(num%4!=0){
	            return false;
	        }else{
	            num=num/4;
	        }
	    }
	 
	    return false;
	}

}
