#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int w{};
  cin >> w;
  cout << (w % 2 == 0 && w > 2 ? "YES" : "NO") << "\n";
  return 0;
}