import java.util.*;

public class CanSum {
  public static boolean cansum(Integer[] a, int target) {
    Boolean[] table = new Boolean[target + 1];
    Arrays.fill(table, false);
    table[0] = true;
    for (int i = 0; i <= target; i++)
      if (table[i])
        for (Integer num: a)
          if (i + num <= target)
            table[i + num] = true;
    return table[target];
  }
  public static void main(String[] args) {
    Integer[] a = new Integer[] { 7, 5, 3, 4};
    int target = 18;
    System.out.println(cansum(a, target));
  }
}