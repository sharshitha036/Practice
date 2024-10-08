package June12;

public class Sum {
    public static void main(String[] args) {
        int inputNumber = 2;
        sumOfNaturalNumbers(inputNumber);
    }
    public static void sumOfNaturalNumbers(int x){
        int y=0;
        for(int i=1; i<=x;i++){
           y =y+i;
        }
        System.out.println("Sum of Natural numbers up to "+ x + " is "+ y);
    }
}
