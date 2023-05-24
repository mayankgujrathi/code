import sys
from itertools import chain

def fast_count_segments(s, e, ps):
    cnt = [0] * len(ps)
    sps = zip(s, ['l'] * len(s), range(len(s)))
    eps = zip(e, ['r'] * len(e), range(len(e)))
    pps = zip(ps, ['p'] * len(ps), range(len(ps)))

    sort_list = chain(sps, eps, pps)
    sort_list = sorted(sort_list, key=lambda a: (a[0], a[1]))
    seg = 0
    i = 0
    for _, letter, index in sort_list:
        if letter == 'l':
            seg += 1
        elif letter == 'r':
            seg -= 1
        else:
            cnt[index] = seg
            i += 1
    return cnt


def naive_count_segments(s, e, ps):
    cnt = [0] * len(ps)
    for i in range(len(ps)):
        for j in range(len(s)):
            if s[j] <= ps[i] <= e[j]:
                cnt[i] += 1
    return cnt

def main():
    input = sys.stdin.read()
    buf = list(map(int, input.split()))
    n = buf[0]
    _ = buf[1]
    s = buf[2:2 * n + 2:2]
    e = buf[3:2 * n + 2:2]
    ps = buf[2 * n + 2:]
    cnt = fast_count_segments(s, e, ps)
    for x in cnt:
        print(x, end=' ')


if __name__ == '__main__':
    exit(main() or 0)