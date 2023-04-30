#include<iostream>

using std::cin;
using std::cout;
using std::min;
using std::max;

using u64 = std::uint64_t;

u64 gcd(u64 _a, u64 _b) {
  u64 a = max(_a, _b);
  u64 b = min(_a, _b);
  while ((a % b) != 0) {
    u64 t = a;
    a = b;
    b = t % b;
  }
  return b;
}

u64 lcm(u64 a, u64 b) {
  return (a * b) / gcd(a, b);
}

int main() {
  u64 a, b;
  cin >> a >> b;
  u64 result = lcm(a, b);
  cout << result << '\n';
  return 0;
}
