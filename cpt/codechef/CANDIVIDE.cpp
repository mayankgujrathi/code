#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int t;
  cin >> t;
  while (t--) {
    int n;
    cin >> n;
    cout << (n % 3 == 0 ? "YES" : "NO") << '\n';
  }
  return 0;
}