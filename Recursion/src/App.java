public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("RECURSION......");
        int[] arr = {3,7,1,4,9,3,0};
        // printNumbersTill1Recursive(12);
        // printArray(arr, 0);
        // System.out.println(printFirstIndex(arr, 1, 0));
        System.out.println(fact(6));
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


    public static void printArray(int[] arr, int i){
        // Base Case
        if(i == arr.length){
            return;
        }
        // Main Logic
        System.out.print(arr[i]+" ");
        printArray(arr, i+1);
    }

    public static int printFirstIndex(int[] arr, int x, int i){
        // Base Case
        if(i >= arr.length){
            return -1;
        }
        // Main Logic
        if(arr[i] == x){
            return i;
        }
        else{
            int index = printFirstIndex(arr, x, i+1);
            return index;
        }
    }

    public static int fact(int N) {
        if(N<=1){
            return 1;
        }
        return N * fact(N-1);
    }
}
