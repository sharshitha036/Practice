package July26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subarraySum {
    public static void main(String[] args) {
        int[] inputArray = {1,3,5,7,6,8};
        int n = inputArray.length;
        int sum = 15;
        ArrayList<Integer> result = subArraySum(inputArray,n,sum);
        System.out.println(result);

    }
    static ArrayList subArraySum(int[] a, int n, int sum ){

        ArrayList<Integer> res = new ArrayList<>();
        boolean flagg = false;

        for(int i = 0; i< n;i++)
        {
            int currentSum = a[i];
            if (currentSum == sum)
            {
                res.add(i + 1);
                //res.add(i + 1);
                flagg = true;
                break;
            } else {
                for (int j = i + 1; j < n; j++) {
                    currentSum += a[j];
                    if (currentSum == sum) {
                        res.add(i + 1);
                        res.add(j + 1);
                        flagg = true;
                        break;
                    }
                }
                if (flagg) {
                    break;
                }
            }
        }

                if(flagg){
                    return res;
                }
                res.add(-1);
                return res;

    }
}
