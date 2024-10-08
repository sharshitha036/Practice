package Practiceques;

public interface Interface2 {
    public void method2();
    public default void method3()
    {
        System.out.println("Default method in interface 2");
    }
}
