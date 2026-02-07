# 01 — Basics

Short reference for **time** and **space complexity**.

---

## Time complexity

How runtime grows with input size **n**. We use **Big O** (worst case).

| Notation   | Name         | Example                    |
|-----------|--------------|----------------------------|
| O(1)      | Constant     | Index into array, hash lookup |
| O(log n)  | Logarithmic  | Binary search              |
| O(n)      | Linear       | Single loop over array     |
| O(n log n)| Linearithmic | Efficient sorting (e.g. merge sort) |
| O(n²)     | Quadratic    | Nested loops over same data |
| O(2ⁿ)     | Exponential  | Naive recursion (e.g. fib) |

**Examples:**

```java
// O(1)
int x = arr[i];

// O(n)
for (int i = 0; i < n; i++) sum += arr[i];

// O(n²)
for (int i = 0; i < n; i++)
  for (int j = 0; j < n; j++)
    // ...
```

---

## Space complexity

Extra memory (excluding input) the algorithm uses.

| Notation | Meaning        | Example              |
|----------|----------------|----------------------|
| O(1)     | Constant extra | Two variables, in-place sort |
| O(n)     | Linear extra   | Copy of array, recursion stack (n calls) |
| O(n²)    | Quadratic      | 2D DP table of size n×n |

**Examples:**

```java
// O(1) space — only a few variables
int a = 0, b = 1;
for (int i = 2; i <= n; i++) {
  int next = a + b;
  a = b; b = next;
}

// O(n) space — auxiliary array
int[] temp = new int[n];
```

---

**Rule of thumb:** prefer smaller Big O for both time and space; often there’s a trade-off (e.g. hash map uses extra space for faster lookup).
