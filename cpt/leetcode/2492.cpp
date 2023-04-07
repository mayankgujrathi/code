#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
  int minScore(int n, vector<vector<int>>& roads) {
    auto v = vector<vector<bool>>(n, vector<bool>(n, false));
    for (const auto& edge : roads) {
      v[edge[0]][edge[1]] = true;
      v[edge[1]][edge[0]] = true;
    }
  }
};

auto main() -> int {
  int n, m;
  cin >> n >> m;
  auto roads = vector<vector<int>>();
  for (auto i = 0; i < m; i++) {
    auto tmp = vector<int>();
    int a, b, d;
    cin >> a >> b >> d;
    tmp.push_back(a);
    tmp.push_back(b);
    tmp.push_back(d);
    roads.push_back(tmp);
  }
  auto solver = Solution();
  cout << solver.minScore(n, roads) << "\n";
  return 0;
}