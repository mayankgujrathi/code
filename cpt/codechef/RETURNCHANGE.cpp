#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int t;
  cin >> t;
  while (t--) {
    int x;
    cin >> x;
    auto x_new = x % 10 >= 5 ? x - (x % 10) + 10 : x - (x % 10);
    cout << 100 - x_new << '\n';
  }
  return 0;
}