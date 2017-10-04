import java.util.Scanner;
import java.util.logging.Logger;
public class Pe3 {

public interface Selector {
	public void end(int a);
	public void current(int b);
	public void next(int c);
}

    static int size;
    public static class Sequence{
        
         
         
        public class ReverseSequenceSelector implements Selector{
            
            @Override
            public void end(int last) {
                // TODO Auto-generated method stub
                System.out.println(0);
                System.exit(last);
                
            }
            @Override
            public void current(int present) {
                // TODO Auto-generated method stub
                System.out.println(present);
                next(present-1);
            }
            @Override
            public void next(int next1) {
                // TODO Auto-generated method stub
                if(next1==0)
                    end(next1);
                else
                    current(next1);
                
            }
         }
        void Display() {
            ReverseSequenceSelector revSeq= new ReverseSequenceSelector();
            revSeq.current(size);
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.print("Enter the size:");
     size=scan.nextInt();
     Sequence seq=new Sequence();
     seq.Display();
    
    }
}
