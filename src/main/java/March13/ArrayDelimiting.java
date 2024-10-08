package March13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDelimiting {
    public static void main(String[] args) {
        List<String> ch = Arrays.asList("a","b","c");
        String str = String.valueOf(ch);
        String result = String.join(",", ch);
        System.out.println(result);

        char ch1[] = {'a','b','c'};
        String str1 = String.valueOf(ch1);

        String[] res = str1.split(",");
        for(String rest : res){
            System.out.print(rest);
        }
        String result1 = ch.stream()
                .collect(Collectors.joining(","));
        System.out.println(result1);

    }
}
