import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("HashSet");
        HashSet<String> set = new HashSet<String>();

        set.add("Detroit");
        set.add("Alaska");
        set.add("Ghana");
        set.add("Houston");
        set.add("Rajouri");

        set.remove("Detroit");

        System.out.println(set.contains("Indiana"));
        System.out.println(set.contains("Houston"));

        System.out.println(set.toString());
        firstRepeatingChar("zjhhdgyejuas");
        int[] A = {1, 2, 7, 1, 3, 4, 5, 6, 7, 8};
        int[] B = {1, 2, 3, 2, 2, 4, 2, 6,2};
        findIntersection(A, B);
        System.out.println(majElement(B));
    }

    public static void firstRepeatingChar(String s) throws Exception {
        HashSet<Character> set = new HashSet<Character>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(set.contains(ch)){
                System.out.println(ch);
                return;
            }else{
                set.add(ch);
            }
        }

        System.out.println(-1);
    }

    public static void findIntersection(int[] A, int[] B) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i])+1);
            }else{
                hm.put(A[i],1);
            }
        }
        String op = "";
        for(int i=0;i<B.length;i++){
            if(hm.containsKey(B[i]) && hm.get(B[i])>0){
                op+=B[i]+" ";
                hm.put(B[i], hm.get(B[i])-1);
            }
        }
        System.out.println(op);
    }

    public static int majElement(int[] A){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int val : A){
            if(hm.containsKey(val)){
                hm.put(val, hm.get(val)+1);
            }else{
                hm.put(val,1);
            }
        }
        for(int val: hm.keySet()){
            if(hm.get(val) > A.length/2){
                return val;
            }
        }
        return 0;
    }
}
