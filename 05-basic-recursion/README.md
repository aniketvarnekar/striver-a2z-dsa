# 05 — Basic Recursion

## [Problem 1: Print Name N Times Using Recursion](Problem01.java)

**Problem Statement:**  
Given an integer `N`, write a program to print your name `N` times using recursion.

### Example 1  
**Input:** `N = 3`  
**Output:**  
`Aniket Aniket Aniket`  
**Explanation:**  
The name is printed 3 times.

### Example 2  
**Input:** `N = 1`  
**Output:**  
`Aniket`  
**Explanation:**  
The name is printed once.

---

## [Problem 2: Print 1 to N Using Recursion](Problem02.java)

**Problem Statement:**  
Given an integer `N`, write a program to print numbers from `1` to `N` using recursion.

### Example 1  
**Input:** `N = 4`  
**Output:**  
`1 2 3 4`  
**Explanation:**  
All the numbers from 1 to 4 are printed.

### Example 2  
**Input:** `N = 1`  
**Output:**  
`1`  
**Explanation:**  
This is the base case.

---

## [Problem 3: Print N to 1 Using Recursion](Problem03.java)

**Problem Statement:**  
Given an integer `N`, write a program to print numbers from `N` to `1` using recursion.

### Example 1  
**Input:** `N = 4`  
**Output:**  
`4 3 2 1`  
**Explanation:**  
All the numbers from 4 to 1 are printed.

### Example 2  
**Input:** `N = 1`  
**Output:**  
`1`  
**Explanation:**  
This is the base case.

---

## [Problem 4: Sum of First N Natural Numbers](Problem04.java)

**Problem Statement:**  
Given an integer `N`, find the sum of the first `N` natural numbers.

### Example 1  
**Input:** `N = 5`  
**Output:**  
`15`  
**Explanation:**  
1 + 2 + 3 + 4 + 5 = 15

### Example 2  
**Input:** `N = 6`  
**Output:**  
`21`  
**Explanation:**  
1 + 2 + 3 + 4 + 5 + 6 = 21

---

## [Problem 5: Factorial of a Number (Iterative and Recursive)](Problem05.java)

**Problem Statement:**  
Given a number `X`, print its factorial.

To obtain the factorial of a number, it must be multiplied by all the whole numbers preceding it.

More precisely:

`X! = X × (X - 1) × (X - 2) × ... × 1`

**Note:**  
`X` is always a positive number.

### Example 1  

**Input:**  
`X = 5`  
**Output:**  
`120`  
**Explanation:**  
5! = 5 × 4 × 3 × 2 × 1 = 120

### Example 2  

**Input:**  
`X = 3`  
**Output:**  
`6`  
**Explanation:**  
3! = 3 × 2 × 1 = 6

---

## [Problem 6: Reverse a Given Array](Problem06.java)

**Problem Statement:**  
You are given an array. The task is to reverse the array and print it.

### Example 1  

**Input:**  
`N = 5`  
`arr[] = {5, 4, 3, 2, 1}`  
**Output:**  
`{1, 2, 3, 4, 5}`  
**Explanation:**  
Since the order of elements gets reversed, the first element occupies the last position, the second element occupies the second last position, and so on.

### Example 2  

**Input:**  
`N = 4`  
`arr[] = {10, 20, 30, 40}`  
**Output:**  
`{40, 30, 20, 10}`  
**Explanation:**  
Since the order of elements gets reversed, the first element occupies the last position, the second element occupies the second last position, and so on.

---

## [Problem 7: Check if a Given String is Palindrome](Problem07.java)

**Problem Statement:**  
Given a string, check whether it is a palindrome.

A string is said to be a palindrome if the reverse of the string is the same as the original string.

### Example 1  

**Input:**  
`Str = "ABCDCBA"`  
**Output:**  
`Palindrome`  
**Explanation:**  
When reversed, the string remains the same.

### Example 2  

**Input:**  
`Str = "TAKE U FORWARD"`  
**Output:**  
`Not Palindrome`  
**Explanation:**  
When reversed, the string is different from the original string.

---

## [Problem 8: Print Fibonacci Series up to Nth Term](Problem08.java)

**Problem Statement:**  
Given an integer `N`, print the Fibonacci series up to the `Nth` term (0-based indexing).

The Fibonacci sequence is defined as:

- F(0) = 0  
- F(1) = 1  
- F(n) = F(n - 1) + F(n - 2)

### Example 1  

**Input:**  
`N = 5`  
**Output:**  
`0 1 1 2 3 5`  
**Explanation:**  
0 1 1 2 3 5 is the Fibonacci series up to the 5th term (0-based indexing).

### Example 2  

**Input:**  
`N = 6`  
**Output:**  
`0 1 1 2 3 5 8`  
**Explanation:**  
0 1 1 2 3 5 8 is the Fibonacci series up to the 6th term (0-based indexing).