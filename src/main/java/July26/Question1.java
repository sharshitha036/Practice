package July26;

import java.util.Objects;

public class Question1 {
    public static void main(String[] args) {
        String inputString = "((({}){}))";
        char[] inputChar = inputString.toCharArray();
        boolean valid = true;

        for (int i = 0; i <= (inputChar.length - 1) / 2; i++) {
            System.out.println("Comparing: " + inputChar[i] + "and"+inputChar[inputChar.length - 1 - i]);

            if(inputChar[i] == inputChar[inputChar.length-1-i]){
                valid= false;
            }

          /*  if (Objects.equals(inputChar[i], (inputChar[inputChar.length - 1 - i])))
            {
                valid = false;
            } */else {

                if (Objects.equals(inputChar[i], '{')) {

                    if (!Objects.equals(inputChar[inputChar.length - 1 - i], '}')) {
                        valid = false;
                    }
                }
                else if (Objects.equals(inputChar[i], '[')) {
                    if (!Objects.equals(inputChar[inputChar.length - 1 - i], ']')) {
                        valid = false;
                    }
                }
                else if (Objects.equals(inputChar[i], '(')) {
                    if (!Objects.equals(inputChar[inputChar.length - 1 - i], ')')) {
                        valid = false;
                    }
                }
            }
        }
        System.out.println("Expression is " + valid);
    }
}
