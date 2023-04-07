#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int t;
  cin >> t;
  while (t--) {
    size_t n;
    cin >> n;
    auto a = unique_ptr<int[]>(new int[n]);
    auto b = unique_ptr<int[]>(new int[n]);
    for (auto i = 0; i < n; i++)
      cin >> a[i];
    for (auto i = 0; i < n; i++)
      cin >> b[i];
    auto found = true, f_check = false;
    for (auto i = 0; i < n; i++)
      if (a[i] != b[i] && a[i]) {
        found = false;
        break;
      }
    if (a[0] != b[0] || a[n - 1] != b[n - 1])
      found = false;
    for (auto i = 0; i < n; i++)
      if (a[i])
        f_check = true;
    if (!f_check)
      for (auto i = 0; i < n; i++)
        if (b[i])
          found = false;
    cout << (found ? "YES" : "NO") << '\n';
  }
  return 0;
}