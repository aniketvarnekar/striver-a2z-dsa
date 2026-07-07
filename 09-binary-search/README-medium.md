# 09 — Binary Search [Medium]

## [Problem 14: Finding Square Root of a Number using Binary Search](Problem14.java)

**Problem Statement:**  
You are given a positive integer `N`. Find and return the floor value of its square root.

If `N` is a perfect square, return its exact square root. Otherwise, return the greatest integer less than the actual square root.

### Example 1

**Input:**  

```text
N = 36
```

**Output:**  

```text
6
```

**Explanation:**  

The square root of `36` is `6`.

### Example 2

**Input:**  

```text
N = 28
```

**Output:**  

```text
5
```

**Explanation:**  

The square root of `28` is approximately `5.292`.

Therefore, the floor value of the square root is `5`.

---

## [Problem 15: Nth Root of a Number using Binary Search](Problem15.java)

**Problem Statement:**  
Given two positive integers `N` and `M`, find the `N`th root of `M`.

The `N`th root of a number `M` is defined as an integer `X` such that:

```text
X^N = M
```

If the `N`th root is not an integer, return `-1`.

### Example 1

**Input:**  

```text
N = 3
M = 27
```

**Output:**  

```text
3
```

**Explanation:**  

The cube root of `27` is `3` because:

```text
3³ = 27
```

### Example 2

**Input:**  

```text
N = 4
M = 69
```

**Output:**  

```text
-1
```

**Explanation:**  

There is no integer whose 4th power is `69`.

Therefore, the answer is `-1`.

---

## [Problem 16: Koko Eating Bananas](Problem16.java)

**Leetcode**  
https://leetcode.com/problems/koko-eating-bananas

**Problem Statement:**  
A monkey Koko is given `N` piles of bananas, where the `i`th pile contains `a[i]` bananas. An integer `h` is also given, representing the total number of hours available to eat all the bananas.

Each hour, Koko chooses a non-empty pile and eats `k` bananas from it. If the pile contains fewer than `k` bananas, Koko eats all the bananas in that pile and does not eat from any other pile during that hour.

Find the minimum integer value of `k` such that Koko can finish all the bananas within `h` hours.

### Example 1

**Input:**  

```text
N = 4
a[] = {7, 15, 6, 3}
h = 8
```

**Output:**  

```text
5
```

**Explanation:**  

If Koko eats `5` bananas per hour, she will take:

- 2 hours for pile `7`
- 3 hours for pile `15`
- 2 hours for pile `6`
- 1 hour for pile `3`

Total time = `2 + 3 + 2 + 1 = 8` hours.

### Example 2

**Input:**  

```text
N = 5
a[] = {25, 12, 8, 14, 19}
h = 5
```

**Output:**  

```text
25
```

**Explanation:**  

If Koko eats `25` bananas per hour, each pile is finished in `1` hour.

Therefore, the total time required is `5` hours.

---

## [Problem 17: Minimum Days to Make M Bouquets](Problem17.java)

**Leetcode**  
https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets

**Problem Statement:**  
You are given `N` roses and an array `arr`, where `arr[i]` represents the day on which the `i`th rose blooms.

You can only pick adjacent bloomed roses to make a bouquet. Each bouquet must contain exactly `k` adjacent bloomed roses.

Find the minimum number of days required to make at least `m` bouquets. If it is impossible to make the required bouquets, return `-1`.

### Example 1

**Input:**  

```text
N = 8
arr[] = {7, 7, 7, 7, 13, 11, 12, 7}
m = 2
k = 3
```

**Output:**  

```text
12
```

**Explanation:**  

On day `12`, the first `4` flowers and the last `3` flowers have bloomed.

We can make:

- One bouquet using the first `3` flowers.
- Another bouquet using the last `3` flowers.

Hence, the minimum number of days required is `12`.

### Example 2

**Input:**  

```text
N = 5
arr[] = {1, 10, 3, 10, 2}
m = 3
k = 2
```

**Output:**  

