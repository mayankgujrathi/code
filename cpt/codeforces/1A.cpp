#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  uint64_t n, m, a;
  cin >> n >> m >> a;
  cout << ((m + a - 1) / a) * ((n + a - 1) / a) << '\n';
  return 0;
}