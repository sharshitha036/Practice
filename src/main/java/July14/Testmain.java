package July14;

import java.util.HashMap;
import java.util.Map;

public class Testmain {

    static Map<Person, String> numbers = new HashMap<>();

    public static void main(String[] args) {

        Person p = new Person("a", "b");
        numbers.put(p, "one");
        System.out.println(numbers.get(p));

        method2();


    }

    public static void method2()
    {
        Person p = new Person("a","b");
        System.out.println(numbers.get(p));
    }
}
