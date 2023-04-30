import java.util.Scanner;

public class FibonSumSquares {
    private static final long PISANO_PERIOD_10 = 60;

    private static long lastDigitFibonacci(long num) {
        long lDigit = num;
        for (long i = 2, f = 0, s = 1 ; i <= num ; i++) {
            lDigit = (f + s) % 10;
            f = s;
            s = lDigit;
        }
        return lDigit;
    }

    private static long lastDigitSumSquares(long num) {
        long smaller = num % PISANO_PERIOD_10;
        long larger = (num + 1) % PISANO_PERIOD_10;
        return (lastDigitFibonacci(smaller) * lastDigitFibonacci(larger)) % 10;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        scan.close();
        System.out.println(lastDigitSumSquares(num));
    }
}

