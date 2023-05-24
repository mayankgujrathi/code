import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MajorityElement {
    private static final FastScanner scan = new FastScanner(System.in);

    private static boolean hasMajorityElement(int[] a) {
        Map<Integer, Integer> fqz = getFrequency(a);
        for (int fq : fqz.values())
            if (fq > a.length / 2)
                return true;
        return false;
    }

    private static Map<Integer, Integer> getFrequency(int[] a) {
        Map<Integer, Integer> fqz = new HashMap<>();
        for (int el : a)
            fqz.put(el, fqz.getOrDefault(el, 0) + 1);
        return fqz;
    }

    public static void main(String[] args) {
        int[] a = getArray(scan.nextInt());
        System.out.println(hasMajorityElement(a) ? 1 : 0);
    }

    private static int[] getArray(int l) {
        int[] a = new int[l];
        for (int i = 0 ; i < l ; i++) {
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
