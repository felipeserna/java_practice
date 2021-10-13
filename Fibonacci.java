// Fibonacci using recursion
public class Fibonacci {
    public static void main(String[] args) {

        int number = 13; // Fibonacci sequence until this term

        for (int i = 1; i  <= number; i++) {
            
            int result = fibonacci(i);
            
            if (i != number) {
                System.out.print(result + ", ");
            }
            
            else {
                System.out.println(result);
            }
        }        
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
