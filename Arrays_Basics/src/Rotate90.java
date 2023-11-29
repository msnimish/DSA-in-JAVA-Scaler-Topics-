package Arrays_Basics.src;
public class Rotate90{
    public static void solution(int[][] mat, int n){
        //Logic
        mat = transpose.transposeFunc(mat, n);
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<Math.floor(n/2); j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }
        System.out.println("____________________________________________________________");
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}