import java.util.Arrays;
import java.util.Scanner;

public class multidiimentionArray {
    public static void main(String[] args) {
        // int[][] arr = new int[3][3];
        // int[][] arr = {
        // {1, 2, 3},
        // {3, 5, 6},
        // {6, 7, 8}
        // };
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = sc.nextInt();
            }
            // output
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {

        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        for (int i =0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
