# 08 — Strings [Easy]

## [Problem 01: Remove Outermost Parentheses](Problem01.java)

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