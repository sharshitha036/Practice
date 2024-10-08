package June12;
/** Find Largest of Three Numbers*/
public class Largest {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 30;
        largest(a,b,c);
    }
    public static void largest(int x, int y, int z){
        if(x>y && x>z){
            System.out.println("X is the largest");
        }
        else if(y>x &&y>z){
            System.out.println("Y is the largest");
        }
        else {
            System.out.println("Z is the largest");
        }
    }
}
