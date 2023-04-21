#include<bits/stdc++.h>
using namespace std;

struct Data {
  size_t idx;
  int cost;
};

auto solve(vector<int> A, int N) -> vector<vector<int>> {
  auto i = 0, j = 0;
}

auto main() -> int {
  size_t n;
  cin >> n;
  auto a = vector<int>(n, 0);
  for (auto i = 0; i < n; i++)
    cin >> a[i];
  auto solutions = solve(a, n);
  for (const auto& solution : solutions)
    cout << solution[0] << ' ' << solution[1] << '\n';
  return 0;
}