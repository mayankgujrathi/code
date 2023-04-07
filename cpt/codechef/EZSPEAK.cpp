#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int t;
  cin >> t;
  while (t--) {
    int n;
    cin >> n;
    string s{};
    cin >> s;
    int c{};
    bool f{};
    for (int i{}; i < n; i++) {
      switch (s[i]) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        c = 0;
        break;
      default:
        if (++c >= 4) {
          f = true;
        }
        break;
      }
    }
    cout << (!f ? "YES" : "NO") << "\n";
  }
  return 0;
}