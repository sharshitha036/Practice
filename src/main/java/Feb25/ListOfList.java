package Feb25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfList {
    public static void main(String[] args) {
        List<List<Integer>> bigList = new ArrayList<>();

        bigList.add(new ArrayList<>());
        bigList.get(0).add(1);
        bigList.get(0).add(2);

        bigList.add(new ArrayList<>());
        bigList.get(1).add(3);
        bigList.get(1).add(4);
        bigList.get(1).add(5);

        System.out.println("Biglistt is " + bigList);

        List<Integer> smallList1 = new ArrayList<>();
        smallList1.add(1);
        smallList1.add(2);
        bigList.add(smallList1);

        List<Integer> smallList2 = Arrays.asList(3,4);
        bigList.add(smallList2);

        System.out.println("Biglist after adding two small list "+ bigList);

        System.out.println(bigList.get(0).add(22));
        System.out.println(bigList);

        System.out.println(bigList.get(1));
    }
}
