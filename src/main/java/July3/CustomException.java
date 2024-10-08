package July3;

public class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
    class CustomExceptionExample {
        public static void main(String[] args) {
            try {
                validate(18);
            } catch (CustomException e) {
                System.out.println("Exception caught: " + e);
            }
            System.out.println("Program continues...");
        }


        public static void validate(int age) throws CustomException {
            if (age < 18) {
                throw new CustomException("Not eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
        }
}

