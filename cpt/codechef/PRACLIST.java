import java.util.Scanner;

class CodeChef {
  static void solve(int x, int y) {
    System.out.println(x - y);
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    solve(scan.nextInt(), scan.nextInt());
    scan.close();
  }
}