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

---

## [Problem 03: Largest Odd Number in a String](Problem03.java)

**Leetcode**  
https://leetcode.com/problems/largest-odd-number-in-string

**Problem Statement:**  
Given a string `s` representing a large integer, return the largest-valued odd integer (as a string) that is a substring of `s`.

The returned number should **not contain leading zeros**, although the input string may contain leading zeros.

If no odd-valued substring exists, return an empty string `""`.

### Example 1

**Input:**  

```text
s = "5347"
```

**Output:**  

```text
"5347"
```

**Explanation:**  

The odd-valued substrings include:

```text
5, 3, 53, 347, 5347
```

The largest odd number without leading zeros is:

```text
5347
```

### Example 2

**Input:**  

```text
s = "0214638"
```

**Output:**  

```text
"21463"
```

**Explanation:**  

The odd-valued substrings include:

```text
1, 3, 21, 63, 463, 1463, 21463
```

Substrings starting with `0` are not considered valid because the result cannot contain leading zeros.

Therefore, the largest valid odd number is:

```text
21463
```

---

## [Problem 4: Longest Common Prefix](Problem04.java)

**Leetcode**  
https://leetcode.com/problems/longest-common-prefix

**Problem Statement:**  
Given an array of strings `strs`, return the longest common prefix shared among all the strings.

If there is no common prefix, return an empty string `""`.

### Example 1

**Input:**  

```text
strs = ["flower", "flow", "flight"]
```

**Output:**  

```text
"fl"
```

**Explanation:**  

The longest prefix common to all the strings is `"fl"`.

### Example 2

**Input:**  

```text
strs = ["dog", "racecar", "car"]
```

**Output:**  

```text
""
```

**Explanation:**  

There is no common prefix shared by all the strings, so the answer is an empty string.

---

## [Problem 05: Isomorphic Strings](Problem05.java)

**Leetcode**  
https://leetcode.com/problems/isomorphic-strings

**Problem Statement:**  
Given two strings `s` and `t`, determine whether they are **isomorphic**.

Two strings are isomorphic if the characters in `s` can be replaced to obtain `t`.

- Every occurrence of a character must be replaced with the same character.
- No two different characters may map to the same character.
- A character may map to itself.

Return `true` if the strings are isomorphic; otherwise, return `false`.

### Example 1

**Input:**  

```text
s = "egg"
t = "add"
```

**Output:**  

```text
true
```

**Explanation:**  

A valid mapping is:

```text
e → a
g → d
```

The mapping is consistent and one-to-one.

### Example 2

**Input:**  

```text
s = "f11"
t = "b23"
```

**Output:**  

```text
false
```

**Explanation:**  

The character `'1'` would need to map to both `'2'` and `'3'`, which is not allowed.

### Example 3

**Input:**  

```text
s = "paper"
t = "title"
```

**Output:**  

```text
true
```

**Explanation:**  

A valid mapping is:

```text
p → t
a → i
e → l
r → e
```

The mapping is one-to-one and consistent.

---

## [Problem 06: Rotate String](Problem06.java)

**Leetcode**  
https://leetcode.com/problems/rotate-string

**Problem Statement:**  
Given two strings `s` and `goal`, return `true` if and only if `s` can become `goal` after performing any number of left shifts on `s`.

A **left shift** moves the leftmost character of the string to the rightmost position.

### Example 1

**Input:**  

```text
s = "abcde"
goal = "cdeab"
```

**Output:**  

```text
true
```

**Explanation:**  

Perform two left shifts:

```text
abcde
→ bcdea
→ cdeab
```

The string becomes equal to `goal`.

### Example 2

**Input:**  

```text
s = "abcde"
goal = "abced"
```

**Output:**  

```text
false
```

**Explanation:**  

No sequence of left shifts can transform `s` into `goal`.

---

## [Problem 07: Valid Anagram](Problem07.java)

**Leetcode**  
https://leetcode.com/problems/valid-anagram

**Problem Statement:**  
Given two strings `s` and `t`, return `true` if `t` is an **anagram** of `s`; otherwise, return `false`.

An **anagram** is a word or phrase formed by rearranging the letters of another word, using all the original characters exactly once.

### Example 1

**Input:**  

```text
s = "anagram"
t = "nagaram"
```

**Output:**  

```text
true
```

**Explanation:**  

Both strings contain the same characters with the same frequencies, so `t` is an anagram of `s`.

### Example 2

**Input:**  

```text
s = "rat"
t = "car"
```

**Output:**  

```text
false
```

**Explanation:**  

The two strings do not contain the same set of characters, so `t` is not an anagram of `s`.