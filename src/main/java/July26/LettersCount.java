package July26;

import java.util.HashMap;
import java.util.Map;

public class LettersCount {
    public static void main(String[] args) {
        String inputString = "aabc";
        LettersCount noOfLettrs = new LettersCount();
        System.out.println(noOfLettrs.lettersCount(inputString));
    }
    public Map<Character,Integer> lettersCount(String s){
        char[] charStr = s.toCharArray();
        int n = charStr.length;

        Map<Character,Integer> map = new HashMap<>();

        for (int i =0;i<n;i++){
            if(!map.containsKey(charStr[i])){
                map.put(charStr[i],1);
            }
            else {
                map.put(charStr[i],map.get(charStr[i])+1);
            }
        }
        return map;
    }
}
