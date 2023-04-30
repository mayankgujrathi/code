#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int t;
	cin >> t;
	while (t--) {
	  int x;
	  cin >> x;
	  cout << (x * 4 <= 1000 ? "YES" : "NO") << '\n';
	}
  return 0;
}