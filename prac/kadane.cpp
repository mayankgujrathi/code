#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  size_t n;
  cin >> n;
  auto a = unique_ptr<int[]>(new int[n]);
  for (auto i = 0; i < n; i++)
    cin >> a[i];
  auto cur_sum = a[0], max_sum = a[0];
  for (auto i = 1; i < n; i++) {
    cur_sum = max(a[i], cur_sum + a[i]);
    max_sum = max(max_sum, cur_sum);
  }
  cout << max_sum << '\n';
  return 0;
}