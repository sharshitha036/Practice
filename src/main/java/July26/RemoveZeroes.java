package July26;

import java.util.Arrays;
import java.util.List;

public class RemoveZeroes {

        public static String removeZero(String str)
        {
            int i = 0;
            System.out.println(str.length());
            while (i < str.length() && str.charAt(i) == '0')
                i++;
            StringBuffer sb = new StringBuffer(str);
            sb.replace(0, i, "");
            return sb.toString();
        }
        public static void main(String[] args)
        {
            String str = "00123569";
            str = removeZero(str);
            System.out.println(str);
        }
}

