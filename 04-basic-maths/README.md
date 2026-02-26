# 04 — Basic Maths

## [Problem 1: Count digits in a number](Problem01.java)

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

## [Problem 2: Reverse digits of a number](Problem02.java)

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

## [Problem 3: Check if a number is Palindrome or Not](Problem03.java)

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

## [Problem 4: Find GCD of two numbers](Problem04.java)

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

## [Problem 5: Check if a number is Armstrong Number](Problem05.java)

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

## [Problem 6: Print all Divisors of a given Number](Problem06.java)

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

## [Problem 7: Check if a number is Prime](Problem07.java)

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