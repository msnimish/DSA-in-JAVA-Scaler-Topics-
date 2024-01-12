import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("PriorityQueue in Heaps");

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        // add ....Time Complexity - O(logn) time
        pq.add(10);
        pq.add(15);
        pq.add(25);
        pq.add(50);
        pq.add(2);
        pq.add(10);

        // remove highest priority element ....Time Complexity - O(logn) time
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

        // get highest priority element ....Time Complexity - O(1) time
        System.out.println(pq.peek());
        System.out.println(pq.peek());

        System.out.println("___________Largest K_____________________");
        int[] arr = {11, 2, 4, 45, 23, 25, 50};
        largestKElement(arr, 5);
    }

    public static void largestKElement(int [] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int index = 0;
        while(index < k){
            pq.add(arr[index++]);
        }

        while(index < arr.length){
            if(pq.peek() < arr[index]){
                pq.remove();
                pq.add(arr[index++]);
            }
        }

        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
}
