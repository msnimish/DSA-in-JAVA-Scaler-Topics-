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
        
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the values of the array");

        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        // Max in Array
        /*int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]) max = arr[i];
        }
        System.out.println(max);
        */

        // Reverse An Array
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            ans[n-i-1] = arr[i];
        }
        for(int i=0;i<Math.floor(n/2);i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
