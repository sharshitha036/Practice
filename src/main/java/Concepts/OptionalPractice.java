package Concepts;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalPractice {

    public static void main(String[] args) {

        String s1 = new String("abhi");
        Optional<String> s2 = getString2();

        System.out.println("optioanl testing: "+ s2.orElse(""));


        if(s2.isPresent()) {
            if (s2.equals(s1)) {
                System.out.println("Strings are equal");
            } else {
                System.out.println("Strings are not equal");
            }
        }
    }

    private static Optional<String> getString2() {
        return Optional.empty();
    }
}
