# 04 — Basic Maths

## [Problem 01: Count digits in a number](Problem01.java)

**Problem Statement:**  
Given an integer `N`, return the number of digits in `N`.

### Example 1 
**Input:** `N = 12345`  
**Output:** `5`  
**Explanation:** The number `12345` has 5 digits.

### Example 2
**Input:** `N = 7789`  
**Output:** `4`  
**Explanation:** The number `7789` has 4 digits.

---

## [Problem 02: Reverse digits of a number](Problem02.java)

**Problem Statement:**  
Given an integer `N`, return the reverse of the given number.

**Note:**  
If a number has trailing zeros, its reverse should not include leading zeros.  
For example, the reverse of `10400` is `401`, not `00401`.

### Example 1  
**Input:** `N = 12345`  
**Output:** `54321`  
**Explanation:** The reverse of `12345` is `54321`.

### Example 2  
**Input:** `N = 7789`  
**Output:** `9877`  
**Explanation:** The reverse of `7789` is `9877`.

---

## [Problem 03: Check if a number is Palindrome or Not](Problem03.java)

**Problem Statement:**  
Given an integer N, return true if it is a palindrome else return false.

**Note:**  
A palindrome is a number that reads the same backward as forward. For example, `121`, `1331`, and `4554` are palindromes because they remain the same when their digits are reversed. 

### Example 1  
**Input:** `N = 4554`  
**Output:** Palindrome Number  
**Explanation:** The reverse of `4554` is `4554` and therefore it is palindrome number

### Example 2  
**Input:** `N = 7789`  
**Output:** Not Palindrome  
**Explanation:** The reverse of number `7789` is `9877` and therefore it is not palindrome

---

## [Problem 04: Find GCD of two numbers](Problem04.java)

**Problem Statement:**  
Given two integers `N1` and `N2`, find their Greatest Common Divisor (GCD).

The Greatest Common Divisor of two numbers is the largest positive integer that divides both numbers without leaving a remainder.

### Example 1  
**Input:** `N1 = 9`, `N2 = 12`  
**Output:** `3`  
**Explanation:**  
Factors of `9`: 1, 3, 9  
Factors of `12`: 1, 2, 3, 4, 6, 12  
Common Factors: 1, 3  
Greatest Common Divisor: `3`

### Example 2  
**Input:** `N1 = 20`, `N2 = 15`  
**Output:** `5`  
**Explanation:**  
Factors of `20`: 1, 2, 4, 5, 10, 20  
Factors of `15`: 1, 3, 5, 15  
Common Factors: 1, 5  
Greatest Common Divisor: `5`

---

## [Problem 05: Check if a number is Armstrong Number](Problem05.java)

**Problem Statement:**  
Given an integer `N`, return `true` if it is an Armstrong number; otherwise, return `false`.

An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the total number of digits.

### Example 1  
**Input:** `N = 153`  
**Output:** `True`  
**Explanation:**  
1³ + 5³ + 3³ = 1 + 125 + 27 = 153  

### Example 2  
**Input:** `N = 371`  
**Output:** `True`  
**Explanation:**  
3³ + 7³ + 1³ = 27 + 343 + 1 = 371 

---

## [Problem 06: Print all Divisors of a given Number](Problem06.java)

**Problem Statement:**  
Given an integer `N`, return all divisors of `N`.

A divisor of an integer `N` is a positive integer that divides `N` without leaving a remainder. In other words, if `N` is divisible by another integer with no remainder, then that integer is considered a divisor of `N`.

### Example 1  
**Input:** `N = 36`  
**Output:** `[1, 2, 3, 4, 6, 9, 12, 18, 36]`  
**Explanation:**  
The divisors of `36` are `1, 2, 3, 4, 6, 9, 12, 18, 36`.

### Example 2  
**Input:** `N = 12`  
**Output:** `[1, 2, 3, 4, 6, 12]`  
**Explanation:**  
The divisors of `12` are `1, 2, 3, 4, 6, 12`.

---

## [Problem 07: Check if a number is Prime](Problem07.java)

**Problem Statement:**  
Given an integer `N`, determine whether it is a prime number.

A prime number is a number that is divisible only by `1` and itself.  
In other words, a prime number has exactly two distinct positive divisors.

### Example 1  
**Input:** `N = 2`  
**Output:** `True`  
**Explanation:**  
2 is a prime number because it has exactly two divisors: `1` and `2`.

### Example 2  
**Input:** `N = 10`  
**Output:** `False`  
**Explanation:**  
10 is not a prime number because it has four divisors: `1, 2, 5, 10`.  
Since it has more than two divisors, it is a composite number.

---

## [Problem 08: Count Odd Digits in a Number](Problem08.java)

**Problem Statement:**

Given an integer `n`, return the **number of odd digits** present in the number.

The number will have no leading zeroes, except when the number is `0` itself.

### Example 1

**Input:**

```text
n = 12345
```

**Output:**

```text
3
```

**Explanation:**

The odd digits are `1`, `3`, and `5`.

Therefore, the total number of odd digits is `3`.

### Example 2

**Input:**

```text
n = 2468
```

**Output:**

```text
0
```

**Explanation:**

All digits in `2468` are even, so there are no odd digits.

### Example 3

**Input:**

```text
n = 13579
```

