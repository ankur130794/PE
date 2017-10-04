import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.next();
		}
		Map<String, Boolean> wordCount = new HashMap<>();
        for (String word: arr) {
            if (wordCount.containsKey(word)) {
               
                wordCount.put(word, true);
            } else {
               
                wordCount.put(word, false);
            }
        }
        System.out.println(wordCount.toString());
//        for (Entry<String, Boolean> entry: wordCount.entrySet()) {
//            System.out.println(entry.getKey() + 
//                               " = " + entry.getValue());
//        }  
	}

}
