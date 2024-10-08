package Feb25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> inputArrayList = new ArrayList<>();
        inputArrayList.add(10);
        inputArrayList.add(20);
        inputArrayList.add(30);
        inputArrayList.add(45);

        System.out.println("Input arrayList " + inputArrayList);
        int diff = 0;
        List<Integer> differences = new ArrayList<>();

        for (int i = 0 ; i< inputArrayList.size(); i++)
        {
            for(int j = i+1; j < inputArrayList.size(); j++)
            {
                System.out.print(" i = " + inputArrayList.get(i)+ " j = "+inputArrayList.get(j) );
                diff = Math.abs(inputArrayList.get(i)-inputArrayList.get(j));
                System.out.println("  " + diff);
                differences.add(diff);
            }
        }
        System.out.println(differences);



/*
        for(int i = 0; i<inputArrayList.size()-1;i++){
            diff = Math.abs(inputArrayList.get(0)-inputArrayList.get(inputArrayList.size()-1-i));
            System.out.println(diff);
            diff = Math.abs(inputArrayList.get(1)-inputArrayList.get(inputArrayList.size()-1-i));
            System.out.println(diff);
            diff = Math.abs(inputArrayList.get(2)-inputArrayList.get(inputArrayList.size()-1-i));
            System.out.println(diff);
            diff = Math.abs(inputArrayList.get(3)-inputArrayList.get(inputArrayList.size()-1-i));

            System.out.println(diff);
        }
        System.out.println(diff);

*/
    }
}