```text
-1
```

**Explanation:**  

To make `3` bouquets of `2` flowers each, we need at least `6` flowers.

Since only `5` flowers are available, it is impossible to make the required bouquets.

---

## [Problem 18: Find the Smallest Divisor Given a Threshold](Problem18.java)

**Leetcode**  
https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold

**Problem Statement:**  
You are given an array of integers `arr` and an integer `limit`.

Find the smallest positive integer divisor such that, after dividing every element of the array by the divisor and rounding each result up to the nearest integer, the sum of these values is less than or equal to `limit`.

### Example 1

**Input:**  

```text
N = 5
arr[] = {1, 2, 3, 4, 5}
limit = 8
```

**Output:**  

```text
3
```

**Explanation:**  

- Divisor `1` gives sum = `1 + 2 + 3 + 4 + 5 = 15`
- Divisor `2` gives sum = `1 + 1 + 2 + 2 + 3 = 9`
- Divisor `3` gives:

```text
ceil(1/3) + ceil(2/3) + ceil(3/3) + ceil(4/3) + ceil(5/3)
= 1 + 1 + 1 + 2 + 2
= 7
```

Since `7 ≤ 8`, the smallest possible divisor is `3`.

### Example 2

**Input:**  

```text
N = 4
arr[] = {8, 4, 2, 3}
limit = 10
```

**Output:**  

```text
2
```

**Explanation:**  

- Divisor `1` gives sum = `17`
- Divisor `2` gives:

```text
ceil(8/2) + ceil(4/2) + ceil(2/2) + ceil(3/2)
= 4 + 2 + 1 + 2
= 9
```

Since `9 ≤ 10`, the smallest possible divisor is `2`.

---

## [Problem 19: Capacity to Ship Packages within D Days](Problem19.java)

**Leetcode**  
https://leetcode.com/problems/capacity-to-ship-packages-within-d-days

**Problem Statement:**  
You are the owner of a shipment company. Packages must be shipped from one port to another within `d` days.

The weights of the packages are given in the array `weights`. Packages are loaded onto the ship in the same order as they appear in the array. The total weight loaded on a ship in a single day must not exceed the ship's maximum capacity.

Find the minimum ship capacity required to ship all the packages within `d` days.

### Example 1

**Input:**  

```text
N = 8
weights = [5, 4, 5, 2, 3, 4, 5, 6]
d = 5
```

**Output:**  

```text
9
```

**Explanation:**  

The minimum ship capacity required to ship all the packages within `5` days is `9`.

### Example 2

**Input:**  

```text
N = 5
weights = [1, 2, 3, 4, 5]
d = 2
```

**Output:**  

```text
9
```

**Explanation:**  

With a ship capacity of `9`, the packages can be shipped in `2` days as:

```text
Day 1: [1, 2, 3, 4]
Day 2: [5]
```

---

## [Problem 20: Kth Missing Positive Number](Problem20.java)

**Leetcode**  
https://leetcode.com/problems/kth-missing-positive-number

**Problem Statement:**  
You are given a strictly increasing array `vec` of positive integers and a positive integer `k`.

Find the `k`th positive integer that is missing from the array.

### Example 1

**Input:**  

```text
vec[] = {4, 7, 9, 10}
k = 1
```

**Output:**  

```text
1
```

**Explanation:**  

The missing positive integers are:

```text
1, 2, 3, 5, 6, 8, 11, 12, ...
```

Since `k = 1`, the first missing positive integer is `1`.

### Example 2

**Input:**  

```text
vec[] = {4, 7, 9, 10}
k = 4
```

**Output:**  

```text
5
```

**Explanation:**  

The missing positive integers are:

```text
1, 2, 3, 5, 6, 8, 11, 12, ...
```

Since `k = 4`, the fourth missing positive integer is `5`.

---

## [Problem 21: Aggressive Cows](Problem21.java)

**Leetcode**  
https://leetcode.com/problems/magnetic-force-between-two-balls

