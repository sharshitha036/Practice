package Practiceques;

public class Grandson extends Son{

    @Override
    public void property(){
        System.out.println("This is Grandchild's property");
    }

    @Override
    public void kids(String a, String b) {
        super.kids(a, b);
        System.out.println("Here are Feb22.Grandson's Kids");
    }
}
