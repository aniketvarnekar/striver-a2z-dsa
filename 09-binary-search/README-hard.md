# 09 — Binary Search [Hard]

## [Problem 28: Find the Row with Maximum Number of 1's](Problem28.java)

**Problem Statement:**  
You are given a non-empty binary matrix `mat` of size `N × M`, where each row is sorted in non-decreasing order (all `0`s appear before `1`s).

Find the index of the row containing the maximum number of `1`s.

If multiple rows contain the same maximum number of `1`s, return the smallest row index.

If the matrix contains no `1`s, return `-1`.

### Example 1

**Input:**  

```text
N = 3
M = 3

mat =
1 1 1
0 0 1
0 0 0
```

**Output:**  

```text
0
```

**Explanation:**  

The first row contains `3` ones, which is the maximum among all rows.

Therefore, the answer is `0`.

### Example 2

**Input:**  

```text
N = 2
M = 2

mat =
0 0
0 0
```

**Output:**  

```text
-1
```

**Explanation:**  

The matrix does not contain any `1`s, so there is no valid row.