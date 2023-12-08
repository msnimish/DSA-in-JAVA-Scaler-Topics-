import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sorting...");
        int[] A = {3,1,5,2,7,0};
        ArrayList<Integer> AList = new ArrayList<Integer>();
        // SelectionSort(A);
        // BubbleSort(A);
        // InsertionSort(A);
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }

    public static void SelectionSort(int[] arr){
        System.out.print("Applying Selection Sort on following array: ");
        printArray(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex] < arr[j]){     // reverse condition just here and convert to ascending order / descending order
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        System.out.print("Result of Selection sort: ");
        printArray(arr);
        System.out.println();
    }

    public static void BubbleSort(int[] arr){
        System.out.print("Applying Bubble Sort on following array: ");
        printArray(arr);
        System.out.println();
        int N = arr.length;
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                if(arr[j] < arr[j+1]){          // reverse condition just here and convert to ascending order / descending order
                    swap(arr, j, j+1);
                }
            }
        }
        System.out.print("Result of Bubble sort: ");
        printArray(arr);
        System.out.println();
    }

    public static void InsertionSort(int[] arr){
        System.out.print("Applying Insertion Sort on following array: ");
        printArray(arr);
        System.out.println();
        int N = arr.length;
        for(int i=0;i<N-1;i++){
            int val = arr[i+1];
            for(int j=i;j>=0;j--){
                if(val > arr[j]){           // reverse condition just here and convert to ascending order / descending order
                    arr[j+1] = val;
                    break;
                }else{
                    swap(arr,j+1, j);
                }
            }
        }
        System.out.print("Result of Insertion sort: ");
        printArray(arr);
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
