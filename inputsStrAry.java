import java.util.Arrays;
import java.util.Scanner;
public class inputsStrAry {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

      //  int[] arr = new int[5];
        // arr[0] = 04; 
        // arr[1] = 14; 
        // arr[2] = 24; 
        // arr[3] = 34; 
        // arr[4] = 44; 
        // internally it store like [04, 14, 24, 34, 44] 
       // System.out.println(arr[3]);

        //input using for loop
        // for( int i = 0 ; i<arr.length ; i++){
        //     arr[i] = sc.nextInt();
           

        // }
        // for( int i = 0 ; i<arr.length ; i ++){
           
        //     System.out.println(arr[i]);

        // }

        Scanner in = new Scanner(System.in);

        String[] str = new String[5];
        for ( int i = 0; i < str.length; i++) {
            str[i] = in.next();

        }
        // System.out.println(Arrays.toString(str));
        // modified
        str[2] = "java";
        System.out.println(Arrays.toString(str));
    }
    
}
