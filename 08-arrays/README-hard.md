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

---

## [Problem 30: 3Sum](Problem30.java)

**Leetcode**  
https://leetcode.com/problems/3sum

**Problem Statement:**  
Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that:

- `i != j`
- `i != k`
- `j != k`
- `nums[i] + nums[j] + nums[k] == 0`

The solution set must not contain duplicate triplets.

### Example 1

**Input:**  
`nums = [-1, 0, 1, 2, -1, -4]`

**Output:**  

```text
[[-1, -1, 2], [-1, 0, 1]]
```

**Explanation:**  

The following triplets sum to zero:

- `(-1) + (-1) + 2 = 0`
- `(-1) + 0 + 1 = 0`

The distinct triplets are:

```text
[[-1, -1, 2], [-1, 0, 1]]
```

### Example 2

**Input:**  
`nums = [0, 1, 1]`

**Output:**  

```text
[]
```

**Explanation:**  
No triplet exists whose sum equals `0`.

### Example 3

**Input:**  
`nums = [0, 0, 0]`

**Output:**  

```text
[[0, 0, 0]]
```

**Explanation:**  
The only possible triplet is `[0, 0, 0]`, and its sum is `0`.

---

## [Problem 31: 4Sum](Problem31.java)

**Leetcode**  
https://leetcode.com/problems/4sum

**Problem Statement:**  
Given an array `nums` of `n` integers, return all unique quadruplets `[nums[a], nums[b], nums[c], nums[d]]` such that:

- `0 <= a, b, c, d < n`
- `a`, `b`, `c`, and `d` are distinct indices.
- `nums[a] + nums[b] + nums[c] + nums[d] == target`

The solution set must not contain duplicate quadruplets.

You may return the answer in any order.

### Example 1

**Input:**  
`nums = [1, 0, -1, 0, -2, 2], target = 0`

**Output:**  

```text
[[-2, -1, 1, 2],
 [-2,  0, 0, 2],
 [-1,  0, 0, 1]]
```

**Explanation:**  

The unique quadruplets whose sum equals `0` are:

- `[-2, -1, 1, 2]`
- `[-2, 0, 0, 2]`
- `[-1, 0, 0, 1]`

### Example 2

**Input:**  
`nums = [2, 2, 2, 2, 2], target = 8`

**Output:**  

```text
[[2, 2, 2, 2]]
```

**Explanation:**  

The only unique quadruplet whose sum equals `8` is:

- `[2, 2, 2, 2]`

---

## [Problem 32: Length of the Longest Subarray with Zero Sum](Problem32.java)

**Problem Statement:**  
Given an array containing both positive and negative integers, find the length of the longest subarray whose sum is equal to zero.

### Example 1

**Input:**  
`N = 6, array[] = {9, -3, 3, -1, 6, -5}`

**Output:**  
`5`

**Explanation:**  

The following subarrays have sum zero:

- `{-3, 3}`
- `{-1, 6, -5}`
- `{-3, 3, -1, 6, -5}`

The longest subarray with sum zero is:

```text
{-3, 3, -1, 6, -5}
```

Length = `5`

### Example 2

**Input:**  
`N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}`

**Output:**  
`8`

**Explanation:**  

The following subarrays have sum zero:

- `{-2, 2}`
- `{-8, 1, 7}`
- `{-2, 2, -8, 1, 7}`
- `{6, -2, 2, -8, 1, 7, 4, -10}`

The longest subarray with sum zero is:

```text
{6, -2, 2, -8, 1, 7, 4, -10}
```

Length = `8`

---

## [Problem 33: Count the Number of Subarrays with Given XOR K](Problem33.java)

**Problem Statement:**  
Given an array of integers `A` and an integer `K`, find the total number of subarrays whose bitwise XOR of all elements is equal to `K`.

### Example 1

**Input:**  
`A = [4, 2, 2, 6, 4], K = 6`

**Output:**  
`4`

**Explanation:**  

The subarrays having XOR equal to `6` are:

- `[4, 2]`
- `[4, 2, 2, 6, 4]`
- `[2, 2, 6]`
- `[6]`

Therefore, the answer is `4`.

### Example 2

**Input:**  
`A = [5, 6, 7, 8, 9], K = 5`

**Output:**  
`2`

**Explanation:**  

The subarrays having XOR equal to `5` are:

- `[5]`
- `[5, 6, 7, 8, 9]`

Therefore, the answer is `2`.

---

## [Problem 34: Merge Intervals](Problem34.java)

**Leetcode**  
https://leetcode.com/problems/merge-intervals

**Problem Statement:**  
Given an array of intervals where `intervals[i] = [starti, endi]`, merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.

### Example 1

**Input:**  
`intervals = [[1,3],[2,6],[8,10],[15,18]]`

**Output:**  

```text
[[1,6],[8,10],[15,18]]
```

**Explanation:**  
Intervals `[1,3]` and `[2,6]` overlap, so they are merged into `[1,6]`.

### Example 2

**Input:**  
`intervals = [[1,4],[4,5]]`

**Output:**  

```text
[[1,5]]
```

**Explanation:**  
Intervals `[1,4]` and `[4,5]` are considered overlapping and are merged into `[1,5]`.

### Example 3

