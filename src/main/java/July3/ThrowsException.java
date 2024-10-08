package July3;

public class ThrowsException {
        public static void main(String[] args) {
            try {
                checkAge(18);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception caught: " + e);
            }
            System.out.println("Program continues...");
        }

        public static void checkAge(int age) {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or older");
            } else {
                System.out.println("Age is valid");
            }
        }

}
