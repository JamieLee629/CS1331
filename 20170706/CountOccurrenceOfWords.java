
import java.util.*;

public class CountOccurrenceOfWords {
  public static void main(String[] args) {
    // Set text in a string
    String text = "I do not like green eggs and ham." +
      "I do not like them Sam I Am!";

    // Create a TreeMap to hold words as key and count as value
    Map<String, Integer> map = new TreeMap<>();

    String[] words = text.split("[\\s+\\p{P}]");
    for (int i = 0; i < words.length; i++) {
      String key = words[i].toLowerCase();
      
      if (key.length() > 0) {
        if (!map.containsKey(key)) {
          map.put(key, 1);
        }
        else {
          int value = map.get(key);
          value++;
          map.put(key, value);
        }
      }
    }

    // Display key and value for each entry
    ArrayList<String> keys = new ArrayList<>(map.keySet()); //creates a list from the set of keys
    for (String k:keys) {
       System.out.println(k + "\t" + map.get(k));
    }

  }
}