**Input:**  
`intervals = [[4,7],[1,4]]`

**Output:**  

```text
[[1,7]]
```

**Explanation:**  
Intervals `[1,4]` and `[4,7]` overlap at `4`, so they are merged into `[1,7]`.

---

## [Problem 35: Merge Sorted Array](Problem35.java)

**Problem Statement:**  
Given two sorted integer arrays `nums1` and `nums2`, merge both arrays into a single array sorted in non-decreasing order.

The final sorted array should be stored inside `nums1` and the merge must be performed in-place.

Array `nums1` has a length of `m + n`, where the first `m` elements are valid elements and the remaining positions are `0`s. Array `nums2` has a length of `n`.

**Leetcode**  
https://leetcode.com/problems/merge-sorted-array

### Example 1

**Input:**  
`nums1 = [-5, -2, 4, 5, 0, 0, 0]`  
`nums2 = [-3, 1, 8]`

**Output:**  

```text
[-5, -3, -2, 1, 4, 5, 8]
```

**Explanation:**  
The merged array is:

```text
[-5, -3, -2, 1, 4, 5, 8]
```

where `[-5, -2, 4, 5]` are from `nums1` and `[-3, 1, 8]` are from `nums2`.

### Example 2

**Input:**  
`nums1 = [0, 2, 7, 8, 0, 0, 0]`  
`nums2 = [-7, -3, -1]`

**Output:**  

```text
[-7, -3, -1, 0, 2, 7, 8]
```

**Explanation:**  
The merged array is:

```text
[-7, -3, -1, 0, 2, 7, 8]
```

where `[0, 2, 7, 8]` are from `nums1` and `[-7, -3, -1]` are from `nums2`.

---

## [Problem 36: Merge Two Sorted Arrays Without Extra Space](Problem36.java)

**Problem Statement:**  
Given two sorted arrays `arr1[]` and `arr2[]` of sizes `m` and `n`, merge them such that the resulting elements remain sorted.

The merge must be performed **without using any extra space**.

After merging:

- The first `m` smallest elements should be present in `arr1`.
- The remaining `n` elements should be present in `arr2`.

### Example 1

**Input:**  
`arr1 = [1, 3, 5, 7]`  
`arr2 = [0, 2, 6, 8, 9]`

**Output:**  

```text
arr1 = [0, 1, 2, 3]
arr2 = [5, 6, 7, 8, 9]
```

**Explanation:**  
After merging and maintaining sorted order without using extra space:

```text
Combined sorted array:
[0, 1, 2, 3, 5, 6, 7, 8, 9]
```

The first 4 elements remain in `arr1` and the rest in `arr2`.

### Example 2

**Input:**  
`arr1 = [1, 4, 8, 10]`  
`arr2 = [2, 3, 9]`

**Output:**  

```text
arr1 = [1, 2, 3, 4]
arr2 = [8, 9, 10]
```

**Explanation:**  
After merging:

```text
Combined sorted array:
[1, 2, 3, 4, 8, 9, 10]
```

The arrays are rearranged in-place while preserving sorted order.

---

## [Problem 37: Set Mismatch](Problem37.java)

**Leetcode**  
https://leetcode.com/problems/set-mismatch

**Problem Statement:**  
You have a set of integers that originally contains all the numbers from `1` to `n`.

Due to an error, one number in the set appears twice, causing another number to be missing.

Given an integer array `nums` representing the set after the error, find the duplicated number and the missing number, and return them as an array.

### Example 1

**Input:**  
`nums = [1, 2, 2, 4]`

**Output:**  

```text
[2, 3]
```

**Explanation:**  

- `2` appears twice.
- `3` is missing.

Therefore, the answer is:

```text
[2, 3]
```

### Example 2

**Input:**  
`nums = [1, 1]`

**Output:**  

```text
[1, 2]
```

**Explanation:**  

- `1` appears twice.
- `2` is missing.

Therefore, the answer is:

```text
[1, 2]
```

---

## [Problem 38: Count Inversions in an Array](Problem38.java)

**Problem Statement:**  
Given an array of `N` integers, count the number of inversions in the array.

An inversion is a pair `(A[i], A[j])` such that:

- `i < j`
- `A[i] > A[j]`

### Example 1

**Input:**  
`N = 5, array[] = {1, 2, 3, 4, 5}`

**Output:**  

```text
0
```

**Explanation:**  
The array is already sorted. Therefore, there are no pairs `(A[i], A[j])` such that `i < j` and `A[i] > A[j]`.

### Example 2

**Input:**  
`N = 5, array[] = {5, 4, 3, 2, 1}`

**Output:**  

```text
10
```

**Explanation:**  
The array is reverse sorted, resulting in the maximum possible number of inversions.

The inversion pairs are:

```text
(5,4), (5,3), (5,2), (5,1),
(4,3), (4,2), (4,1),
(3,2), (3,1),
(2,1)
```

Total inversions = `10`.

### Example 3

**Input:**  
`N = 5, array[] = {5, 3, 2, 1, 4}`

**Output:**  

```text
7
```

**Explanation:**  
The inversion pairs are:

```text
(5,3), (5,2), (5,1), (5,4),
(3,2), (3,1),
(2,1)
```

Total inversions = `7`.