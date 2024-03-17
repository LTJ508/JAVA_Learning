package datatype;

public class DataType {

    public static void main(String [] args) {


       boolean b = true;
       char c = 'J';
       short s = 32677;
       int i = 321635442;
       float f = 10.25f;
       double d = 11.35;


        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("s = "+s);
        System.out.println("i = "+i);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        System.out.println("\n\nprintf\n\n");

        System.out.printf("b = %b\nc = %c\ns = %d\ni = %d\nf = %.2f\nd = %.3f\n", b,c,s,i,f,d);


    }

}
