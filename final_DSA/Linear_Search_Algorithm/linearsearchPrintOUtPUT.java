import java.util.Scanner;

public class linearsearchPrintOUtPUT {
    public static void main(String[] args) {
        int[] numbers = { 23,56,78,-23,67,33,90,96,97,37};
        Scanner in = new Scanner(System.in);
        int targer = in.nextInt();
        linearSearch(numbers, targer);
        
    }
    static void linearSearch(int arr[], int target){
        if(arr.length == 0 ){
            System.out.println("There is no array. Please enter some value");
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                System.out.printf("The value is : ",element);
                System.out.printf("The index number is : ", index);
                
                return;
            }
        }
        System.out.println("There is nothing.");
    }
}
