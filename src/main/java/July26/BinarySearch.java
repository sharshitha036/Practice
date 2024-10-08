package July26;

import java.lang.reflect.Array;
import java.util.Arrays;
public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1,12,35,7,10,11,15,17};

        System.out.println(bS(array, 17));
    }

    public static int  bS(int[] numbers, int numberToFind){
        int low = 0;
        int high = numbers.length -1;
        Arrays.sort(numbers);
        System.out.println("sorted array is :");
        for (int num : numbers)
            System.out.print(num + " ");
        System.out.println("   ---   ");

        while(low<=high){
            int middlePosition= (low+high)/2;
            int middleNumber = numbers[middlePosition];

            if(numberToFind == middleNumber){
                System.out.println("Index of "+ numberToFind+ " is " + middlePosition);
                return middlePosition;
            }
            if(numberToFind<middleNumber){
                high = middlePosition -1;
            }
            else {
                low = middlePosition+1;
            }
        }
        return -1;
    }
}

