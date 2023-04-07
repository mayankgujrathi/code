#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int t;
  cin >> t;
  while (t--) {
    size_t n;
    cin >> n;
    auto a = vector<int>(n, 0);
    for (auto i = 0; i < n; i++)
      cin >> a[i];
    auto mi = *min_element(a.begin(), a.end());
    auto op = count_if(
      a.begin(),
      a.end(),
      [&mi](auto el) {
        return el > mi;
      });
    cout << op << '\n';
  }
  return 0;
}