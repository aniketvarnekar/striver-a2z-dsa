# 08 — Strings [Easy]

## [Problem 01: Remove Outermost Parentheses](Problem01.java)

**Leetcode**  
https://leetcode.com/problems/remove-outermost-parentheses

**Problem Statement:**  
A valid parentheses string is defined as:

- An empty string `""`
- `"(" + A + ")"`, where `A` is a valid parentheses string
- `A + B`, where `A` and `B` are valid parentheses strings

A valid parentheses string is called **primitive** if it is non-empty and cannot be split into two non-empty valid parentheses strings.

Given a valid parentheses string `s`, remove the outermost parentheses from every primitive substring and return the resulting string.

### Example 1

**Input:**  

```text
s = "(()())(())"
```

**Output:**  

```text
"()()()"
```

**Explanation:**  

The primitive decomposition is:

```text
(()()) + (())
```

After removing the outermost parentheses from each primitive:

```text
()() + ()
```

The final result is:

```text
"()()()"
```

### Example 2

**Input:**  

```text
s = "(()())(())(()(()))"
```

**Output:**  

```text
"()()()()(())"
```

**Explanation:**  

The primitive decomposition is:

```text
(()()) + (()) + (()(()))
```

After removing the outermost parentheses from each primitive:

```text
()() + () + ()(())
```

The final result is:

```text
"()()()()(())"
```

### Example 3

**Input:**  

```text
s = "()()"
```

**Output:**  

```text
""
```

**Explanation:**  

The primitive decomposition is:

```text
() + ()
```

After removing the outermost parentheses from each primitive:

```text
"" + ""
```

The final result is an empty string.

---

## [Problem 02: Reverse Words in a String](Problem02.java)

**Leetcode**  
https://leetcode.com/problems/reverse-words-in-a-string

**Problem Statement:**  
Given an input string `s`, reverse the order of the words.

A **word** is defined as a sequence of non-space characters. The words in `s` are separated by at least one space.

Return a string containing the words in reverse order, separated by a single space.

The input string may contain leading spaces, trailing spaces, or multiple spaces between words. The output should not contain any leading or trailing spaces, and there should be exactly one space between consecutive words.

### Example 1

**Input:**  

```text
s = "the sky is blue"
```

**Output:**  

```text
"blue is sky the"
```

### Example 2

**Input:**  

```text
s = "  hello world  "
```

**Output:**  

```text
"world hello"
```

**Explanation:**  

The leading and trailing spaces are removed from the output.

### Example 3

**Input:**  

```text
s = "a good   example"
```

**Output:**  

```text
"example good a"
```

**Explanation:**  

Multiple spaces between words are reduced to a single space in the reversed string.