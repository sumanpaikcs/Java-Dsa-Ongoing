// This is the java shadowing and this is how it works.


public class ShadowingINjava {

    static int a = 100;    //shadowing in line no. --> 7
    public static void main(String[] args) {
        System.out.println(a);   // Output--> 100
        int a;
        a = 50;     // Shadowed by this line 
        System.out.println(a);    // Output--> 50
        func();
        
    }

    static void func() {
        System.out.println(a);   // Output--> 100
    }

    
    
}
