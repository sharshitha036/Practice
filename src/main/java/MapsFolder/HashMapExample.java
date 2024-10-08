package MapsFolder;

import java.util.HashMap;
import java.util.Map;

/**HashMap is a part of Java’s collection since Java 1.2. It provides the basic implementation of the Map interface of Java.
 * It stores the data in (Key, Value) pairs. To access a value one must know its key. This class uses a technique called Hashing.
 * Hashing is a technique of converting a large String to a small String that represents the same String. */

public class HashMapExample {

        public static void main(String[] args)
        {

            Map<String, Integer> map = new HashMap<>();

            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);

            for (Map.Entry<String, Integer> e : map.entrySet())

                // Printing key-value pairs
                System.out.println(e.getKey() + " "
                        + e.getValue());
        }
}
