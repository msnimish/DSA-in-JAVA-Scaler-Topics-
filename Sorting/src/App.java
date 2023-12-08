public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sorting...");
        int[] A = {3,1,5,2,7,0};
        // SelectionSort(A);
        BubbleSort(A);
    }

    public static void SelectionSort(int[] arr){
        System.out.print("Applying Selection Sort on following array: ");
        printArray(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex] > arr[j]){
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
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        System.out.print("Result of Bubble sort: ");
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