**Problem Statement:**  
You are given an array `arr` of size `N` representing the positions of stalls and an integer `k` representing the number of aggressive cows.

Assign the `k` cows to the stalls such that the minimum distance between any two cows is as large as possible.

Return the maximum possible minimum distance.

### Example 1

**Input:**  

```text
N = 6
k = 4
arr[] = {0, 3, 4, 7, 10, 9}
```

**Output:**  

```text
3
```

**Explanation:**  

The stalls after sorting are:

```text
{0, 3, 4, 7, 9, 10}
```

One optimal placement is:

```text
{0, 3, 7, 10}
```

The distances between consecutive cows are:

```text
3, 4, 3
```

Therefore, the maximum possible minimum distance is `3`.

### Example 2

**Input:**  

```text
N = 5
k = 2
arr[] = {4, 2, 1, 3, 6}
```

**Output:**  

```text
5
```

**Explanation:**  

After sorting, the stalls become:

```text
{1, 2, 3, 4, 6}
```

Placing the two cows at positions `1` and `6` gives a minimum distance of `5`, which is the maximum possible.

---

## [Problem 22: Allocate Minimum Number of Pages](Problem22.java)

**Problem Statement:**  
Given an array `arr` where `arr[i]` represents the number of pages in the `i`th book and an integer `m` representing the number of students, allocate all the books among the students such that:

- Each student gets at least one book.
- Each book is allocated to exactly one student.
- Books allocated to a student must be contiguous.

Find the minimum possible value of the maximum number of pages assigned to any student. If it is not possible to allocate the books, return `-1`.

### Example 1

**Input:**  

```text
n = 4
m = 2
arr[] = {12, 34, 67, 90}
```

**Output:**  

```text
113
```

**Explanation:**  

The books can be allocated as:

```text
12, 34, 67 | 90
```

The first student gets `113` pages and the second student gets `90` pages.

Therefore, the minimum possible maximum number of pages assigned to a student is `113`.

### Example 2

**Input:**  

```text
n = 5
m = 4
arr[] = {25, 46, 28, 49, 24}
```

**Output:**  

```text
71
```

**Explanation:**  

The books can be allocated as:

```text
25, 46 | 28 | 49 | 24
```

The maximum number of pages assigned to any student is `71`, which is the minimum possible.

---

## [Problem 23: Split Array Largest Sum](Problem23.java)

**Leetcode**  
https://leetcode.com/problems/split-array-largest-sum

**Problem Statement:**  
Given an integer array `nums` and an integer `k`, split the array into `k` non-empty contiguous subarrays such that the largest sum among these subarrays is minimized.

Return the minimum possible value of the largest subarray sum.

A subarray is a contiguous part of the array.

### Example 1

**Input:**  

```text
nums = [7, 2, 5, 10, 8]
k = 2
```

**Output:**  

```text
18
```

**Explanation:**  

There are four possible ways to split the array into two subarrays.

The optimal split is:

```text
[7, 2, 5] | [10, 8]
```

The subarray sums are:

```text
14, 18
```

The largest sum is `18`, which is the minimum possible.

### Example 2

**Input:**  

```text
nums = [1, 2, 3, 4, 5]
k = 2
```

**Output:**  

```text
9
```

**Explanation:**  

There are four possible ways to split the array into two subarrays.

The optimal split is:

```text
[1, 2, 3] | [4, 5]
```

The subarray sums are:

```text
6, 9
```

The largest sum is `9`, which is the minimum possible.

---

## [Problem 24: Painter's Partition Problem](Problem24.java)

**Problem Statement:**  
You are given an array `boards` of length `N`, where `boards[i]` represents the length of the `i`th board. There are `K` painters available to paint these boards.

Each unit length of a board takes `1` unit of time to paint. Every painter can paint only contiguous boards, and a board cannot be divided between multiple painters.

Find the minimum time required to paint all the boards.

### Example 1

**Input:**  

```text
N = 4
boards[] = {5, 5, 5, 5}
k = 2
```

