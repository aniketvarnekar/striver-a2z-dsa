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