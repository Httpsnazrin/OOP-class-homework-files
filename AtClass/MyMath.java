public class MyMath {
    public static PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return num -> {
            if (num < 2) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        };
}
    public static PerformOperation isPalindrome() {
        return num -> {
            String s = Integer.toString(num);
            String reversed = new StringBuilder(s).reverse().toString();
            return s.equals(reversed);
        };
    }
}
