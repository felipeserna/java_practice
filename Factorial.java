// Factorial using recursion
public class Factorial {
    public static void main(String[] args) {
        int result = factorial(9);
        // 9! = 362880
        System.out.println(result);
    }
    public static int factorial(int k) {
        if (k == 0) {
            return 1;
        }
        else {
            return k * factorial(k - 1);
        }
    }
}
