import java.util.Scanner;
public class staticblock_reintilialization_variables {
    static int a=20;
    static int b=50;
    static int c=50;
    static
    {
        a=40;
              System.out.println("if we reinstilize in this STATIC blocks it will make sure that  the value will be affected for all the classes that we derived");
    }
    public static void main(String[] args) {
        System.out.println("a value : "+a);
        b=70;
        System.out.println("b value : "+b);
        c=1134;
        System.out.println("c value : "+c);
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println("a value : "+staticblock_reintilialization_variables.a);
        System.out.println("b value : "+staticblock_reintilialization_variables.b);
        System.out.println("c value : "+staticblock_reintilialization_variables.c);
    }
}
