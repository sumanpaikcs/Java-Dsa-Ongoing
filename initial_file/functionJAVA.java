import java.util.Scanner;

public class functionJAVA {
    public static void main(String[] args) {

        // sum1();

        // int ans = sum2();
        // System.out.println("The answer is : "+ans);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int ans = sum3(a,b);
        System.out.println("The answer is : "+ans);

        
    }

    static int sum3(int a,int b){      //Takes something returns something
       
        int sum = a+b;
        return sum;
    }


    static int sum2(){                  //takes nothing returns something
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int sum = a+b;
        return sum;
    }





    static void sum1(){                   //Takes nothing returns nothing

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of two number is : " + sum);

    }
    
}
