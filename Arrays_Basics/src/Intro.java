package Arrays_Basics.src;

import java.util.*;
public class Intro {
    public static void main(String[] args) throws Exception {
    
        // int[] arr = {1,2,3,4,5,8};
        
        // System.out.println("4th element :"+arr[3]);
        // arr[3] = 12;
        // System.out.println("Changed 4th element to " + arr[3]);

        // int[][] array = new int[5][6];

        // // Setting a value in 2d array
        // array[1][3] = 12;
        // System.out.println(array[1][3]);

        // System.out.println(array[3][2]);

        Scanner sc = new Scanner(System.in);
        
        // Reading an array
        /*System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the values of the array");

        int [] arr = new int[n];
        for (int m = 0; m < n; m++){
            arr[m] = sc.nextInt();
        }*/
        
        // Max in Array
        /*int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]) max = arr[i];
        }
        System.out.println(max);
        */

        // Reverse An Array
        /* int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[n-i-1] = arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }*/

        // Print All Subarrays of an Array
        /*for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
        */

        // Reading a matrix input
        System.out.println("Enter the size of the matrix");
        int n = sc.nextInt();
        System.out.println("Enter the "+n*n+ " values of the matrix");
        
        int [][] arr = new int[n][n];
        for (int r = 0; r < n; r++){
            for(int c=0;c<n;c++){
                arr[r][c] = sc.nextInt();
            }
        }
        
        // Transpose of a matrix
        /*for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }*/

        //Printing a matrix 
        /*System.out.println("---------------------------------");
        for (int r = 0; r < n; r++){
            for(int c=0;c<n;c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }*/
        // transpose.transposeFunc(arr, n);
        Rotate90.solution(arr, n);
        sc.close();
    }

    // public static void transpose(int[][] arr, int n){
    //     // Transpose of a matrix
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<i;j++){
    //             int temp = arr[i][j];
    //             arr[i][j] = arr[j][i];
    //             arr[j][i] = temp;
    //         }
    //     }

    //     //Printing a matrix 
    //     System.out.println("--------------Result of Transpose-------------------");
    //     for (int r = 0; r < n; r++){
    //         for(int c=0;c<n;c++){
    //             System.out.print(arr[r][c]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
}
