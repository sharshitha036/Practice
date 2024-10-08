package July26;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String inputString = "XL";
        RomanToInteger r2i = new RomanToInteger();
        System.out.println(r2i.romanToInteger(inputString));
    }

    public int romanToInteger(String s){

        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);

        }};

        char[] inputChar = s.toCharArray();
        System.out.println(inputChar);
        int result = 0;
        int intVal,nextIntVal;
        for(int i = 0; i <inputChar.length ; i++){
            intVal = map.get(inputChar[i]);

            if(i != inputChar.length-1)
            {
                nextIntVal = map.get(inputChar[i + 1]);

                if (nextIntVal > intVal) {
                    intVal = nextIntVal - intVal;
                    i = i + 1;
                }
            }
                result = result + intVal;
        }
        return result;
    }
}