**Output:**  

```text
10
```

**Explanation:**  

The boards can be divided as:

```text
{5, 5} | {5, 5}
```

Each painter paints `10` units.

Therefore, the minimum time required is `10`.

### Example 2

**Input:**  

```text
N = 4
boards[] = {10, 20, 30, 40}
k = 2
```

**Output:**  

```text
60
```

**Explanation:**  

The boards can be divided as:

```text
{10, 20, 30} | {40}
```

The first painter paints `60` units and the second painter paints `40` units.

Hence, the minimum time required is `60`.

---

## [Problem 25: Minimise Maximum Distance between Gas Stations](Problem25.java)

**Problem Statement:**  
You are given a sorted array `arr` of length `N`, where `arr[i]` represents the position of the `i`th gas station on the X-axis. You are also given an integer `k`, representing the number of new gas stations to be added.

You may place the new gas stations anywhere on the non-negative side of the X-axis, including non-integer positions.

After adding the `k` gas stations, let `dist` be the maximum distance between any two adjacent gas stations.

Find the minimum possible value of `dist`.

### Example 1

**Input:**  

```text
N = 5
arr[] = {1, 2, 3, 4, 5}
k = 4
```

**Output:**  

```text
0.5
```

**Explanation:**  

One optimal placement is:

```text
{1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, 5}
```

The maximum distance between adjacent gas stations becomes:

```text
0.5
```

It can be shown that no arrangement can produce a smaller maximum distance.

### Example 2

**Input:**  

```text
N = 10
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
k = 1
```

**Output:**  

```text
1.0
```

**Explanation:**  

One possible placement is:

```text
{1, 1.5, 2, 3, 4, 5, 6, 7, 8, 9, 10}
```

The maximum distance between adjacent gas stations is still:

```text
1.0
```

It is impossible to reduce the maximum adjacent distance below `1.0` by adding only one gas station.

---

## [Problem 26: Median of Two Sorted Arrays](Problem26.java)

**Leetcode** 
https://leetcode.com/problems/median-of-two-sorted-arrays

**Problem Statement:**  
Given two sorted arrays `nums1` and `nums2` of sizes `m` and `n` respectively, return the median of the two sorted arrays.

The overall runtime complexity should be **O(log(m + n))**.

The median is the middle element of the combined sorted array. If the total number of elements is even, the median is the average of the two middle elements.

### Example 1

**Input:**  

```text
nums1 = [1, 3]
nums2 = [2]
```

**Output:**  

```text
2.00000
```

**Explanation:**  

The merged sorted array is:

```text
[1, 2, 3]
```

The middle element is `2`, so the median is `2.00000`.

### Example 2

**Input:**  

```text
nums1 = [1, 2]
nums2 = [3, 4]
```

**Output:**  

```text
2.50000
```

**Explanation:**  

The merged sorted array is:

```text
[1, 2, 3, 4]
```

The two middle elements are `2` and `3`.

Median:

```text
(2 + 3) / 2 = 2.5
```

---

## [Problem 27: K-th Element of Two Sorted Arrays](Problem27.java)

**Problem Statement:**  
Given two sorted arrays `a` and `b` of sizes `m` and `n` respectively, and an integer `k`, find the `k`th smallest element in the merged sorted array.

The overall runtime complexity should be **O(log(min(m, n)))**.

### Example 1

**Input:**  

```text
a = [2, 3, 6, 7, 9]
b = [1, 4, 8, 10]
k = 5
```

**Output:**  

```text
6
```

**Explanation:**  

The merged sorted array is:

```text
[1, 2, 3, 4, 6, 7, 8, 9, 10]
```

The `5`th smallest element is `6`.

### Example 2

**Input:**  

```text
a = [100, 112, 256, 349, 770]
b = [72, 86, 113, 119, 265, 445, 892]
k = 7
```

**Output:**  

```text
256
```

**Explanation:**  

The merged sorted array is:

```text
[72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]
```

The `7`th smallest element is `256`.