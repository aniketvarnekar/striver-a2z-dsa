# 08 — Arrays

# Easy

## [Problem 1: Find the Largest Element in an Array](Problem01.java)

**Problem Statement:**  
Given an array, find the largest element in the array.

### Example 1

**Input:**  
`arr[] = {2, 5, 1, 3, 0}`  

**Output:**  
`5`  

**Explanation:**  
5 is the largest element in the array.

### Example 2

**Input:**  
`arr[] = {8, 10, 5, 7, 9}`  

**Output:**  
`10`  

**Explanation:**  
10 is the largest element in the array.

---

## [Problem 2: Find Second Smallest and Second Largest Element in an Array](Problem02.java)

**Problem Statement:**  
Given an array, find the second smallest and second largest element in the array.  
Print `-1` if either of them does not exist.

### Example 1

**Input:**  
`arr[] = {1, 2, 4, 7, 7, 5}`  

**Output:**  
`Second Smallest : 2`  
`Second Largest : 5`  

**Explanation:**  
The elements are sorted as `1, 2, 4, 5, 7, 7`.  
Hence, the second smallest element is `2`, and the second largest element is `5`.

### Example 2

**Input:**  
`arr[] = {1}`  

**Output:**  
`Second Smallest : -1`  
`Second Largest : -1`  

**Explanation:**  
Since there is only one element in the array, there is no second smallest or second largest element.

---

## [Problem 3: Check if an Array is Sorted](Problem03.java)

**Problem Statement:**  
Given an array of size `N`, check whether the array is sorted in ascending (non-decreasing) order or not.

Return `true` if the array is sorted, otherwise return `false`.

### Example 1

**Input:**  
`N = 5, arr[] = {1, 2, 3, 4, 5}`  

**Output:**  
`true`  

**Explanation:**  
Every element in the array is smaller than or equal to its next element.  
Hence, the array is sorted in non-decreasing order.

### Example 2

**Input:**  
`N = 5, arr[] = {5, 4, 6, 7, 8}`  

**Output:**  
`false`  

**Explanation:**  
The element `5` is greater than `4`, so the array is not sorted in ascending order.

---

## [Problem 4: Check if Array Is Sorted and Rotated](Problem04.java)

**Problem Statement:**  
Given an array `nums`, return `true` if the array was originally sorted in non-decreasing order and then rotated some number of positions (including zero). Otherwise, return `false`.

There may be duplicates in the array.

An array is considered rotated if elements are shifted circularly.

### Example 1

**Input:**  
`nums = [3, 4, 5, 1, 2]`

**Output:**  
`true`

**Explanation:**  
`[1, 2, 3, 4, 5]` is the original sorted array.  
After rotating it by 2 positions, it becomes `[3, 4, 5, 1, 2]`.

### Example 2

**Input:**  
`nums = [2, 1, 3, 4]`

**Output:**  
`false`

**Explanation:**  
There is no sorted array which can be rotated to form this array.

### Example 3

**Input:**  
`nums = [1, 2, 3]`

**Output:**  
`true`

**Explanation:**  
The array is already sorted and rotated 0 times.