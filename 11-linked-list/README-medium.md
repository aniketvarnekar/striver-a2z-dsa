# 08 — Linked List [Medium]

## [Problem 26: Find the Middle of a Linked List](Problem26.java)

**Leetcode**  
https://leetcode.com/problems/middle-of-the-linked-list

**Problem Statement:**

Given the head of a **singly linked list**, return the **middle node** of the linked list.

If the linked list contains two middle nodes, return the **second middle node**.

### Example 1

**Input:**

```text
arr = [1, 2, 3, 4, 5]
```

**Output:**

```text
3 → 4 → 5
```

**Explanation:**

The linked list contains 5 nodes. Node `3` is the middle node, so the node containing `3` and the remaining nodes after it are returned.

### Example 2

**Input:**

```text
arr = [1, 2, 3, 4, 5, 6]
```

**Output:**

```text
4 → 5 → 6
```

**Explanation:**

The linked list contains 6 nodes, so there are two middle nodes: `3` and `4`.

The second middle node, `4`, is returned.

### Example 3

**Input:**

```text
arr = [10]
```

**Output:**

```text
10
```

**Explanation:**

A linked list containing a single node has that node as its middle node.

### Example 4

**Input:**

```text
arr = [10, 20]
```

**Output:**

```text
20
```

**Explanation:**

There are two nodes, so `10` and `20` are the two middle candidates. The second middle node, `20`, is returned.

---

