import java.util.Scanner;
public class EvenNumTest {
	public static boolean isEven(int number) {
        if(number%2==0) {
        return true;}
        else return false;
        }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int num =scan.nextInt();
	        if(isEven(num)==true) {
	            System.out.println("True");
	        }
	        else System.out.println("False");
	    
		

	}

}
