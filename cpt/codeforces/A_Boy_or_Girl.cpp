#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  auto name = set<char>();
  string s{};
  cin >> s;
  for_each(
    s.begin(), 
    s.end(),
    [&name](char el) {
      name.insert(el);
    });
  const string boy = "IGNORE HIM!";
  const string girl = "CHAT WITH HER!";
  cout << (name.size() % 2 ? boy : girl) << '\n';
  return 0;
}