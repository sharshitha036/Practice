package Feb24;


import java.util.Stack;

public class ExOfStack2 {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Andy");
        person.setLastName("Bob");
        person.setAge(25);
        person.setGender("Male");

        Person person1 = new Person("Harshitha", "S", 25 , "Female");


        Stack<Person> personStack = new Stack<>();

        personStack.push(person);
        personStack.push(person1);

        System.out.println(personStack);

    }



}
