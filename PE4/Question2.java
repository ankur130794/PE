import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c= "one one -one___two,,three,one @three*one?two";
        Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
        Matcher match= pt.matcher(c);
        while(match.find())
        {
            String s= match.group();
        c=c.replaceAll("\\"+s, " ");
        }
//        System.out.println(c);
        String[] splitStr = c.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word: splitStr) {
            if (wordCount.containsKey(word)) {
                // Map already contains the word key. Just increment it's count by 1
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Map doesn't have mapping for word. Add one with count = 1
                wordCount.put(word, 1);
            }
        }
        
        for (Entry<String, Integer> entry: wordCount.entrySet()) {
            System.out.println("Count of : " + entry.getKey() + 
                               " in sentence = " + entry.getValue());
        }  
        
	}

}
