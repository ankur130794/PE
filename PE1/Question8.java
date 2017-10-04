import java.util.Random;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand = new Random();
         int  n = rand.nextInt(50);
     System.out.println("Guess no. between between 1 to 50");
     Scanner scan =new Scanner(System.in);
     int input= scan.nextInt();
     if(input<n) {
         System.out.println("Number guessed is less than original number");
     }
     else if(input>n) {
         System.out.println("Number guessed is more than original number");
     }
     else if(input==n) {
         System.out.println(" Number guessed matches the original number");
     }
     else if(input<1 && input>n) {
         System.out.println("the no. should be between 1-50");
     }
     
	}

}
