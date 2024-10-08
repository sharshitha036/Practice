package June17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortandCalculate {

    // Method to sort the list of integers in descending order
    public static List<Integer> sortDescending(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList, Collections.reverseOrder());
        return sortedList;
    }

    public static int getPercentile(int size, int percent) {
        return Math.round(((float) size * percent) / 100);
    }

    // Method to calculate the percentages and put them into separate lists
    public static void calculatePercentages(List<Integer> sortedList) {
        int size = sortedList.size();
        int top25Count = getPercentile(size, 25);
        int highCount = 0;
        int middle50Count = 0;
        List<Integer> top25Percent = new ArrayList<>();
        List<Integer> middle50Percent = new ArrayList<>();
        List<Integer> low25Percent = new ArrayList<>();


        // Add elements to the top 25% list
        for (int i = 0; i < size; i++) {
            if ((highCount < top25Count || top25Count == 0) && middle50Count == 0) {
                top25Percent.add(sortedList.get(i));
                highCount++;
            } else if (sortedList.get(i).equals(sortedList.get(i - 1))) {

                if (top25Percent.contains(sortedList.get(i))) {
                    top25Percent.add(sortedList.get(i));
                    highCount++;
                } else if (middle50Percent.contains(sortedList.get(i))) {
                    middle50Percent.add(sortedList.get(i));
                    middle50Count++;
                }
                else {
                    low25Percent.add(sortedList.get(i));
                }
            } else if (middle50Count < top25Count) {
                middle50Percent.add(sortedList.get(i));
                middle50Count++;
            } else {
                low25Percent.add(sortedList.get(i));
            }
        }

        System.out.println("Top 25%: " + top25Percent);
        System.out.println("Middle 50%: " + middle50Percent);
        System.out.println("Low 25%: " + low25Percent);
    }

        public static void main (String[]args){
            // Create and populate the list
            List<Integer> numbers = new ArrayList<>();
            numbers.add(100);
            numbers.add(100);
            numbers.add(75);
            numbers.add(75);
            numbers.add(50);
            numbers.add(50);
            numbers.add(45);
            numbers.add(40);
            numbers.add(40);
            numbers.add(30);
            numbers.add(20);
            numbers.add(20);
            numbers.add(10);
            numbers.add(10);
            numbers.add(5);
            numbers.add(5);
            numbers.add(5);
            numbers.add(4);

           numbers = Arrays.asList(100,100,80,80,75,75,8,8,6,6);

            // Sort the list in descending order
            List<Integer> sortedNumbers = sortDescending(numbers);

            // Calculate the percentages and put them into separate lists
            calculatePercentages(sortedNumbers);
        }

    }
