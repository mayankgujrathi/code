import java.util.Scanner;

public class FibonHuge {

    private static long fibonacci(int num, long mod) {
        if (num <= 1) {
            return num;
        }
        long[] m = new long[num + 1];
        m[1] = 1;
        for (int index = 2 ; index <= num ; index++) {
            m[index] = (m[index - 1] + m[index - 2]) % mod;
        }

        return m[num] % mod;
    }

    private static long pisanoPeriod(long m) {
        for (long i = 0, a = 0, b = 1, c; i < m * m; i++) {
            c = (a + b) % m;
            a = b;
            b = c;
            if (a == 0 && b == 1)
                return i + 1;
        }
        return 0;
    }

    private static long fibonacciMod(long num, long mod) {
        long period = pisanoPeriod(mod);
        num = num % period;
        return fibonacci((int) num, mod);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long mod = scan.nextLong();
        scan.close();
        System.out.println(fibonacciMod(num, mod));
    }
}

