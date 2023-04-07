#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  int n;
  cin >> n;
  int result{};
  while (n--) {
    string s{};
    cin >> s;
    if (s[0] == '+' || s[2] == '+')
      result += 1;
    else if (s[0] == '-' || s[2] == '-')
      result -= 1;
  }
  cout << result << '\n';
  return 0;
}