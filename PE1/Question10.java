import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.next();
        int len = input1.length();
        int input2 = scan.nextInt();
        System.out.print(input1);

       for (int j = 0; j < input2; j++) {
            
           for(int i = len-input2;i<=len-1;i++) {
                
               System.out.print(input1.charAt(i));
                
           }
        }

   }
}