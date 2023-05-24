import numpy

def editdistance(s1, s2):
    ls1 = len(s1)
    ls2 = len(s2)
    mtx = numpy.zeros((ls1+1 , ls2+1))
    for i in range(ls2+1):
        mtx[0][i] = i
    for i in range(ls1+1):
        mtx[i][0] = i
    for i in range(1, ls1+1):
        for j in range(1, ls2+1):
            ins = mtx[i][j-1]   + 1
            dl  = mtx[i-1][j]   + 1
            mismth  = mtx[i-1][j-1] + 1
            mth     = mtx[i-1][j-1]
            if s1[i-1] == s2[j-1]:
                mtx[i][j] = min(ins, dl, mth)
            if s1[i-1] != s2[j-1]:
                mtx[i][j] = min(ins, dl, mismth)
    return int(mtx[ls1][ls2]), mtx

def optimal_alignment(mtx, s1, s2, t, b, i, j):
    if i == 0 and j == 0:
        return (' '.join(t[::-1]), ' '.join(b[::-1]))
    if i>0 and mtx[i][j] == mtx[i-1][j] + 1:
        t.append(f'|{s1[i-1]}|')
        b.append('|-|')
        return optimal_alignment(mtx, s1, s2, t, b, i-1, j)
    elif j>0 and mtx[i][j] == mtx[i][j-1] + 1:
        b.append(f'|{s2[j-1]}|')
        t.append('|-|')
        return optimal_alignment(mtx, s1, s2, t, b, i, j-1)
    else:
        t.append(f'|{s1[i-1]}|')
        b.append(f'|{s2[j-1]}|')
        return optimal_alignment(mtx, s1, s2, t, b, i-1, j-1)

if __name__ == '__main__':
    s1, s2 = input(), input()
    editdistance, Matrix = editdistance(s1, s2)
    top, bottom = optimal_alignment(Matrix, s1, s2, [], [], len(s1), len(s2))
    print(editdistance)