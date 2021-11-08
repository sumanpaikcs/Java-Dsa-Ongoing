import java.util.Arrays;

public class veribleLengthArguments {

    public static void main(String[] args) {
       name("SumanPaik","java", "github");
        //name(2,3,4,5,6,34,34,23);     // more than zero arguments
      //  multipleArgs(3, 4, "SumanPaik","java", "github");
    }

    static void multipleArgs(int a, int b, String ...v){
        System.out.println();
    }



    static void name(int ...v){    //String ...v  // char ...v
        System.out.println(Arrays.toString(v));


    }
    static void name(String ...v){    //String ...v  // char ...v
        System.out.println(Arrays.toString(v));


    }

}