import java.util.Scanner;

public class Firstjava {
    public static void main(String[] args) {
        System.out.println("Enter the number you want : ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("The number you entered is : "+ number); 
    }
    
}
