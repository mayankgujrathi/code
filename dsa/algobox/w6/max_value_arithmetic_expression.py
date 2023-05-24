import math

def calc(a, b, op):
    if op == '+':
        return a + b
    elif op == '-':
        return a - b
    else:
        return a * b

def min_max(M, m, i, j, ops):
    miv = math.inf
    mxv = -math.inf
    for k in range(i, j):
        a = calc(M[i][k], M[k+1][j], ops[k])
        b = calc(M[i][k], m[k+1][j], ops[k])
        c = calc(m[i][k], M[k+1][j], ops[k])
        d = calc(m[i][k], m[k+1][j], ops[k])
        miv = min(miv, a, b, c, d)
        mxv = max(mxv, a, b, c, d)
    return miv, mxv

def get_maximum_value(opd, ops):
    n = len(opd)
    m = [[None for x in range(n)] for x in range(n)]
    M = [[None for x in range(n)] for x in range(n)]
    for i in range(n):
        m[i][i] = opd[i]
        M[i][i] = opd[i]
    for s in range(1, n):
        for i in range(0, n-s):
            j = i + s
            m[i][j], M[i][j] = min_max(M, m, i, j, ops)
    return M[0][n-1]

def main():
    exp = input()
    ops, opd = [], []
    for i in exp:
        if i in ['+', '-', '*']:
            ops.append(i)
        else:
            opd.append(int(i))
    print(get_maximum_value(opd, ops))

if __name__ == "__main__":
    exit(main() or 0)