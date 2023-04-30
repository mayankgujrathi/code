import java.util.Scanner;

public class FibonSumLastDigit {
    private static long lastDigitFibonacciSum(long num) {
        long cur = 0;
        for (long i = 2, f = 0, s = 1 ; i <= num ; i++) {
            cur = (f + s) % 60;
            f = s;
            s = cur;
        }
        return cur - 1;
    }

    private static long lastDigitFibonacciSumDriver(long num) {
        if (num <= 1)
            return num;
        long rem = num % 60;
        if (rem == 0)
            return 0;
        return lastDigitFibonacciSum(rem + 2) % 10;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        scan.close();
        System.out.println(lastDigitFibonacciSumDriver(number));
    }
}

