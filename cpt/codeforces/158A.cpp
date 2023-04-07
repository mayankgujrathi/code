#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int n, k;
  cin >> n >> k;
  auto a = unique_ptr<int[]>(new int[n]);
  for (auto i = 0; i < n; i++)
    cin >> a[i];
  int atleast = a[k-1], nrpat{};
  for (auto i = k; i < n; i++)
    if (a[i] > 0 && a[i] >= atleast)
      nrpat++;
    else
      break;
  for (auto i = k - 1; i >= 0; i--) 
    if (a[i] > 0 && a[i] >= atleast)
      nrpat++;
  cout << nrpat << '\n';
  return 0;
}