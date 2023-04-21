#include<iostream>
#include<vector>
#include<algorithm>

using std::cin;
using std::cout;
using std::max;
using std::max_element;

using size = std::size_t;
using i64 = std::int64_t;

i64 max_pair_wise_product_naive(const std::vector<i64> &arr) {
  /*
    T: O(n^2)
    S: O(1)
  */
  i64 ret = 0;
  size n = arr.size();
  for (size i = 0; i < n; ++i)
    for (size j = i + 1; j < n; ++j)
      ret = max(ret, arr[i] * arr[j]);
  return ret;
}

i64 max_pair_wise_product_optimal(const std::vector<i64> &arr) {
  /*
    T: O(n)
    S: O(1)
  */
  std::vector<i64> a(arr);
  std::vector<i64>::const_iterator it = max_element(a.begin(), a.end());
  i64 num1 = *it;
  a.erase(it);
  i64 num2 = *max_element(a.begin(), a.end());
  return num1 * num2;
}

int main() {
  size n;
  cin >> n;
  std::vector<i64> arr;
  for (size i = 0; i < n; ++i) {
    i64 buf;
    cin >> buf;
    arr.push_back(buf);
  }
  // i64 result = max_pair_wise_product_naive(arr);
  i64 result = max_pair_wise_product_optimal(arr);
  cout << result << '\n';
  return 0;
}