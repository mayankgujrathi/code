import java.util.Scanner;

public class LongestCommonSubsequence {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = getArray(scan.nextInt());
        int[] b = getArray(scan.nextInt());
        System.out.println(lengthLongestCommonSubsequence(a, b));
    }

    private static int[] getArray(int l) {
        int[] a = new int[l];
        for (int i = 0 ; i < l ; i++)
            a[i] = scan.nextInt();
        return a;
    }

    private static int lengthLongestCommonSubsequence(int[] a, int[] b) {
        int[][] mem = new int[a.length][b.length];
        for (int r = 0, c = 0 ; c < b.length ; c++)
            mem[r][c] = Math.max(c > 0 ? mem[r][c - 1] : 0,
                    a[r] == b[c] ? 1 : 0);
        for (int row = 0, column = 0 ; row < a.length ; row++)
            mem[row][column] = Math.max(row > 0 ? mem[row - 1][column] : 0,
                    a[row] == b[column] ? 1 : 0);
        for (int row = 1 ; row < a.length ; row++)
            for (int column = 1 ; column < b.length ; column++)
                mem[row][column] = max(
                        mem[row - 1][column],
                        mem[row][column - 1],
                        a[row] == b[column] ? mem[row - 1][column - 1] + 1 : 0
                );
        return mem[a.length - 1][b.length - 1];
    }

    private static int max(int... numbers) {
        int result = 0;
        for (int number : numbers)
            result = Math.max(number, result);
        return result;
    }

    private static void print(int[][] matrix) {
        for (int[] row : matrix)
            print(row);
    }

    private static void print(int[] array) {
        for (int element : array)
            System.out.print(element + " ");
        System.out.println();
    }
}