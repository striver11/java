//Swapping of two numbers all the different methods in java
You can swap two numbers in Java using various methods. Here are three common approaches:

**1. Using a Temporary Variable:**
```java
int a = 5;
int b = 10;

int temp = a;
a = b;
b = temp;

System.out.println("After swapping: a = " + a + ", b = " + b);
```

**2. Using Arithmetic Operators:**
```java
int a = 5;
int b = 10;

a = a + b;
b = a - b;
a = a - b;

System.out.println("After swapping: a = " + a + ", b = " + b);
```

**3. Using XOR Operator:**
```java
int a = 5;
int b = 10;

a = a ^ b;
b = a ^ b;
a = a ^ b;

System.out.println("After swapping: a = " + a + ", b = " + b);
```

Each of these methods accomplishes the same task of swapping two numbers, but they use different techniques to achieve it.
  Certainly, here are a few more ways to swap two numbers in Java:

**4. Using Addition and Subtraction without Overflow:**
```java
int a = 5;
int b = 10;

a = a + b;
b = a - b;
a = a - b;

System.out.println("After swapping: a = " + a + ", b = " + b);
```

**5. Using Multiplication and Division:**
```java
int a = 5;
int b = 10;

a = a * b;
b = a / b;
a = a / b;

System.out.println("After swapping: a = " + a + ", b = " + b);
```

**6. Using Collections.swap() (For swapping elements in a List):**
```java
import java.util.*;

List<Integer> list = new ArrayList<>();
list.add(5);
list.add(10);

Collections.swap(list, 0, 1);

int a = list.get(0);
int b = list.get(1);

System.out.println("After swapping: a = " + a + ", b = " + b);
```

**7. Using a Bit Manipulation Method (Exclusive OR, XOR):**
```java
int a = 5;
int b = 10;

a = a ^ b;
b = a ^ b;
a = a ^ b;

System.out.println("After swapping: a = " + a + ", b = " + b);
```

These are additional methods to swap two numbers in Java, each with its own approach and advantages depending on the specific requirements of your code.
  Certainly, here are a few more methods to swap two numbers in Java:

**8. Using a Method with Parameters:**
You can create a method to encapsulate the swapping logic like this:

```java
public static void swapNumbers(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping: a = " + a + ", b = " + b);
}
```

**9. Using a Single Line Swap (Using Arithmetic):**
A compact way to swap two numbers in a single line:

```java
int a = 5;
int b = 10;

a = a + b - (b = a);

System.out.println("After swapping: a = " + a + ", b = " + b);
```

**10. Using a Helper Class:**
Create a helper class for swapping:

```java
class NumberSwapper {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

// Usage
int[] numbers = {5, 10};
NumberSwapper.swap(numbers, 0, 1);
int a = numbers[0];
int b = numbers[1];
System.out.println("After swapping: a = " + a + ", b = " + b);
```

These additional methods should provide you with more flexibility and options for swapping two numbers in Java based on your programming needs.
  Certainly, here are a couple more methods to swap two numbers in Java:

**11. Using Java 8's `swap()` method from `java.util.Collections` (For swapping elements in a List):**
```java
import java.util.*;

List<Integer> list = new ArrayList<>(Arrays.asList(5, 10));
Collections.swap(list, 0, 1);

int a = list.get(0);
int b = list.get(1);

System.out.println("After swapping: a = " + a + ", b = " + b);
```

**12. Using Bit Manipulation (Addition and Subtraction):**
This approach uses bit manipulation to swap two numbers without using a temporary variable:

```java
int a = 5;
int b = 10;

a = a + b;
b = a - b;
a = a - b;

System.out.println("After swapping: a = " + a + ", b = " + b);
```

These additional methods should give you even more ways to swap two numbers in Java based on your specific requirements and coding preferences.
  Certainly, here are a few more methods to swap two numbers in Java:

**13. Using `java.util.Collections.swap()` (For swapping elements in a List):**
```java
import java.util.*;

List<Integer> list = new ArrayList<>(Arrays.asList(5, 10));
Collections.swap(list, 0, 1);

int a = list.get(0);
int b = list.get(1);

System.out.println("After swapping: a = " + a + ", b = " + b);
```

**14. Using `StringBuilder` for String Swapping:**
You can also swap two strings using `StringBuilder`:

```java
StringBuilder str1 = new StringBuilder("Hello");
StringBuilder str2 = new StringBuilder("World");

str1.append(str2);
str2 = new StringBuilder(str1.substring(0, str1.length() - str2.length()));
str1 = new StringBuilder(str1.substring(str2.length()));

System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);
```

**15. Using Collections Framework (Swapping in an ArrayList):**
```java
import java.util.*;

List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 10));
Collections.swap(numbers, 0, 1);

int a = numbers.get(0);
int b = numbers.get(1);

System.out.println("After swapping: a = " + a + ", b = " + b);
```

These methods provide even more ways to swap elements in Java, whether they are numbers or strings, depending on your specific use case and coding preferences.
