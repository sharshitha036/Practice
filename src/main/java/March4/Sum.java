package March4;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {

        List<Long> departmentScore = new ArrayList<>();
        departmentScore.add(1l);
        departmentScore.add(4l);
        departmentScore.add(5l);
        departmentScore.add(156l);
        System.out.println(departmentScore);
        Long[] inputArray = departmentScore.toArray(new Long[0]);
        Long sum = 0l;
        for(int i=0; i< inputArray.length;i++){
            sum += inputArray[i];
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
