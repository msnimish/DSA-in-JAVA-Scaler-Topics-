package Arrays_Basics.src;
public class transpose{
    public static int[][] transposeFunc(int[][] arr, int n){
        // Transpose of a matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Printing a matrix 
        System.out.println("--------------Result of Transpose-------------------");
        for (int r = 0; r < n; r++){
            for(int c=0;c<n;c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
        return arr;
    }
}