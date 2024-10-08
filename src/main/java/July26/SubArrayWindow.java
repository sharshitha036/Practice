package July26;

import java.util.ArrayList;

public class SubArrayWindow {
    public static void main(String[] args) {
        int[] inputArray = {1,3,5,7,6,8};
        int n = inputArray.length;
        int sum = 8;
        ArrayList<Integer> result = subArrayWindow(inputArray,n,sum);
        System.out.println(result);

    }
    static ArrayList subArrayWindow(int[] a, int n , int sum){
        int start = 0;
        int last = 0;
        int currSum = 0;
        boolean flag = false;
        ArrayList<Integer> res = new ArrayList<>();

        for(int i =0; i<n;i++) {
            currSum += a[i];
            if (currSum >= sum) {
                last = i;
            }
            while (sum < currSum && start < last) {
                currSum -= a[start];
                ++start;
            }
            if (currSum == sum) {
                res.add(start + 1);
                res.add(last + 1);
                flag = true;
                break;
            }
        }
            if(!flag)
                res.add(-1);
                return res;
    }
}
