import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number");
        int N = scanner.nextInt();
        System.out.println("Enter:" + N);
        if (N == 0) {
            System.err.println("Enter any number other than 0\n");
        } else {
            if (N % 2 != 0) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && 2 <= N && N <= 5) {
                System.out.println("Not Weird");
            } else if (N % 2 == 0 && 6 <= N && N <= 20) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && N >= 20) {
                System.out.println("Not Weird");
            }
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}