import java.util.Scanner;

class CodeChef {
  static void solve(int x, int y) {
    if (x > y)
      System.out.println("A");
    else
      System.out.println("B");
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- != 0) {
      solve(scan.nextInt(), scan.nextInt());
    }
    scan.close();
  }
}