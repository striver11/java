import java.util.Scanner;
public class Non_static_block_reintilialization_variables {
     int a=20;
    int b=30;
    static int c=50;

    {
      a=100;  
              System.out.println("if we reinstilize in this NON-STATIC blocks it will make sure that  the value will be affected for all the classes that we derived");

    }
    public static void main(String[] args) {
        Non_static_block_reintilialization_variables ob1=new Non_static_block_reintilialization_variables();
        
        System.out.println("a value : "+ob1.a);
        ob1.a=1000000000;
        System.out.println("reintilized a value : "+ob1.a);
        c=1134;
        System.out.println("reintilized c value : "+c);
        

    }
}
class Test
{
    public static void main(String[] args) {
         Non_static_block_reintilialization_variables ob2=new Non_static_block_reintilialization_variables();
         System.out.println("a value : "+ob2.a);
         System.out.println("c value : "+Non_static_block_reintilialization_variables.c);

    }
}
