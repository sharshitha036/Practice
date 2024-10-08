package July3;

public class NestedTryCatch {
        public static void main(String[] args) {
            try {
                int[] numbers = {1, 2, 3};
                try {
                    System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Inner catch block: " + e);
                }
                int a = 5 / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Outer catch block: " + e);
            }
            System.out.println("Program continues...");
        }
}
