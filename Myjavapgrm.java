import java.util.Scanner;
public class Myjavapgrm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("The number you entered is :"+ a);

        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        sc.close();
        System.out.println("The number you entered is :"+ b);

        
    }
}
