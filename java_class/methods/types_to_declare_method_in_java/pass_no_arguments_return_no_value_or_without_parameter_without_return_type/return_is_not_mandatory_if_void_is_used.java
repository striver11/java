public class return_is_not_mandatory_if_void_is_used {
    public static void main(String[] args) {
        hello();
    }
    public static void hello()
    {
        System.out.println("Hello");
        return;
    }
    
}


/*
Note:
 return is not mandatory for void declared fucntions because the compiler will implicitly add return,and we can also add return to the psvm()
 
 */


 /*
  F:\praveen_java1\patterns>java return_is_not_mandatory_if_void_is_used
Hello
  */
