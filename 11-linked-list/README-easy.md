# 08 — Linked List [Easy]

## [Problem 01: Convert Array to Linked List](Problem01.java)

**Problem Statement:**  
Given an integer array `arr`, create a **singly linked list** containing the same elements in the same order.

Return the head of the linked list.

### Example 1

**Input:**  

```text
arr = [10, 20, 30, 40, 50]
```

**Output:**  

```text
10 → 20 → 30 → 40 → 50
```

**Explanation:**  

Each element of the array is converted into a node, preserving the original order.

### Example 2

**Input:**  

```text
arr = [5]
```

**Output:**  

```text
5
```

**Explanation:**  

The linked list contains only one node.

### Example 3

**Input:**  

```text
arr = []
```

**Output:**  

```text
null
```

**Explanation:**  

Since the array is empty, no linked list is created.