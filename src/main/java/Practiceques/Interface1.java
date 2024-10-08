package Practiceques;

/**
 * Practice program for interfaces and multiple inheritance
 */
public interface Interface1 {

    //variables declared in an interface are static and final by default, which means that the values cannot be changd, and can be accessed
    //using the interface name
    public int x = 5;

    //interface can have methods without body, meaning they have method declarations but no method definitions
    public void method1();

    //Interfaces can also have methods with implementation, they should have default keyword in the method declaration
    public default void print()
    {
        System.out.println("default method in interface");
    }
}
