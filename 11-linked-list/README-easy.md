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

---

## [Problem 02: Find Length of a Linked List](Problem02.java)

**Problem Statement:**  
Given the head of a singly linked list, return the number of nodes present in the linked list.

### Example 1

**Input:**  

```text
10 → 20 → 30 → 40 → 50
```

**Output:**  

```text
5
```

**Explanation:**  

The linked list contains `5` nodes.

### Example 2

**Input:**  

```text
1 → 2 → 3
```

**Output:**  

```text
3
```

**Explanation:**  

The linked list contains `3` nodes.

### Example 3

**Input:**  

```text
null
```

**Output:**  

```text
0
```

**Explanation:**  

The linked list is empty, so its length is `0`.

---

## [Problem 03: Search an Element in a Linked List](Problem03.java)

**Problem Statement:**  
Given the head of a singly linked list and an integer `target`, determine whether the target value exists in the linked list.

Return `true` if the target is found; otherwise, return `false`.

### Example 1

**Input:**  

```text
Linked List: 10 → 20 → 30 → 40 → 50
target = 40
```

**Output:**  

```text
true
```

**Explanation:**  

The value `40` is present in the linked list.

### Example 2

**Input:**  

```text
Linked List: 10 → 20 → 30 → 40 → 50
target = 25
```

**Output:**  

```text
false
```

**Explanation:**  

The value `25` is not present in the linked list.

### Example 3

**Input:**  

```text
Linked List: null
target = 10
```

**Output:**  

```text
false
```

**Explanation:**  

The linked list is empty, so the target cannot be found.