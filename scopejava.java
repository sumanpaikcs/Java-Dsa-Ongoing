

public class scopejava {
    public static void main(String[] args) {
        int a = 12;
        int b = 36 ;
        // System.out.println(c);  //can not access c because c is in a seperated block called scope
        {
           // a = 20;
           // int a = 44;
            int c = 40;
            System.out.println(a);
            System.out.println(c);
        }
     System.out.println(a);
     //System.out.println(c);      //can not access c because c is in a seperated block called scope
     //random(a);

        //swap1(a,b);
        // temp = a;
        // a = b;
        // b = temp;

        // System.out.println(a +" "+ b);

    }

    static void random( int dot) {
        int num = 55;
        System.out.println(num);
        System.out.println(dot);
    }


    static void swap1(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +" "+ b);
    }
    
}
