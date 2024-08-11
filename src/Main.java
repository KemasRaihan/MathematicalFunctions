import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    // Returns factorial
    public static int factorial(int n){
        if(n <= 2) return n;
        else return n * factorial(n-1);
    }

    // Returns nth term of prime number sequence
    // Prime numbers: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,...
    public static int Prime(int n){
        ArrayList<Integer> primes = new ArrayList<>();
        boolean isPrime;
        for(int i = 2; i < n; i++) {
            isPrime = true;
            if(i > 2){
                for (int j = 2; j < i; j++) {
                    if (i % j == 0)
                        isPrime = false;
                }
            }
            if(isPrime)
                primes.add(i);
        }
        return 0;

    }


    // Displays the Fibonacci sequence up to N times
    // Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,...
    public static int Fibonacci(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return a;
    }

    public static int FibonacciRecursive(int n){
        if(n<=1) return n;
        else return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2);
    }
}