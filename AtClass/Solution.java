import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int choice = sc.nextInt();
            int num = sc.nextInt();
            PerformOperation op;

            switch (choice) {
                case 1: op = MyMath.isOdd(); break;
                case 2: op = MyMath.isPrime(); break;
                case 3: op = MyMath.isPalindrome(); break;
                default: throw new IllegalArgumentException("Invalid choice");
            }

            String result;
            if (op.check(num)) {
                if (choice == 1) {
                    result = "ODD";
                }
                else if (choice == 2) {
                    result = "PRIME";
                }
                else {
                    result = "PALINDROME";
                }
            } else {
                if (choice == 1) {
                    result = "EVEN";
                }
                else if (choice == 2) {
                    result = "COMPOSITE";
                } else {
                    result = "NOT PALINDROME";
                }
            }

            System.out.println(result);

        }
        sc.close();
    }
}