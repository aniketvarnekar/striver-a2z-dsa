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

---

## [Problem 04: Delete the Head of a Linked List](Problem04.java)

**Problem Statement:**  
Given the head of a singly linked list, delete the head node and return the new head of the linked list.

If the linked list is empty, return `null`.

### Example 1

**Input:**  

```text
10 → 20 → 30 → 40 → 50
```

**Output:**  

```text
20 → 30 → 40 → 50
```

**Explanation:**  

The first node (`10`) is removed, and the second node becomes the new head.

### Example 2

**Input:**  

```text
5
```

**Output:**  

```text
null
```

**Explanation:**  

The only node in the linked list is deleted, leaving an empty list.

### Example 3

**Input:**  

```text
null
```

**Output:**  

```text
null
```

**Explanation:**  

The linked list is already empty, so there is nothing to delete.

---

## [Problem 05: Delete the Tail of a Linked List](Problem05.java)

**Problem Statement:**  
Given the head of a singly linked list, delete the last node (tail) of the linked list and return the head of the modified list.

If the linked list is empty or contains only one node, return `null`.

### Example 1

**Input:**  

```text
10 → 20 → 30 → 40 → 50
```

**Output:**  

```text
10 → 20 → 30 → 40
```

**Explanation:**  

The last node (`50`) is removed from the linked list.

### Example 2

**Input:**  

```text
5
```

**Output:**  

```text
null
```

**Explanation:**  

The linked list contains only one node. After deleting it, the list becomes empty.

### Example 3

**Input:**  

```text
null
```

**Output:**  

```text
null
```

**Explanation:**  

The linked list is empty, so there is nothing to delete.

---

## [Problem 06: Delete the K-th Node of a Linked List](Problem06.java)

**Problem Statement:**  
Given the head of a singly linked list and an integer `k` (1-based index), delete the `k`-th node from the linked list and return the head of the modified list.

If `k` is greater than the length of the linked list, the list should remain unchanged.

### Example 1

**Input:**  

```text
Linked List: 10 → 20 → 30 → 40 → 50
k = 3
```

**Output:**  

```text
10 → 20 → 40 → 50
```

**Explanation:**  

The 3rd node (`30`) is removed from the linked list.

### Example 2

**Input:**  

```text
Linked List: 10 → 20 → 30 → 40 → 50
k = 1
```

**Output:**  

```text
20 → 30 → 40 → 50
```

**Explanation:**  

The head node is deleted, and the second node becomes the new head.

### Example 3

**Input:**  

```text
Linked List: 10 → 20 → 30
k = 5
```

**Output:**  

```text
10 → 20 → 30
```

**Explanation:**  

The linked list contains fewer than `5` nodes, so no deletion is performed.

---

## [Problem 07: Delete a Node by Value in a Linked List](Problem07.java)

**Problem Statement:**  
Given the head of a singly linked list and an integer `value`, delete the **first occurrence** of the node containing the given value and return the head of the modified linked list.

If the value does not exist in the linked list, return the original linked list unchanged.

### Example 1

**Input:**  

```text
Linked List: 10 → 20 → 30 → 40 → 50
value = 30
```

**Output:**  

```text
10 → 20 → 40 → 50
```

**Explanation:**  

The first node containing the value `30` is removed.

### Example 2

**Input:**  

```text
Linked List: 10 → 20 → 30 → 40 → 50
value = 10
```

**Output:**  

```text
20 → 30 → 40 → 50
```

**Explanation:**  

The head node contains the target value and is deleted.

### Example 3

**Input:**  

```text
Linked List: 10 → 20 → 30 → 40 → 50
value = 60
```

**Output:**  

```text
10 → 20 → 30 → 40 → 50
```

**Explanation:**  

The value `60` is not present in the linked list, so no node is deleted.

---

## [Problem 08: Insert a Node at the Head of a Linked List](Problem08.java)

**Problem Statement:**  
Given the head of a singly linked list and an integer `value`, insert a new node containing `value` at the beginning of the linked list.

Return the new head of the linked list.

### Example 1

**Input:**  

```text
Linked List: 10 → 20 → 30 → 40 → 50
value = 60
```

**Output:**  

```text
60 → 10 → 20 → 30 → 40 → 50
```

**Explanation:**  

A new node containing `60` is created. Its `next` pointer is set to the current head (`10`), and the new node becomes the head.

### Example 2

**Input:**  

```text
Linked List: 20 → 30
value = 10
```

**Output:**  

```text
10 → 20 → 30
```

### Example 3

**Input:**  

```text
Linked List: null
value = 10
```

**Output:**  

```text
10
```

**Explanation:**  

When the linked list is empty, the new node simply becomes the head.