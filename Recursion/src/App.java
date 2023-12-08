public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("RECURSION......");
        // int[] arr = {3,7,1,4,9,3,0}
        printNumbersTill1Recursive(12);
    }

    public static void printNumbersTill1Recursive(int N){
        // Base Case
        if(N == 0){
            return;
        }

        // Main Logic
        printNumbersTill1Recursive(N-1);        // Recursive call
        System.out.print(N+" ");
    }
}