**Output:**

```text
5
```

**Explanation:**

All five digits are odd, so the count is `5`.

### Example 4

**Input:**

```text
n = 0
```

**Output:**

```text
0
```

**Explanation:**

The number `0` contains one even digit and therefore has no odd digits.

### Example 5

**Input:**

```text
n = 1203045
```

**Output:**

```text
3
```

**Explanation:**

The odd digits are `1`, `3`, and `5`.

Therefore, the total number of odd digits is `3`.

---

## [Problem 09: Find the Largest Digit in a Number](Problem09.java)

**Problem Statement:**

Given an integer `n`, return the **largest digit** present in the number.

### Example 1

**Input:**

```text
n = 25
```

**Output:**

```text
5
```

**Explanation:**

The digits in `25` are `2` and `5`. The largest digit is `5`.

### Example 2

**Input:**

```text
n = 99
```

**Output:**

```text
9
```

**Explanation:**

Both digits are `9`, so the largest digit is `9`.

### Example 3

**Input:**

```text
n = 12345
```

**Output:**

```text
5
```

**Explanation:**

The digits are `1`, `2`, `3`, `4`, and `5`. The largest digit is `5`.

### Example 4

**Input:**

```text
n = 80421
```

**Output:**

```text
8
```

**Explanation:**

The digits are `8`, `0`, `4`, `2`, and `1`. The largest digit is `8`.

### Example 5

**Input:**

```text
n = 0
```

**Output:**

```text
0
```

**Explanation:**

The number `0` contains only one digit, so the largest digit is `0`.

---

## [Problem 10: Check for Perfect Number](Problem10.java)

**Problem Statement:**

Given an integer `n`, determine whether it is a **perfect number**.

A **perfect number** is a positive integer whose **proper divisors**, excluding the number itself, add up exactly to the number.

Return `true` if `n` is a perfect number; otherwise, return `false`.

### Example 1

**Input:**

```text
n = 6
```

**Output:**

```text
true
```

**Explanation:**

The proper divisors of `6` are `1`, `2`, and `3`.

```text
1 + 2 + 3 = 6
```

Therefore, `6` is a perfect number.

### Example 2

**Input:**

```text
n = 4
```

**Output:**

```text
false
```

**Explanation:**

The proper divisors of `4` are `1` and `2`.

```text
1 + 2 = 3
```

Since the sum of the proper divisors is not equal to `4`, it is not a perfect number.

### Example 3

**Input:**

```text
n = 28
```

**Output:**

```text
true
```

**Explanation:**

The proper divisors of `28` are `1`, `2`, `4`, `7`, and `14`.

```text
1 + 2 + 4 + 7 + 14 = 28
```

Therefore, `28` is a perfect number.

### Example 4

**Input:**

```text
n = 1
```

**Output:**

```text
false
```

**Explanation:**

`1` has no proper positive divisors other than itself, and the number itself is excluded. Therefore, the sum of its proper divisors is `0`, which is not equal to `1`.

### Example 5

**Input:**

```text
n = 12
```

**Output:**

```text
false
```

**Explanation:**

The proper divisors of `12` are `1`, `2`, `3`, `4`, and `6`.

```text
1 + 2 + 3 + 4 + 6 = 16
```

Since `16` is not equal to `12`, it is not a perfect number.

---

## [Problem 11: Count of Prime Numbers till N](Problem11.java)

**Problem Statement:**

You are given an integer **n**. You need to find the **number of prime numbers** in the range **[1, n]** (inclusive).

A **prime number** is a number greater than 1 that has no positive divisors other than **1** and **itself**.

Return the number of prime numbers in the range **[1, n]**.

### Example 1:

**Input:**

```text
n = 6
```

**Output:**

```text
3
```

**Explanation:**

The prime numbers in the range `[1, 6]` are:

```text
2, 3, 5
```

Therefore, the count of prime numbers is `3`.

### Example 2:

**Input:**

```text
n = 10
```

**Output:**

```text
4
```

**Explanation:**

The prime numbers in the range `[1, 10]` are:

```text
2, 3, 5, 7
```

Therefore, the count of prime numbers is `4`.

---

## [Problem 12: LCM of Two Numbers](Problem12.java)

**Problem Statement:**

You are given two integers **n1** and **n2**. You need to find the **Lowest Common Multiple (LCM)** of the two given numbers.

The **Lowest Common Multiple (LCM)** of two integers is the smallest positive integer that is divisible by both integers.

Return the **LCM** of the two numbers.

### Example 1:

**Input:**

```text
n1 = 4
n2 = 6
```

**Output:**

```text
12
```

**Explanation:**

The multiples of 4 are:

```text
4, 8, 12, 16, ...
```

The multiples of 6 are:

```text
6, 12, 18, 24, ...
```

The smallest positive number that is divisible by both 4 and 6 is **12**.

Therefore, the LCM is **12**.

### Example 2:

**Input:**

```text
n1 = 3
n2 = 5
```

**Output:**

```text
15
```

**Explanation:**

The multiples of 3 are:

```text
3, 6, 9, 12, 15, ...
```

The multiples of 5 are:

```text
5, 10, 15, 20, ...
```

The smallest positive number that is divisible by both 3 and 5 is **15**.

Therefore, the LCM is **15**.

---

