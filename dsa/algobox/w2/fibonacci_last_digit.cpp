#include<iostream>

using std::cin;
using std::cout;

using u64 = std::uint64_t;
const u64 M = 10;

u64 fibonacci_last_digit(u64 n) {
  u64 a = 0, b = 1;
  if (n == 0 || n == 1) return n;
  if (n < 3) return b;
  for (u64 i = 0; i < n; i++) {
    u64 t = (a + b) % M;
    a = b;
    b = t;
  }
  return a;
}

int main() {
  u64 n;
  cin >> n;
  u64 result = fibonacci_last_digit(n);
  cout << result << '\n';
  return 0;
}
