public class overloadign {
    public static void main(String[] args) {
     //  name(34);
       name("Suman paik");     // function overloading
                               // same name but different arguments 

          sum(23,12);  
       // sum(23,12,34);  
                            
    }
    static void name(int a) {
        System.out.println("first one");
        System.out.println(a);

    }
    static void name(String name) {
        System.out.println("second one");
        System.out.println(name);

    }


    static void  sum(int a, int b) {
        System.out.println("first one");
        System.out.println(a+b);
    }
    static void  sum(int a, int b, int c) {
        System.out.println("second one");
        System.out.println(a+b+c);
    }
    
}
