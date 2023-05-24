import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch {
    private static final FastScanner scan = new FastScanner(System.in);

    private static int position(int[] a, int el) {
        for (int s = 0, e = a.length, m = (s + e) / 2 ; s <= e && m < a.length; m = (s + e) / 2) {
            if (a[m] == el) {
                return m;
            } else if (a[m] < el) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = getArray(scan.nextInt());
        int qs = scan.nextInt();
        while (qs-- > 0) {
            int el = scan.nextInt();
            System.out.println(position(arr, el));
        }
    }

    private static int[] getArray(int l) {
        int[] a = new int[l];
        for (int i = 0 ; i < a.length ; i++) {
            a[i] = scan.nextInt();
        }
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