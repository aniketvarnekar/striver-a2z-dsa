# 08 — Arrays [Medium]

## [Problem 15: Two Sum](Problem15.java)

**Leetcode**  
https://leetcode.com/problems/two-sum

**Problem Statement:**  
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

You may assume that:
- Each input has exactly one solution.
- The same element cannot be used twice.
- The answer can be returned in any order.

### Example 1

**Input:**  
`nums = [2, 7, 11, 15], target = 9`

**Output:**  
`[0, 1]`

**Explanation:**  
`nums[0] + nums[1] = 2 + 7 = 9`  
Hence, the answer is `[0, 1]`.

### Example 2

**Input:**  
`nums = [3, 2, 4], target = 6`

**Output:**  
`[1, 2]`

**Explanation:**  
`nums[1] + nums[2] = 2 + 4 = 6`  
Hence, the answer is `[1, 2]`.

### Example 3

**Input:**  
`nums = [3, 3], target = 6`

**Output:**  
`[0, 1]`

**Explanation:**  
`nums[0] + nums[1] = 3 + 3 = 6`  
Hence, the answer is `[0, 1]`.

---

## [Problem 16: Sort Colors](Problem16.java)

**Leetcode**
https://leetcode.com/problems/sort-colors

**Problem Statement:**  
Given an array `nums` containing only `0`, `1`, and `2`, sort the array in-place such that:

- `0` represents Red
- `1` represents White
- `2` represents Blue

The colors should appear in the order:  
`0 → 1 → 2`

You must solve the problem without using the library sort function.

### Example 1

**Input:**  
`nums = [2, 0, 2, 1, 1, 0]`

**Output:**  
`[0, 0, 1, 1, 2, 2]`

**Explanation:**  
After sorting, all `0`s appear first, followed by `1`s, then `2`s.

### Example 2

**Input:**  
`nums = [2, 0, 1]`

**Output:**  
`[0, 1, 2]`

**Explanation:**  
The array is rearranged into sorted color order.