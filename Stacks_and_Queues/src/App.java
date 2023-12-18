import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Stacks & Queues");
        Stack<Integer> stack = new Stack<>();
        
        // push / add
        stack.push(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.push(50);

        // peek
        System.out.println(stack.toString());
        System.out.println(stack.peek());

        // pop / remove
        System.out.println(stack.pop());

        //size
        System.out.println(stack.size());

        System.out.println("-------------------------Queues----------------------");

        Queue<Integer> queue = new LinkedList<>();

        // offer / add
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue.toString());
        // peek
        System.out.println(queue.peek());

        // pop / remove
        System.out.println(queue.remove());

        System.out.println(queue.peek());

    }
}
