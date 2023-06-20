public class We_can_call_method_any_number_of_times {
    public static void main(String[] args) {
        
        System.out.println("main starts");
        display();
        System.out.println("main ends");
        display();
        display();
    }
    private static void display() {
        System.out.println("display method called.");
        return;
    }
}

/*
OUTPUT:
 F:\praveen_java1\patterns>java We_can_call_method_any_number_of_times
main starts
display method called.
main ends
display method called.
display method called.
 */
