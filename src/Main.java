public class Main {
    public static void main(String[] args) {
        Fibonacci(100);
    }

    // Displays all prime numbers up to N
    public static void Prime(int N){
        boolean isPrime;
        for(int i = 2; i < N; i++) {
            isPrime = true;
            if(i > 2){
                for (int j = 2; j < i; j++) {
                    if (i % j == 0)
                        isPrime = false;
                }
            }
            if(isPrime)
                System.out.print(i + ",");
        }

    }

    // Displays the Fibonacci sequence up to N times
    public static void Fibonacci(int N){
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 0; i < N; i++){
            System.out.print(a + ",");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}