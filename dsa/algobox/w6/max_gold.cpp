#include <iostream>
#include <vector>

using std::cin;
using std::cout;
using std::max;
using std::vector;

int optimal_weight(int W, const vector<int> &w) {
	vector<vector<int>> mem(w.size() + 1, vector<int>(W + 1));
	for (size_t i = 0; i <= W; i++) { mem[0][i] = 0; }
	for (size_t i = 0; i <= w.size(); i++) { mem[i][0] = 0; }
	for (size_t i = 1; i <= w.size(); i++) {
		for (size_t j = 1; j <= W; j++) {
			if (j >= w[i - 1]) {
				mem[i][j] = max(w[i - 1] + mem[i - 1][j - w[i - 1]],
								   mem[i - 1][j]);
			} else {
				mem[i][j] = mem[i - 1][j];
			}
		}
	}
	return mem[w.size()][W];
}

int main() {
	int n, W;
	cin >> W >> n;
	vector<int> w(n);
	for (int i = 0; i < n; i++) { cin >> w[i]; }
	cout << optimal_weight(W, w) << '\n';
}