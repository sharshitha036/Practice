package Practiceques;

/**
 * Polymorphism example
 * Overriding
 * Over Loading
 */
public class Parent {

    public void property(){

        System.out.println("This is parent's property");
    }

    public void kids(String a, String b){
        System.out.println("Names " + a + " " + b );
    }

    public  void kids(String a, String b, String c){
        System.out.println("enter Names "+ a +" " + b + " "+ c );

    }


}
