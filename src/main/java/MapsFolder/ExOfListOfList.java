package MapsFolder;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class ExOfListOfList {
    public static void main(String[] args) {

        List<List<Person>> Departments = new ArrayList<>();

        Address a1 = new Address("11700 boron", "Frisco", "Texas");
        Address a2 = new Address("3200 l3babnon", "Plano", "Texas");
        Address a3 = new Address("1600 stacy", "Frisco", "Texas");
        Address a4 = new Address("1200 Long", "Plano", "Texas");

        Person p1 = new Person("Ram", 25, Grade.A, a1);
        Person p2 = new Person("Lakshman", 24, Grade.B, a2);
        Person p3 = new Person("Sita", 23, Grade.A, a3);
        Person p4 = new Person("Bharat", 20, Grade.C, a4);

        List<Person> persons1 = new ArrayList<>();
        persons1.add(p1);
        persons1.add(p2);
        List<Person> persons2 = new ArrayList<>();
        persons2.add(p3);
        persons2.add(p4);

        Departments.add(persons1);
        Departments.add(persons2);

        System.out.println("Biglist is " + Departments);
        System.out.println("Index 0 is "+Departments.get(0));
        System.out.println("Index 1 is "+Departments.get(1));

        // print all grades from list of list
        System.out.println("-----------------------");
        System.out.println("Printing All Grades from list of list");
        for( List<Person> dept: Departments){
            for (Person person : dept){
                System.out.println(person.getGrade());
            }
        }
        System.out.println("USING STREAMSSSS---");
        Departments.stream()
                .flatMap(List::stream) // Flattens the lists into a single stream of Person objects
                .map(Person::getGrade) // Maps each Person object to its Grade
                .forEach(System.out::println);

        //print name of persons1 who live in plano
        System.out.println("-----------------------");
        System.out.println("Name of persons1 who live in plano   ---");
        for( List<Person> dept: Departments){
            for (Person person : dept){
                if(person.getAddress().getCity() == "Plano"){
                    System.out.println(person.getName());
                }
            }
        }

        System.out.println("USING STREAMSSSS---");
        Departments.stream()
                .flatMap(List::stream)
                .filter(n -> n.getAddress().getCity()=="Plano")
                .map(n -> n.getName())
                .forEach(System.out::println);

        //print grades of people whose age is greater than 20
        System.out.println("-----------------------");
        for( List<Person> dept: Departments){
            for (Person person : dept){
                if(person.getAge() > 20){
                    System.out.println("Grade of " + person.getName()+" is "+person.getGrade());
                }
            }
        }
        System.out.println("USING STREAMSSSS---");
        Departments.stream()
                .flatMap(List::stream)
                .filter(n -> n.getAge() > 20)
                .forEach(n ->System.out.println("Grade of " + n.getName() + " is " + n.getGrade()));

        //create a list of all people who have A grade
        System.out.println("-----------------------");
        List<Person> ListOfAGrades = new ArrayList<>();
        for( List<Person> dept: Departments){
            for (Person person : dept){
                if(person.getGrade() == Grade.A){
                    ListOfAGrades.add(person);
                }
            }
        }
        System.out.println("List of all people who have A grade "+ ListOfAGrades);

        System.out.println("USING STREAMSSSS---");
        List<Person> ListOfAGrades1 = new ArrayList<>();
        Departments.stream()
                .flatMap(List::stream)
                .filter(n -> n.getGrade()==Grade.A)
                .forEach(person -> ListOfAGrades1.add(person));
                       System.out.println("List of all people who have A grade "+ ListOfAGrades1);

    }
}
