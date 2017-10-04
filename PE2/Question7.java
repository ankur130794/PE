
public class Question7 {

	public static void main(String[] args) {
        for(int i=0; i<=14;i++ ) {
            System.out.println(Factorial(i));
        }
      }  

public static int Factorial(int n){
     if (n > 12) throw new IllegalArgumentException( n + " is out of range");
     int i,fact=1;  
      int number=n;  
      for(i=1;i<=number;i++){    
          fact=fact*i;    
      }    
      return fact;
 }

	}


