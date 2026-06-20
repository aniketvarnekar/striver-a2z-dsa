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

---

## [Problem 05: Floor and Ceil in Sorted Array](Problem05.java)

**Problem Statement:**  
You are given a sorted array `arr` of `n` integers and an integer `x`.

Find the **floor** and **ceil** of `x` in the array.

- The **floor** of `x` is the largest element in the array that is smaller than or equal to `x`.
- The **ceil** of `x` is the smallest element in the array that is greater than or equal to `x`.

### Example 1

**Input:**  
`n = 6, arr[] = {3, 4, 4, 7, 8, 10}, x = 5`

**Output:**  

```text
4 7
```

**Explanation:**  

- The floor of `5` is `4`.
- The ceil of `5` is `7`.

### Example 2

**Input:**  
`n = 6, arr[] = {3, 4, 4, 7, 8, 10}, x = 8`

**Output:**  

```text
8 8
```

**Explanation:**  

- The floor of `8` is `8`.
- The ceil of `8` is also `8`.

---

## [Problem 06: Find First and Last Position of Element in Sorted Array](Problem06.java)

**Leetcode**  
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

**Problem Statement:**  
Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given target value.

If the target is not found in the array, return:

```text
[-1, -1]
```

You must write an algorithm with **O(log n)** runtime complexity.

### Example 1

**Input:**  
`nums = [5, 7, 7, 8, 8, 10], target = 8`

**Output:**  

```text
[3, 4]
```

**Explanation:**  

The first occurrence of `8` is at index `3` and the last occurrence is at index `4`.

### Example 2

**Input:**  
`nums = [5, 7, 7, 8, 8, 10], target = 6`

**Output:**  

```text
[-1, -1]
```

**Explanation:**  

`6` is not present in the array.

### Example 3

**Input:**  
`nums = [], target = 0`

**Output:**  

```text
[-1, -1]
```

**Explanation:**  

The array is empty, so the target cannot be found.