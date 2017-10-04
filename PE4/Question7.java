

import java.util.*;


public class Question7 {

	public static void main(String[] args)  {
        // TODO Auto-generated method stub
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Java");    
        c1.add("C");   
        c1.add("C++"); 
        c1.add("Python");  
        c1.add("JavaScript");
        
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Java");    
        c2.add("C");   
        c2.add("C++"); 
        c2.add("fortran");  
        c2.add("JavaScript");
        
        ArrayList<String> c3= new ArrayList<String>();
        
        int sizeOfTheShortestList = Math.min(c1.size(), c2.size());
        for (int i=0; i<sizeOfTheShortestList; i++) {
            if (c1.get(i).equals(c2.get(i))) {
                c3.add("Yes");
               // System.out.println("Yes" + c1.get(i));
            }
            else {
                c3.add("NO");
                //System.out.println("no");
            }
        }
        System.out.println(c3);
        
    }

}
