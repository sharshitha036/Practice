package March13;

/*
* Polymorphism example Overloading
* */
public class ExOfPolymorphism {
    public static void main(String[] args) {
    ExOfPolymorphism e = new ExOfPolymorphism();
    e.subject1();
    e.subject1(3);
    }

    private static void subject1() {
        System.out.println("This is English");
    }
    private static void subject1(int x){
        System.out.println("This is Maths " + x);
    }
}
