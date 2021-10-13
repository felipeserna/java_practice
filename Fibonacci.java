// Fibonacci using recursion
public class Fibonacci {
    public static void main(String[] args) {
        int result = fibonacci(10);
        // 34
        System.out.println(result);
    }
    public static int fibonacci(int k) {
        if (k == 1) {
            return 0;
        }
        else if (k == 2) {
            return 1;
        }
        else {
            return fibonacci(k - 1) + fibonacci(k - 2);
        }
    }
}
