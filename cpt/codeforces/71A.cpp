#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int t;
  cin >> t;
  while (t--) {
    string s{};
    cin >> s;
    auto n = s.size();
    if (n > 10) {
      cout << s[0] << n - 2 << s[n-1];
    } else {
      cout << s;
    }
    cout << "\n";
  }
  return 0;
}