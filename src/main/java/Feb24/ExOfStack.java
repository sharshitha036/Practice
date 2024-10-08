package Feb24;

import java.util.Stack;

public class ExOfStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Add
        stack.push(25);
        stack.push(30);
        stack.push(35);
        stack.push(40);
        stack.push(45);
        stack.push(50);

        System.out.println(stack);


        Integer i1 = stack.pop();

        System.out.println(i1);

        stack.push(i1);

        System.out.println(stack);

        int sum = 0;
        for (Integer i : stack){
            sum += i;
        }
        System.out.println(sum);
    }
}
