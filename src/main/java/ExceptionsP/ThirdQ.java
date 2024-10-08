package ExceptionsP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* If any Resources are used, they should be closed. Resources can be closed using Finally block or in try block
* try with resources */
public class ThirdQ {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = "";
            str = br.readLine();
        }
    }
}
