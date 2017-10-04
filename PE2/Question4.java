import java.io.*;
public class Question4 {
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
	    FileReader fr = new FileReader("/home/ankur/Desktop/test.txt");

	   int i;
	   while ((i=fr.read()) != -1) {
		   System.out.print((char) Character.toUpperCase(i));
	   }
	      
		
	}

}
