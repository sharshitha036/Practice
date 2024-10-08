package Feb24;

/**
 * String ----> Reverse the String
 */
public class Question3 {

    public static void main(String[] args) {
        String inputString = "Abhishek";
        char[] inputArray = inputString.toCharArray();

        for(int i=0; i<= (inputArray.length-1)/2; i++ ){
            char temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length-1-i];
            inputArray[inputArray.length-1-i] = temp;
        }
        System.out.println(inputArray);

    }
}
