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
        maxCharFreq("swallow");
        int[] a = {3,6,2,6,8,9};
        int[] b = {4,7,2,8,1,3};
        getCommonElements(a, b);
    }

    public static void maxCharFreq(String st){
        System.out.println(st);
        StringBuilder s = new StringBuilder(st);
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.replace(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        System.out.println(hm.toString());
        int max = Integer.MIN_VALUE;
        char maxChar = '_';
        for(Character c : hm.keySet()){
            if(max < hm.get(c)){
                max = hm.get(c);
                maxChar = c;
            }
        }
        System.out.println("Max Char is '"+ maxChar+ "' which occurrs " + max + " times." );
    }

    public static void getCommonElements(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<arr1.length;i++){
            hm.put(arr1[i],1);
        }
        for(int i=0; i<arr2.length;i++){
            if(hm.containsKey(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }
}
