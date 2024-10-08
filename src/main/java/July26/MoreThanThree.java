package July26;

import java.util.*;

public class MoreThanThree {
    public static void main(String[] args) {
       /* List<Integer> inputList = new ArrayList<>();
        inputList.add(3);
        inputList.add(3);
        inputList.add(4);
        inputList.add(2);
        inputList.add(3);*/
        List<Integer> stringInput = Arrays.asList(3,4,3,4,2,2,2,4,5);

        Map<Integer,Integer> mapp = new HashMap();

        for (int i : stringInput) {
            if (mapp.containsKey(i)) {
                mapp.put(i, (mapp.get(i) + 1));
            } else {
                mapp.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry :mapp.entrySet()){
            if(entry.getValue() == 3){
                System.out.println(entry.getKey());
            }

        }
        System.out.println(mapp);
    }
}
