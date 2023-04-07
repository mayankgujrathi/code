#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int n{}, ps{};
  cin >> n;
  while (n--) {
    int a, b, c;
    cin >> a >> b >> c;
    ps += (a + b + c) >= 2 ? 1 : 0;
  }
  cout << ps << "\n";
  return 0;
}