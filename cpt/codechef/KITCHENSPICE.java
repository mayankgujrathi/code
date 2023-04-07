import java.util.Scanner;

class CodeChef {
  static void solve(int x) {
    if (x < 4)
      System.out.println("MILD");
    else if (x >= 4 && x < 7)
      System.out.println("MEDIUM");
    else
      System.out.println("HOT");
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    while (t-- != 0) {
      solve(scan.nextInt());
    }
    scan.close();
  }
}