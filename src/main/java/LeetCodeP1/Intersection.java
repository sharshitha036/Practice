package LeetCodeP1;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(2);
        num1.add(1);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(2);
        num2.add(2);

        num2.addAll(num1);

        System.out.println(num2);


        ArrayList<Integer> comboArrayList = new ArrayList<Integer>(num1);
        comboArrayList.addAll(num2);

        Set<Integer> setList = new LinkedHashSet<Integer>(comboArrayList);
        comboArrayList.clear();
        comboArrayList.addAll(setList);

        System.out.println("    Unique " + comboArrayList);
    }
}
