import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input as a space-separated line of integers
        String[] inputLine = scanner.nextLine().split(" ");
        
        // Parse input integers from the string array
        int[] l = new int[6];
        for (int i = 0; i < 6; i++) {
            l[i] = Integer.parseInt(inputLine[i]);
        }
        
        // Calculate the result using the solution function
        double result = solution(l);
        
        // Print the result
        System.out.println(result);
    }
    
    public static double solution(int[] l) {
        double[] d = new double[6];
        d[0] = l[0] * (25.0 / 100);
        d[1] = l[1] * (50.0 / 100);
        d[2] = l[2];
        d[3] = l[3] * 2;
        d[4] = l[4];
        d[5] = l[5];
        
        // Calculate the sum of elements in the 'd' array
        double sum = 0;
        for (double value : d) {
            sum += value;
        }
        
        return sum;
    }
}


// output:
// 20 50 10 2 0 0
// 44.0
