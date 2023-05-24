import java.util.Scanner;

public class Inversions {
    private static final Scanner scan = new Scanner(System.in);

    private static long merge(int[] a, int[] b, int l, int ave, int r) {
        int i = l, j = ave, k = l;
        long icount = 0;
        while (i <= ave - 1 && j <= r) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                icount += ave - i;
                j++;
            }
            k++;
        }
        while (i <= ave - 1) {
            b[k] = a[i];
            i++;
            k++;
        }
        while (j <= r) {
            b[k] = a[j];
            j++;
            k++;
        }
        for (i = l; i <= r; i++)
            a[i] = b[i];
        return icount;
    }

    private static long getNumberOfInversions(int[] a, int[] b, int l, int r) {
        long icount = 0;
        if (r <= l)
            return icount;
        int ave = l + (r - l) / 2;
        icount += getNumberOfInversions(a, b, l, ave);
        icount += getNumberOfInversions(a, b, ave + 1, r);
        icount += merge(a, b, l, ave + 1, r);
        return icount;
    }

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] a = getArray(n);
        int[] b = new int[n];
        System.out.println(getNumberOfInversions(a, b, 0, a.length - 1));
    }

    private static int[] getArray(int l) {
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = scan.nextInt();
        }
        return a;
    }
}