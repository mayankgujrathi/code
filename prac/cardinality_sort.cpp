#include<bits/stdc++.h>

using namespace std;

auto count_bits(int number) -> size_t {
  size_t c = 0;
  while (number) {
    c += 1;
    number = number & (number - 1);
  }
  return c;
}

auto main() -> int {
  size_t n;
  cin >> n;
  auto arr = unique_ptr<int[]>(new int[n]);
  for (auto i = 0; i < n; i++)
    cin >> arr[i];
  sort(
    arr.get(),
    arr.get() + n,
    [](auto a, auto b){
      auto a_bits = count_bits(a);
      auto b_bits = count_bits(b);
      if (a_bits != b_bits)
        return a_bits < b_bits;
      return a < b;
    });
  for (auto i = 0; i < n; i++)
    cout << arr[i] << ' ';
  cout << '\n';
  return 0;
}