package July3;

public class MultipleCatchBlocks {
        public static void main(String[] args) {
            try {
                int a = 5 / 0;
                String str = null;
                System.out.println(str.length());
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e);
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught: " + e);
            }
            System.out.println("Program continues...");
        }
}
