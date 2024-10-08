package MapsFolder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CountHashMap {

    public static void main(String[] args)
    {
        int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };

        // put all elements in arraylist
        ArrayList<Integer> aa = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            aa.add(a[i]);
        }
        System.out.println(aa);
        HashMap<Integer, Integer> h = new HashMap();

        // counting occurrence of numbers
        for (int i = 0; i < aa.size(); i++) {
            h.putIfAbsent(aa.get(i), Collections.frequency(
                    aa, aa.get(i)));
        }
        System.out.println(h);
    }

}
