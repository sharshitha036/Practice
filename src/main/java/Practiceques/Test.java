package Practiceques;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Parent son = new Son();
        son.property();

        Parent son1= new Parent();
        son1.property();
        son1.kids("Boy", "Girl");
        son1.kids("Andy","bob","Charlie");

        Son son2 = new Son();
        son2.property();

        Parent grandson = new Grandson();
        grandson.kids("Don", "erin");
        grandson.property();


        //Encapsulation
        User a = new User();
        System.out.println(a);
        User b = new User("Harsh",28,"female");
        List<User> users = Arrays.asList(a, b);

        for(User user : users)
        {

        }
        //Interface1.x = 7;
        users.stream().forEach( element -> {
             System.out.println(element);
             });
        InterfaceImplementation i = new InterfaceImplementation();
        i.method1();
        i.method2();
        i.method3();
        System.out.println(i.x);
        System.out.println("The value of x from Interface 1"  + " " + Interface1.x);

        AbstractImpl AI = new AbstractImpl();
        AI.method2();
        AI.method1();
    }
}
