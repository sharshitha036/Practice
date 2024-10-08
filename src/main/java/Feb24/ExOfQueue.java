package Feb24;

import java.util.LinkedList;
import java.util.Queue;

public class ExOfQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(38);
        queue.add(48);
        queue.add(58);
        queue.add(68);

        System.out.println(queue);

        queue.remove();

        System.out.println(queue);

        int sum = 0;
        for(Integer i : queue){
            sum += i;
        }
        System.out.println(sum);
    }
}
