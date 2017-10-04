import java.util.Arrays;
import java.util.Scanner;

public class PE6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("  Enter the number of students: ");
        int nos= scan.nextInt();
        int[] arros= new int[nos];
        int sum =0;
        for(int i=0;i<nos;i++) {
            System.out.println("  Enter the number of student"+(i+1)+":");
            arros[i]=scan.nextInt();
            sum+=arros[i];
        }
        Arrays.sort(arros);
        float avg=sum/nos;
        System.out.println( "The average is"+ avg);
        System.out.println("The minimum is"+ arros[0]);
        System.out.println(" The maximum is"+ arros[nos-1]);
        
        
    
    }}