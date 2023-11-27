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

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]) max = arr[i];
        }
        System.out.println(max);
        sc.close();
    }
}
