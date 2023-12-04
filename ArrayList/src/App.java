import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World, Welcome to ArrayList!");
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // add
        list.add(10); // 10        
        list.add(20); // 20
        list.add(30); // 30
        list.add(41); // 30
        list.add(53); // 30
        list.add(60); // 30
        list.tr
        int[] arr = {10,20,30};
        

        System.out.println(list);

        // Add at index
        list.add(0,80);
        System.out.println(list);

        //Set
        list.set(1,5);
        System.out.println(list);

        // Get  at index
        System.out.println(list.get(3));

        // remove
        list.remove(2);
        System.out.println(list);

        //indexOf()
        System.out.println(list.indexOf(80));

        RemoveEven(list);
        System.out.println(list);
    }

    public static void RemoveEven(ArrayList<Integer> list){
        for(int i = list.size()-1;i>=0;i--){
            if(list.get(i) %2 ==0){
                list.remove(i);
            }
        }
    }
}
