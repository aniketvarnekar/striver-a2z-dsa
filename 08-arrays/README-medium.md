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

---

## [Problem 17: Majority Element](Problem17.java)

**Leetcode**  
https://leetcode.com/problems/majority-element

**Problem Statement:**  
Given an array `nums` of size `n`, find the majority element.

The majority element is the element that appears more than `⌊n / 2⌋` times.

You may assume that the majority element always exists in the array.

### Example 1

**Input:**  
`nums = [3, 2, 3]`

**Output:**  
`3`

**Explanation:**  
The element `3` appears `2` times, which is more than `⌊3 / 2⌋ = 1`.

### Example 2

**Input:**  
`nums = [2, 2, 1, 1, 1, 2, 2]`

**Output:**  
`2`

**Explanation:**  
The element `2` appears `4` times, which is more than `⌊7 / 2⌋ = 3`.

---

## [Problem 18: Maximum Subarray](Problem18.java)

**Leetcode**  
https://leetcode.com/problems/maximum-subarray

**Problem Statement:**  
Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

### Example 1

**Input:**  
`nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`

**Output:**  
`6`

**Explanation:**  
The subarray `[4, -1, 2, 1]` has the largest sum:  
`4 + (-1) + 2 + 1 = 6`

### Example 2

**Input:**  
`nums = [1]`

**Output:**  
`1`

**Explanation:**  
The subarray `[1]` itself has the maximum sum.

### Example 3

**Input:**  
`nums = [5, 4, -1, 7, 8]`

**Output:**  
`23`

**Explanation:**  
The subarray `[5, 4, -1, 7, 8]` has the largest sum:  
`5 + 4 + (-1) + 7 + 8 = 23`