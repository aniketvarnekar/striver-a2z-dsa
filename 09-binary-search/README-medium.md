# 09 — Binary Search [Medium]

## [Problem 14: Finding Square Root of a Number using Binary Search](Problem14.java)

**Problem Statement:**  
You are given a positive integer `N`. Find and return the floor value of its square root.

If `N` is a perfect square, return its exact square root. Otherwise, return the greatest integer less than the actual square root.

### Example 1

**Input:**  

```text
N = 36
```

**Output:**  

```text
6
```

**Explanation:**  

The square root of `36` is `6`.

### Example 2

**Input:**  

```text
N = 28
```

**Output:**  

```text
5
```

**Explanation:**  

The square root of `28` is approximately `5.292`.

Therefore, the floor value of the square root is `5`.

---

## [Problem 15: Nth Root of a Number using Binary Search](Problem15.java)

**Problem Statement:**  
Given two positive integers `N` and `M`, find the `N`th root of `M`.

The `N`th root of a number `M` is defined as an integer `X` such that:

```text
X^N = M
```

If the `N`th root is not an integer, return `-1`.

### Example 1

**Input:**  

```text
N = 3
M = 27
```

**Output:**  

```text
3
```

**Explanation:**  

The cube root of `27` is `3` because:

```text
3³ = 27
```

### Example 2

**Input:**  

```text
N = 4
M = 69
```

**Output:**  

```text
-1
```

**Explanation:**  

There is no integer whose 4th power is `69`.

Therefore, the answer is `-1`.