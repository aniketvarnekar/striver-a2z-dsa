# 08 — Arrays [Hard]

## [Problem 28: Pascal's Triangle](Problem28.java)

**Leetcode**  
https://leetcode.com/problems/pascals-triangle

**Problem Statement:**  
Write a program to generate Pascal's Triangle.

In Pascal's Triangle, each number is the sum of the two numbers directly above it.

### Example 1

**Input:**  
`N = 5, r = 5, c = 3`

**Output:**  

```text
Element at position (r, c): 6

N-th row of Pascal's Triangle:
1 4 6 4 1

First N rows of Pascal's Triangle:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
```

**Explanation:**  
Pascal's Triangle for the first 5 rows is shown above.

### Example 2

**Input:**  
`N = 1, r = 1, c = 1`

**Output:**  

```text
Element at position (r, c): 1

N-th row of Pascal's Triangle:
1

First N rows of Pascal's Triangle:
1
```

**Explanation:**  
`N = 1` is the base case of Pascal's Triangle.

---

## [Problem 29: Majority Element II](Problem29.java)

**Leetcode**  
https://leetcode.com/problems/majority-element-ii

**Problem Statement:**  
Given an integer array `nums` of size `n`, find all elements that appear more than `⌊ n / 3 ⌋` times.

### Example 1

**Input:**  
`nums = [3, 2, 3]`

**Output:**  
`[3]`

**Explanation:**  
The element `3` appears `2` times, which is more than `⌊3 / 3⌋ = 1`.

### Example 2

**Input:**  
`nums = [1]`

**Output:**  
`[1]`

**Explanation:**  
The element `1` appears once, which is more than `⌊1 / 3⌋ = 0`.

### Example 3

**Input:**  
`nums = [1, 2]`

**Output:**  
`[1, 2]`

**Explanation:**  
Both `1` and `2` appear once, which is more than `⌊2 / 3⌋ = 0`.