# 08 — Strings [Medium]

## [Problem 08: Sort Characters By Frequency](Problem08.java)

**Leetcode**  
https://leetcode.com/problems/sort-characters-by-frequency

**Problem Statement:**  
Given a string `s`, sort its characters in decreasing order based on their frequency. The **frequency** of a character is the number of times it appears in the string.

Return the sorted string. If multiple valid answers exist, return any one of them.

### Example 1

**Input:**  

```text
s = "tree"
```

**Output:**  

```text
"eert"
```

**Explanation:**  

The character `'e'` appears twice, while `'r'` and `'t'` each appear once. Therefore, `'e'` must appear before both `'r'` and `'t'`. `"eetr"` is also a valid answer.

### Example 2

**Input:**  

```text
s = "cccaaa"
```

**Output:**  

```text
"aaaccc"
```

**Explanation:**  

Both `'c'` and `'a'` appear three times, so either `"cccaaa"` or `"aaaccc"` is valid. Characters with the same frequency must remain grouped together, so `"cacaca"` is not valid.

### Example 3

**Input:**  

```text
s = "Aabb"
```

**Output:**  

```text
"bbAa"
```

**Explanation:**  

The character `'b'` appears twice, while `'A'` and `'a'` each appear once. `"bbaA"` is also a valid answer. Note that uppercase and lowercase letters are treated as different characters.

---

## [Problem 09: Maximum Nesting Depth of the Parentheses](Problem09.java)

**Leetcode**  
https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses

**Problem Statement:**  
Given a valid parentheses string `s`, return the **nesting depth** of `s`.

The **nesting depth** is the maximum number of nested parentheses at any point in the string.

### Example 1

**Input:**  

```text
s = "(1+(2*3)+((8)/4))+1"
```

**Output:**  

```text
3
```

**Explanation:**  

The digit `8` is enclosed within `3` nested pairs of parentheses.

### Example 2

**Input:**  

```text
s = "(1)+((2))+(((3)))"
```

**Output:**  

```text
3
```

**Explanation:**  

The digit `3` is enclosed within `3` nested pairs of parentheses.

### Example 3

**Input:**  

```text
s = "()(())((()()))"
```

**Output:**  

```text
3
```

**Explanation:**  

The maximum number of simultaneously open parentheses at any point in the string is `3`.

---

## [Problem 10: Roman to Integer](Problem10.java)

**Leetcode**  
https://leetcode.com/problems/roman-to-integer

**Problem Statement:**  
Roman numerals are represented by seven different symbols:

```text
I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000
```

Roman numerals are generally written from largest to smallest from left to right. However, in certain cases, a smaller numeral placed before a larger numeral indicates subtraction instead of addition. The valid subtractive combinations are:

```text
IV = 4
IX = 9
XL = 40
XC = 90
CD = 400
CM = 900
```

Given a Roman numeral string `s`, convert it to its corresponding integer.

### Example 1

**Input:**  

```text
s = "III"
```

**Output:**  

```text
3
```

**Explanation:**  

`III = 1 + 1 + 1 = 3`.

### Example 2

**Input:**  

```text
s = "LVIII"
```

**Output:**  

```text
58
```

**Explanation:**  

```text
L = 50
V = 5
III = 3
```

Therefore, `LVIII = 50 + 5 + 3 = 58`.

### Example 3

**Input:**  

```text
s = "MCMXCIV"
```

**Output:**  

```text
1994
```

**Explanation:**  

```text
M = 1000
CM = 900
XC = 90
IV = 4
```

Therefore, `MCMXCIV = 1000 + 900 + 90 + 4 = 1994`.