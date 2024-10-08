package June17;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<Integer> grossAmount = new ArrayList<>();
        grossAmount.add(10);
        grossAmount.add(10);
        grossAmount.add(10);
        grossAmount.add(10);
        grossAmount.add(10);

        List<Integer> grossAmount1 = new ArrayList<>();
        grossAmount1.add(1);
        grossAmount1.add(15);
        grossAmount1.add(3);
        grossAmount1.add(47);
        grossAmount1.add(10);
        grossAmount1.add(260);
        grossAmount1.add(30);
        grossAmount1.add(40);
        grossAmount1.add(100);
        grossAmount1.add(200);
        System.out.println(grossAmount);
        System.out.println(descendingSort(grossAmount));
        List<Integer> sortedNumbers = descendingSort(grossAmount);
        calculatePercentages(sortedNumbers);
    }

    private static List<Integer> descendingSort(List<Integer> listOfCompanies) {
        List<Integer> descendingList = new ArrayList<>(listOfCompanies);
        Collections.sort(descendingList, Collections.reverseOrder());
        return descendingList;
        }

    public static void calculatePercentages(List<Integer> sortedList) {
        int size = sortedList.size();
        System.out.println(sortedList.size());
        int top25Count = (int) Math.ceil(size * 0.25);
        int middle50Count = (int) Math.ceil(size * 0.50);
        int low25Count = size - top25Count - middle50Count;

        List<Integer> top25Percent = new ArrayList<>();
        List<Integer> middle50Percent = new ArrayList<>();
        List<Integer> low25Percent = new ArrayList<>();

        // Add elements to the top 25% list
        for (int i = 0; i < top25Count; i++) {
            top25Percent.add(sortedList.get(i));
        }

        // Add elements to the middle 50% list
        for (int i = top25Count; i < top25Count + middle50Count; i++) {
            if (i < size) {
                middle50Percent.add(sortedList.get(i));
            }
        }

        // Add elements to the low 25% list
        for (int i = top25Count + middle50Count; i < size; i++) {
            low25Percent.add(sortedList.get(i));
        }

        // In case all elements are the same, they should all be in top 25%
        if (middle50Percent.isEmpty() && low25Percent.isEmpty()) {
            middle50Percent.addAll(top25Percent);
            low25Percent.addAll(middle50Percent);
            top25Percent.clear();
        }

        System.out.println("Top 25%: " + top25Percent);
        System.out.println("Middle 50%: " + middle50Percent);
        System.out.println("Low 25%: " + low25Percent);
    }


   /* public static void calculatePercentages(List<Integer> sortedList) {
        int size = sortedList.size();
        int top25Count = (int) Math.ceil(size * 0.25);
        int middle50Count = (int) Math.ceil(size * 0.50);
        int low25Count = size - top25Count - middle50Count;

        List<Integer> top25Percent = new ArrayList<>();
        List<Integer> middle50Percent = new ArrayList<>();
        List<Integer> low25Percent = new ArrayList<>();

        for (int i = 0; i < top25Count; i++) {
            top25Percent.add(sortedList.get(i));
        }

        for (int i = top25Count; i < top25Count + middle50Count; i++) {
            middle50Percent.add(sortedList.get(i));
        }

        for (int i = top25Count + middle50Count; i < size; i++) {
            low25Percent.add(sortedList.get(i));
        }

        System.out.println("Top 25%: " + top25Percent);
        System.out.println("Middle 50%: " + middle50Percent);
        System.out.println("Low 25%: " + low25Percent);
    }
*/

    public static class SortC{

        public static List<Integer> sortDescending(List<Integer> list) {
            List<Integer> sortedList = new ArrayList<>(list);
            Collections.sort(sortedList, Collections.reverseOrder());
            return sortedList;
        }

        // Method to calculate the percentages and put them into separate lists
        public static void calculatePercentages(List<Integer> sortedList) {
            int size = sortedList.size();
            int top25Count = (int) Math.ceil(size * 0.25);
            int middle50Count = size - top25Count * 2; // Ensure correct splitting for middle 50%
            int low25Count = top25Count; // Ensure low 25% has the same count as top 25%

            List<Integer> top25Percent = new ArrayList<>();
            List<Integer> middle50Percent = new ArrayList<>();
            List<Integer> low25Percent = new ArrayList<>();

            // Add elements to the top 25% list
            for (int i = 0; i < top25Count; i++) {
                top25Percent.add(sortedList.get(i));
            }

            // Add elements to the middle 50% list
            for (int i = top25Count; i < top25Count + middle50Count; i++) {
                middle50Percent.add(sortedList.get(i));
            }

            // Add elements to the low 25% list
            for (int i = top25Count + middle50Count; i < size; i++) {
                low25Percent.add(sortedList.get(i));
            }

            System.out.println("Top 25%: " + top25Percent);
            System.out.println("Middle 50%: " + middle50Percent);
            System.out.println("Low 25%: " + low25Percent);
        }

        public static void main(String[] args) {
            // Create and populate the list
            List<Integer> grossAmount1 = new ArrayList<>();
            grossAmount1.add(100);
            grossAmount1.add(100);
            grossAmount1.add(50);
            grossAmount1.add(50);
            grossAmount1.add(75);
            grossAmount1.add(75);
            grossAmount1.add(45);
            grossAmount1.add(40);
            grossAmount1.add(10);
            grossAmount1.add(20);

            // Sort the list in descending order
            List<Integer> sortedNumbers = sortDescending(grossAmount1);
            System.out.println(sortedNumbers);

            // Calculate the percentages and put them into separate lists
            calculatePercentages(sortedNumbers);
        }
    }
}
