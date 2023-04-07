import java.util.Scanner;

class CodeChef {
  static void solve(int x) {
    int c = 0;
    while (x > 0) {
      if (x % 10 == 4)
        c += 1;
      x /= 10;
    }
    System.out.println(c);
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