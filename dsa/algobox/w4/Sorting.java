import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sorting {
    private static final FastScanner scan = new FastScanner(System.in);

    public static void main(String[] args) {
        int[] a = getArray(scan.nextInt());
        Arrays.sort(a);
        print(a);
    }

    private static void print(int[] a) {
        for (int el : a)
            System.out.print(el + " ");
    }

    private static int[] getArray(int l) {
        int[] a = new int[l];
        for (int i = 0 ; i < a.length ; i++)
            a[i] = scan.nextInt();
        return a;
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
