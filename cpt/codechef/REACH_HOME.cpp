#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int t;
  cin >> t;
  while (t--) {
    int x, y;
    cin >> x >> y;
    cout << (x * 5 >= y ? "YES" : "NO") << '\n';
  }
  return 0;
}