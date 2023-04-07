#include<bits/stdc++.h>
using namespace std;

auto main() -> int {
  string word{};
  cin >> word;
  int u{}, l{};
  for_each(
    word.begin(),
    word.end(),
    [&u, &l](char letter) {
      if (letter >= 'A' && letter <= 'Z')
        u += 1;
      if (letter >= 'a' && letter <= 'z')
        l += 1;
    });
  if (u > l) {
    transform(
      word.begin(),
      word.end(),
      word.begin(), 
      [](int letter) {
        return std::toupper(letter);
      });
  } else {
    transform(
      word.begin(),
      word.end(),
      word.begin(), 
      [](int letter) {
        return std::tolower(letter);
      });
  }
  cout << word << '\n';
  return 0;
}