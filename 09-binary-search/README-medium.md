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