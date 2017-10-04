import java.math.BigInteger;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i <=22 ; i++ ) {
            System.out.println(factorial(i));
        }
    }
    
    
    public static String factorial(int n) {
           BigInteger fact = new BigInteger("1");
           for (int i = 1; i <= n; i++) {
               fact = fact.multiply(new BigInteger(i + ""));
           }
           return fact.toString();
       }
}