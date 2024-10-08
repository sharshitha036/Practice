package Feb25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfListOFList {
    public static void main(String[] args) {
        Map<Integer,List<List<Integer>>> first = new HashMap<>();



        first.put(1, new ArrayList<>());
        first.get(1).add(new ArrayList<>());
        first.get(1).get(0).add(2);
        first.get(1).get(0).add(3);
        first.get(1).get(0).add(4);

        first.get(1).add(new ArrayList<>());
        first.get(1).get(1).add(5);
        first.get(1).get(1).add(6);
        first.get(1).get(1).add(7);


        System.out.println(first);









        /*List<Integer> arrayList = new ArrayList<>();
        arrayList.add(25);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println(arrayList);

        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        System.out.println(arrayList2);

        for(int i = 0; i<= arrayList.size()-1;i++){
            first.put(arrayList.get(i), new ArrayList<>());
            first.get(arrayList.get(i)).add(arrayList2);
        }

        System.out.println(first);

   */ }
}
