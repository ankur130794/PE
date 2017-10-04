import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		Scanner in = new Scanner(System.in);

        for(int i=1;i<=2;i++){

          String a="val"+i;

         String b=in.next();
         map.put(a, b);

      }
            String c=map.get("val1");
            map.put("val1","");
        	map.put("val2", c);
        	
        	System.out.println(map.toString());
        

	}

}
