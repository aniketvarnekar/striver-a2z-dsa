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

---

## [Problem 19: Best Time to Buy and Sell Stock](Problem19.java)

**Leetcode**  
https://leetcode.com/problems/best-time-to-buy-and-sell-stock

**Problem Statement:**  
You are given an array `prices` where `prices[i]` represents the stock price on the `i-th` day.

You want to maximize your profit by choosing:
- one day to buy the stock
- a different future day to sell the stock

Return the maximum profit possible.  
If no profit can be made, return `0`.

### Example 1

**Input:**  
`prices = [7, 1, 5, 3, 6, 4]`

**Output:**  
`5`

**Explanation:**  
Buy on day `2` at price `1` and sell on day `5` at price `6`.  
Profit = `6 - 1 = 5`.

Buying must happen before selling.

### Example 2

**Input:**  
`prices = [7, 6, 4, 3, 1]`

**Output:**  
`0`

**Explanation:**  
The stock prices continuously decrease, so no profit can be made.

---

## [Problem 20: Rearrange Array Elements by Sign](Problem20.java)

**Leetcode**  
https://leetcode.com/problems/rearrange-array-elements-by-sign/

**Problem Statement:**  
Given a 0-indexed integer array `nums` of even length containing an equal number of positive and negative integers, rearrange the array such that:

- Every consecutive pair of elements has opposite signs.
- The relative order of positive numbers remains unchanged.
- The relative order of negative numbers remains unchanged.
- The resulting array starts with a positive number.

Return the rearranged array.

### Example 1

**Input:**  
`nums = [3, 1, -2, -5, 2, -4]`

**Output:**  
`[3, -2, 1, -5, 2, -4]`

**Explanation:**  
Positive numbers: `[3, 1, 2]`  
Negative numbers: `[-2, -5, -4]`

By placing positives at even indices and negatives at odd indices while preserving their order, the result becomes:

`[3, -2, 1, -5, 2, -4]`

### Example 2

**Input:**  
`nums = [-1, 1]`

**Output:**  
`[1, -1]`

**Explanation:**  
There is one positive and one negative number.  
The rearranged array must begin with a positive number and alternate signs, resulting in:

`[1, -1]`

---

## [Problem 21: Next Permutation](Problem21.java)

**Leetcode**  
https://leetcode.com/problems/next-permutation

**Problem Statement:**  
A permutation of an array is an arrangement of its elements in a specific order.

Given an integer array `nums`, rearrange it into the next lexicographically greater permutation.

If such a permutation is not possible (i.e., the array is in descending order), rearrange it into the lowest possible order (ascending order).

The rearrangement must be performed **in-place** and use only **constant extra memory**.

### Example 1

**Input:**  
`nums = [1, 2, 3]`

**Output:**  
`[1, 3, 2]`

**Explanation:**  
The permutations of `[1, 2, 3]` in lexicographical order are:

`[1,2,3] → [1,3,2] → [2,1,3] → [2,3,1] → [3,1,2] → [3,2,1]`

The next permutation after `[1,2,3]` is `[1,3,2]`.

### Example 2

**Input:**  
`nums = [2, 3, 1]`

**Output:**  
`[3, 1, 2]`

**Explanation:**  
The next lexicographically greater permutation after `[2,3,1]` is `[3,1,2]`.

### Example 3

**Input:**  
`nums = [3, 2, 1]`

**Output:**  
`[1, 2, 3]`

**Explanation:**  
`[3,2,1]` is the largest possible permutation.  
Therefore, the next permutation wraps around to the smallest permutation, `[1,2,3]`.

---

## [Problem 22: Leaders in an Array](Problem22.java)

**Problem Statement:**  
Given an array of integers, find all the leaders in the array.

An element is considered a leader if it is greater than all the elements to its right.

The rightmost element is always a leader.

### Example 1

**Input:**  
`arr = [4, 7, 1, 0]`

**Output:**  
`[7, 1, 0]`

**Explanation:**  
- `0` is a leader because it is the rightmost element.
- `1` is greater than all elements to its right (`0`).
- `7` is greater than all elements to its right (`1, 0`).

Hence, the leaders are `[7, 1, 0]`.

### Example 2

**Input:**  
`arr = [10, 22, 12, 3, 0, 6]`

**Output:**  
`[22, 12, 6]`

**Explanation:**  
- `6` is a leader because it is the rightmost element.
- `12` is greater than all elements to its right (`3, 0, 6`).
- `22` is greater than all elements to its right (`12, 3, 0, 6`).

Hence, the leaders are `[22, 12, 6]`.

---

## [Problem 23: Longest Consecutive Sequence](Problem23.java)

**Leetcode**
https://leetcode.com/problems/longest-consecutive-sequence

**Problem Statement:**  
Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

A consecutive sequence consists of numbers that differ by exactly `1`.

Your algorithm must run in **O(N)** time complexity.

### Example 1

**Input:**  
`nums = [100, 4, 200, 1, 3, 2]`

**Output:**  
`4`

**Explanation:**  
The longest consecutive sequence is:

`[1, 2, 3, 4]`

Its length is `4`.

### Example 2

**Input:**  
`nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]`

**Output:**  
`9`

**Explanation:**  
The longest consecutive sequence is:

`[0, 1, 2, 3, 4, 5, 6, 7, 8]`

Its length is `9`.

### Example 3

**Input:**  
`nums = [1, 0, 1, 2]`

**Output:**  
`3`

**Explanation:**  
The longest consecutive sequence is:

`[0, 1, 2]`

Its length is `3`.

---

## [Problem 24: Set Matrix Zeroes](Problem24.java)

**Leetcode**  
https://leetcode.com/problems/set-matrix-zeroes

**Problem Statement:**  
Given an `m × n` matrix, if any element is `0`, set its entire row and column to `0`.

The operation must be performed on the matrix itself.

### Example 1

**Input:**  
`matrix = [[1,1,1],[1,0,1],[1,1,1]]`

**Output:**  
`[[1,0,1],[0,0,0],[1,0,1]]`

**Explanation:**  
Since `matrix[1][1] = 0`, its entire row and column are set to `0`.

### Example 2

**Input:**  
`matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]`

**Output:**  
`[[0,0,0,0],[0,4,5,0],[0,3,1,0]]`

**Explanation:**  
Since `matrix[0][0] = 0` and `matrix[0][3] = 0`:

- Row `0` becomes all zeroes.
- Column `0` becomes all zeroes.
- Column `3` becomes all zeroes.

The resulting matrix is:

`[[0,0,0,0],[0,4,5,0],[0,3,1,0]]`