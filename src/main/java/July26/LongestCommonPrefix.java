package July26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public String longestCommonPrefix(List<String> words)
    {
        if(words.size() == 0)
        {
            return "";
        }
        String result = words.get(0);
        for(int i = 1; i < words.size();i++) {
                String tempResult = "";
                int size1 = result.length();
                int size2 = words.get(i).length();
                int size = size1 < size2 ? size1 : size2;
                for (int j = 0; j < size; j++) {
                    char c1 = result.charAt(j);
                    char c2 = words.get(i).charAt(j);
                    if (c1 == c2) {
                        tempResult = tempResult + c1;
                    } else {
                        break;
                    }
                }
                result = tempResult;
         }
        return result;
    }

    public static void main(String[] args) {

        List stringInput = Arrays.asList("fower","fow","flight","flew","flaw", "flavour");
        List stringInput1 = Arrays.asList("flower","flow","flight","flew","flaw", "flavour");
        List stringInput2 = Arrays.asList("dower","eow","flight","flew","flaw", "flavour");
        List stringInput3 = Arrays.asList("dower");


        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(stringInput));
        System.out.println(lcp.longestCommonPrefix(stringInput1));
        System.out.println(lcp.longestCommonPrefix(stringInput2));
        System.out.println(lcp.longestCommonPrefix(stringInput3));


    }
}
