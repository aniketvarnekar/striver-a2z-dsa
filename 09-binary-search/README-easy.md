# 08 — Binary Search [Easy]

## [Problem 01: Binary Search](Problem01.java)

**Leetcode**  
https://leetcode.com/problems/binary-search

**Problem Statement:**  
Given a sorted array of integers `nums` and an integer `target`, return the index of `target` if it exists in the array. Otherwise, return `-1`.

You must write an algorithm with **O(log n)** runtime complexity.

### Example 1

**Input:**  
`nums = [-1, 0, 3, 5, 9, 12], target = 9`

**Output:**  

```text
4
```

**Explanation:**  

`9` exists in the array and is located at index `4`.

### Example 2

**Input:**  
`nums = [-1, 0, 3, 5, 9, 12], target = 2`

**Output:**  

```text
-1
```

**Explanation:**  

`2` does not exist in the array, so the result is `-1`.

---

## [Problem 02: Implement Lower Bound](Problem02.java)

**Problem Statement:**  
Given a sorted array of `N` integers and an integer `x`, find the **lower bound** of `x`.

### What is Lower Bound?

The lower bound of `x` is the smallest index `ind` such that:

```text
arr[ind] >= x
```

If no such index exists, return `N` (the size of the array).

### Example 1

**Input:**  
`N = 4, arr[] = {1, 2, 2, 3}, x = 2`

**Output:**  

```text
1
```

**Explanation:**  

Index `1` is the first position where:

```text
arr[1] >= 2
```

Therefore, the lower bound of `2` is `1`.

### Example 2

**Input:**  
`N = 5, arr[] = {3, 5, 8, 15, 19}, x = 9`

**Output:**  

```text
3
```

**Explanation:**  

Index `3` is the first position where:

```text
arr[3] = 15 >= 9
```

Therefore, the lower bound of `9` is `3`.

---

## [Problem 03: Implement Upper Bound](Problem03.java)

**Problem Statement:**  
Given a sorted array of `N` integers and an integer `x`, write a program to find the **upper bound** of `x`.

### What is Upper Bound?

The upper bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than the given key, i.e. `x`.

The upper bound is the smallest index `ind` such that:

```text
arr[ind] > x
```

If no such index exists, return `N` (the size of the array).

### Example 1

**Input:**  
`N = 4, arr[] = {1, 2, 2, 3}, x = 2`

**Output:**  

```text
3
```

**Explanation:**  

Index `3` is the smallest index such that:

```text
arr[3] > 2
```

Therefore, the upper bound of `2` is `3`.

### Example 2

**Input:**  
`N = 6, arr[] = {3, 5, 8, 9, 15, 19}, x = 9`

**Output:**  

```text
4
```

**Explanation:**  

Index `4` is the smallest index such that:

```text
arr[4] > 9
```

Therefore, the upper bound of `9` is `4`.

---

## [Problem 04: Search Insert Position](Problem04.java)

**Leetcode**  
https://leetcode.com/problems/search-insert-position

**Problem Statement:**  
You are given a sorted array `arr` of distinct integers and a target value `x`.

Return the index of `x` if it exists in the array. Otherwise, return the index where it should be inserted so that the array remains sorted.

### Example 1

**Input:**  
`arr[] = {1, 2, 4, 7}, x = 6`

**Output:**  

```text
3
```

**Explanation:**  

`6` is not present in the array.

If we insert `6` at index `3`, the array becomes:

```text
{1, 2, 4, 6, 7}
```

which remains sorted.

### Example 2

**Input:**  
`arr[] = {1, 2, 4, 7}, x = 2`

**Output:**  

```text
1
```

**Explanation:**  

`2` is present in the array at index `1`.

Therefore, the answer is `1`.