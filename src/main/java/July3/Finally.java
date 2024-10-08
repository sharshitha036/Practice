package July3;

public class Finally {
        public static void main(String[] args) {
            try {
                int a = 5 / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e);
            } finally {
                System.out.println("Finally block always executes");
            }
            System.out.println("Program continues...");
        }
}
