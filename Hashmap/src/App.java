import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hashmap");
        HashMap<String, Integer> population = new HashMap<>();

        // add key-value pairs to Hashmap
        population.put("India",138);
        population.put("USA",33);
        population.put("Australia",4);
        population.put("Nepal",2);
        population.put("Pakistan",22);

        System.out.println(population.toString());

        // get value of specific key from HashMap
        System.out.println(population.get("USA"));
        population.replace("Nepal", 3);
        System.out.println(population.containsKey("Germany"));
        System.out.println(population.containsValue(31));

        System.out.println(population.toString());
    }
}
