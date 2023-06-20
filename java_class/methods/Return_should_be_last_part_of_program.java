class Return_should_be_last_part_of_program{
    public static void main(String[] args) {
        System.out.println("Main starts");
        System.out.println("main ends");
    }
    public static void display()
    {
        System.out.println("in display");
        return;
        System.out.println("hello");
    }
}

/* 
output:
F:\praveen_java1\patterns>javac Return_should_be_last_part_of_program.java
Return_should_be_last_part_of_program.java:10: error: unreachable statement
        System.out.println("hello");
        ^
1 error
*/
