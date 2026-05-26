# 08 — Arrays [Easy]

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

**Leetcode**  
https://leetcode.com/problems/check-if-array-is-sorted-and-rotated

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

---

## [Problem 5: Remove Duplicates In-place from Sorted Array](Problem05.java)

**Leetcode**  
https://leetcode.com/problems/remove-duplicates-from-sorted-array

**Problem Statement:**  
Given a sorted integer array in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.

The relative order of the elements should remain the same.

After removing duplicates, the first `k` elements of the array should contain the unique elements, where `k` is the number of unique elements.

### Example 1

**Input:**  
`arr[] = {1, 1, 2, 2, 2, 3, 3}`  

**Output:**  
`[1, 2, 3, _, _, _, _]`  

**Explanation:**  
The unique elements are `1, 2, 3`.  
Hence, the first 3 positions of the array contain the final result.

### Example 2

**Input:**  
`arr[] = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4}`  

**Output:**  
`[1, 2, 3, 4, _, _, _, _, _, _, _]`  

**Explanation:**  
The unique elements are `1, 2, 3, 4`.  
Hence, the first 4 positions of the array contain the final result.

---

## [Problem 6: Rotate Array by K Elements](Problem06.java)

**Leetcode**  
https://leetcode.com/problems/rotate-array

**Problem Statement:**  
Given an array of integers, rotate the array by `k` positions either to the left or right.

### Example 1

**Input:**  
`nums = [1, 2, 3, 4, 5, 6, 7], k = 2, direction = right`

**Output:**  
`[6, 7, 1, 2, 3, 4, 5]`

**Explanation:**  
After 1 right rotation: `[7, 1, 2, 3, 4, 5, 6]`  
After 2 right rotations: `[6, 7, 1, 2, 3, 4, 5]`

### Example 2

**Input:**  
`nums = [1, 2, 3, 4, 5, 6], k = 2, direction = left`

**Output:**  
`[3, 4, 5, 6, 1, 2]`

**Explanation:**  
After 1 left rotation: `[2, 3, 4, 5, 6, 1]`  
After 2 left rotations: `[3, 4, 5, 6, 1, 2]`

---

## [Problem 7: Move All Zeroes to the End of the Array](Problem07.java)

**Leetcode**  
https://leetcode.com/problems/move-zeroes

**Problem Statement:**  
Given an array of integers, move all the zeroes to the end of the array while maintaining the relative order of non-zero elements.

### Example 1

**Input:**  
`arr[] = {1, 0, 2, 3, 0, 4, 0, 1}`  

**Output:**  
`{1, 2, 3, 4, 1, 0, 0, 0}`  

**Explanation:**  
All the zeroes are moved to the end while maintaining the order of non-zero elements.

### Example 2

**Input:**  
`arr[] = {1, 2, 0, 1, 0, 4, 0}`  

**Output:**  
`{1, 2, 1, 4, 0, 0, 0}`  

**Explanation:**  
All the zeroes are moved to the end while maintaining the order of non-zero elements.

---

## [Problem 9: Union of Two Sorted Arrays](Problem09.java)

**Problem Statement:**  
Given two sorted arrays `arr1[]` and `arr2[]` of size `n` and `m`, find the union of the two arrays.

The union of two arrays contains all distinct elements present in either array, arranged in ascending order.

### Example 1

**Input:**  
`n = 5, m = 5`  
`arr1[] = {1, 2, 3, 4, 5}`  
`arr2[] = {2, 3, 4, 4, 5}`  

**Output:**  
`{1, 2, 3, 4, 5}`  

**Explanation:**  
Common elements in both arrays are `2, 3, 4, 5`.  
Distinct element in `arr1` is `1`.  
There are no distinct elements in `arr2`.  
Hence, the union is `{1, 2, 3, 4, 5}`.

### Example 2

**Input:**  
`n = 10, m = 7`  
`arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}`  
`arr2[] = {2, 3, 4, 4, 5, 11, 12}`  

**Output:**  
`{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}`  

