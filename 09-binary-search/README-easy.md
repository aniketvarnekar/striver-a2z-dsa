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

---

## [Problem 07: Count Occurrences in Sorted Array](Problem07.java)

**Problem Statement:**  
You are given a sorted array containing `N` integers and a number `X`. Find the number of occurrences of `X` in the array.

### Example 1

**Input:**  

```text
N = 7
X = 3
array[] = {2, 2, 3, 3, 3, 3, 4}
```

**Output:**  

```text
4
```

**Explanation:**  

`3` occurs `4` times in the array.

### Example 2

**Input:**  

```text
N = 8
X = 2
array[] = {1, 1, 2, 2, 2, 2, 2, 3}
```

**Output:**  

```text
5
```

**Explanation:**  

`2` occurs `5` times in the array.

---

## [Problem 08: Search Element in a Rotated Sorted Array](Problem08.java)

**Leetcode**  
https://leetcode.com/problems/search-in-rotated-sorted-array

**Problem Statement:**  
Given an integer array `nums` sorted in ascending order (with distinct values) and a target value `k`, the array is rotated at some unknown pivot.

Find the index of `k` in the array. If `k` is not present, return `-1`.

### Example 1

**Input:**  

```text
nums = [4, 5, 6, 7, 0, 1, 2]
k = 0
```

**Output:**  

```text
4
```

**Explanation:**  

The target value `0` is present in the array at index `4`.

### Example 2

**Input:**  

```text
nums = [4, 5, 6, 7, 0, 1, 2]
k = 3
```

**Output:**  

```text
-1
```

**Explanation:**  

The target value `3` is not present in the array, so the answer is `-1`.

---

## [Problem 09: Search Element in Rotated Sorted Array II](Problem09.java)

**Leetcode**  
https://leetcode.com/problems/search-in-rotated-sorted-array-ii

**Problem Statement:**  
Given an integer array `arr` of size `N`, sorted in ascending order (may contain duplicate values), and a target value `k`.

The array is rotated at some pivot point unknown to you. Return `true` if `k` is present in the array; otherwise, return `false`.

### Example 1

**Input:**  

```text
arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6]
k = 3
```

**Output:**  

```text
true
```

**Explanation:**  

The element `3` is present in the array. Therefore, the answer is `true`.

### Example 2

**Input:**  

```text
arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6]
k = 10
```

**Output:**  

```text
false
```

**Explanation:**  

The element `10` is not present in the array. Therefore, the answer is `false`.

---

## [Problem 10: Minimum in Rotated Sorted Array](Problem10.java)

**Leetcode**  
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array

**Problem Statement:**  
Given an integer array `arr` of size `N`, sorted in ascending order with distinct values, the array is rotated at an unknown index.

Find the minimum element in the array.

### Example 1

**Input:**  

```text
arr = [4, 5, 6, 7, 0, 1, 2, 3]
```

**Output:**  

```text
0
```

**Explanation:**  

The minimum element in the array is `0`.

### Example 2

**Input:**  

```text
arr = [3, 4, 5, 1, 2]
```

**Output:**  

```text
1
```

**Explanation:**  

The minimum element in the array is `1`.

---

## [Problem 11: Find Out How Many Times the Array Has Been Rotated](Problem11.java)

**Problem Statement:**  
Given an integer array `arr` of size `N`, sorted in ascending order with distinct values. The array has been rotated between `1` and `N` times, but the number of rotations is unknown.

Find how many times the array has been rotated.

### Example 1

**Input:**  

```text
arr = [4, 5, 6, 7, 0, 1, 2, 3]
```

**Output:**  

```text
4
```

**Explanation:**  

The original sorted array is:

```text
[0, 1, 2, 3, 4, 5, 6, 7]
```

The minimum element `0` is at index `4`.

Therefore, the array has been rotated `4` times.

### Example 2

**Input:**  

```text
arr = [3, 4, 5, 1, 2]
```

**Output:**  

```text
3
```

**Explanation:**  

The original sorted array is:

```text
[1, 2, 3, 4, 5]
```

The minimum element `1` is at index `3`.

Therefore, the array has been rotated `3` times.

---

## [Problem 12: Search Single Element in a Sorted Array](Problem12.java)

**Leetcode**  
https://leetcode.com/problems/single-element-in-a-sorted-array

**Problem Statement:**  
Given a sorted array of `N` integers where every element appears exactly twice except for one element, find the single element that appears only once.

### Example 1

**Input:**  

```text
arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6}
```

**Output:**  

```text
4
```

**Explanation:**  

Only the number `4` appears once in the array.

### Example 2

**Input:**  

```text
arr[] = {1, 1, 3, 5, 5}
```

**Output:**  

```text
3
```

**Explanation:**  

Only the number `3` appears once in the array.


