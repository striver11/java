public class Return_is_mandatory_for_methods_when_return_type_is_not_void {
    public static void main(String[] args) {
        add(3,4);
        //add();
        /*
        add();
         note:
         the type and number of argumets should match with type and number of parameters in function other wise it will product error
         there is a possibility of implicit type conversion
         output :
         F:\praveen_java1\patterns>javac Return_is_mandatory_for_methods_when_return_type_is_not_void.java
        Return_is_mandatory_for_methods_when_return_type_is_not_void.java:4: error: method add in class Return_is_mandatory_for_methods_when_return_type_is_not_void cannot be applied to given types;
                add();
                ^
        required: int,int
        found:    no arguments
        reason: actual and formal argument lists differ in length
        1 error

         */


        System.out.println("will print ascci value due to implicit conversion:"+add(4,5));
        //System.out.println(a);
        /*
         note:
         the scope of "a" is only to add() method it is the local varialble of the add() method 
         we cannot use the "a" out side its scope or method it will produce error
         output:
         F:\praveen_java1\patterns>javac Return_is_mandatory_for_methods_when_return_type_is_not_void.java
        Return_is_mandatory_for_methods_when_return_type_is_not_void.java:24: error: cannot find symbol
                System.out.println(a);
                                ^
        symbol:   variable a
        location: class Return_is_mandatory_for_methods_when_return_type_is_not_void
        1 error
         */
    }
    public static int add(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
        return 'a';
        /* 
        return;
        Note 1:
        it will produce a error if you don't return the value
        output 1:
        
        F:\praveen_java1\patterns>javac Return_is_mandatory_for_methods_when_return_type_is_not_void.java
        Return_is_mandatory_for_methods_when_return_type_is_not_void.java:11: error: incompatible types: missing return value
                return;
                ^
        1 error

        return

        */
        /*
         retrun 'a';
         note2:
         the returned value char is converted to ascii implicitly by the compiler
         output 2:
         F:\praveen_java1\patterns>java Return_is_mandatory_for_methods_when_return_type_is_not_void
            7
            9   
            will print ascci value due to implicit conversion:97
         */

    }
}

/*
 OUTPUT:
 F:\praveen_java1\patterns>java Return_is_mandatory_for_methods_when_return_type_is_not_void
7
9
4
 */
