#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int t;
  cin >> t;
  while (t--) {
    int l;
    cin >> l;
    string s;
    cin >> s;
    string ret{""};
    int i{};
    while (i < l) {
      auto tmp = s[i];
      string buf{""};
      while (i < l && tmp == s[i]) {
        buf.push_back(tmp);
        i += 1;
      }
      if (buf.size() % 2) {
        ret.push_back(tmp);
      } else {
        ret.push_back(tmp);
        ret.push_back(tmp);
      }
    }
    cout << ret << '\n';
  }
  return 0;
}