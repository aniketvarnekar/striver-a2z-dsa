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

---

## [Problem 29: Search a 2D Matrix](Problem29.java)

**Leetcode**  
https://leetcode.com/problems/search-a-2d-matrix

**Problem Statement:**  
You are given an `m × n` integer matrix `matrix` with the following properties:

- Each row is sorted in non-decreasing order.
- The first element of each row is greater than the last element of the previous row.

Given an integer `target`, return `true` if `target` exists in the matrix; otherwise, return `false`.

Your solution must have a time complexity of **O(log(m × n))**.

### Example 1

**Input:**  

```text
matrix =
[
  [1, 3, 5, 7],
  [10, 11, 16, 20],
  [23, 30, 34, 60]
]

target = 3
```

**Output:**  

```text
true
```

**Explanation:**  

The value `3` is present in the first row of the matrix.

### Example 2

**Input:**  

```text
matrix =
[
  [1, 3, 5, 7],
  [10, 11, 16, 20],
  [23, 30, 34, 60]
]

target = 13
```

**Output:**  

```text
false
```

**Explanation:**  

The value `13` is not present in the matrix.