**Explanation:**  
Common elements in both arrays are `2, 3, 4, 5`.  
Distinct elements in `arr1` are `1, 6, 7, 8, 9, 10`.  
Distinct elements in `arr2` are `11, 12`.  
Hence, the union is `{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}`.

---

## [Problem 10: Find the Missing Number](Problem10.java)

**Problem Statement:**  
Given an array `arr[]` of size `n - 1` containing distinct integers in the range `[1, n]`, find the missing number in the array.

The array represents a permutation of numbers from `1` to `n` with exactly one number missing.

### Example 1

**Input:**  
`arr[] = {8, 2, 4, 5, 3, 7, 1}`  

**Output:**  
`6`  

**Explanation:**  
All numbers from `1` to `8` are present except `6`.

### Example 2

**Input:**  
`arr[] = {1, 2, 3, 5}`  

**Output:**  
`4`  

**Explanation:**  
The array size is `4`, so the range is `[1, 5]`.  
The missing number in this range is `4`.

---

## [Problem 11: Count Maximum Consecutive One's in the Array](Problem11.java)

**Leetcode**  
https://leetcode.com/problems/max-consecutive-ones

**Problem Statement:**  
Given a binary array containing only `0`s and `1`s, find the maximum number of consecutive `1`s present in the array.

### Example 1

**Input:**  
`arr[] = {1, 1, 0, 1, 1, 1}`  

**Output:**  
`3`  

**Explanation:**  
There are two consecutive `1`s and three consecutive `1`s in the array.  
The maximum consecutive count is `3`.

### Example 2

**Input:**  
`arr[] = {1, 0, 1, 1, 0, 1}`  

**Output:**  
`2`  

**Explanation:**  
The maximum number of consecutive `1`s in the array is `2`.

---

## [Problem 12: Find the Number that Appears Once](Problem12.java)

**Leetcode**  
https://leetcode.com/problems/single-number

**Problem Statement:**  
Given a non-empty array of integers where every element appears twice except for one element, find the element that appears only once.

### Example 1

**Input:**  
`arr[] = {2, 2, 1}`  

**Output:**  
`1`  

**Explanation:**  
Only the element `1` appears once, while all other elements appear twice.

### Example 2

**Input:**  
`arr[] = {4, 1, 2, 1, 2}`  

**Output:**  
`4`  

**Explanation:**  
Only the element `4` appears once, while all other elements appear twice.

---

## [Problem 13: Longest Subarray with Given Sum K (Positives)](Problem13.java)

**Problem Statement:**  
Given an array `nums` of positive integers and an integer `k`, find the length of the longest subarray whose sum is equal to `k`.

If no such subarray exists, return `0`.

### Example 1

**Input:**  
`nums = [10, 5, 2, 7, 1, 9], k = 15`  

**Output:**  
`4`  

**Explanation:**  
The longest subarray with sum `15` is `[5, 2, 7, 1]`.  
Its length is `4`.

### Example 2

**Input:**  
`nums = [-3, 2, 1], k = 6`  

**Output:**  
`0`  

**Explanation:**  
There is no subarray whose sum equals `6`.  
Hence, the answer is `0`.

---

## [Problem 14: Length of the Longest Subarray with Zero Sum](Problem14.java)

**Problem Statement:**  
Given an array containing both positive and negative integers, find the length of the longest subarray whose sum is equal to `0`.

### Example 1

**Input:**  
`N = 6, arr[] = {9, -3, 3, -1, 6, -5}`  

**Output:**  
`5`  

**Explanation:**  
The following subarrays have sum `0`:

- `{-3, 3}`
- `{-1, 6, -5}`
- `{-3, 3, -1, 6, -5}`

The longest subarray with sum `0` has length `5`.

### Example 2

**Input:**  
`N = 8, arr[] = {6, -2, 2, -8, 1, 7, 4, -10}`  

**Output:**  
`8`  

**Explanation:**  
The following subarrays have sum `0`:

- `{-2, 2}`
- `{-8, 1, 7}`
- `{-2, 2, -8, 1, 7}`
- `{6, -2, 2, -8, 1, 7, 4, -10}`

The longest subarray with sum `0` has length `8`.