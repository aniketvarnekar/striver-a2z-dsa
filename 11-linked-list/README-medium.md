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

## [Problem 27: Detect Cycle in a Linked List](Problem27.java)

**Leetcode**  
https://leetcode.com/problems/linked-list-cycle

**Problem Statement:**

Given the head of a **singly linked list**, determine whether the linked list contains a **cycle**.

A cycle exists if, by continuously following the `next` pointer, a node is reached again.

Use the **Floyd's Cycle Detection Algorithm**, also known as the **slow and fast pointer technique**, to detect the cycle.

Return `true` if the linked list contains a cycle. Otherwise, return `false`.

### Example 1

**Input:**

```text
head = [3, 2, 0, -4]
pos = 1
```

**Output:**

```text
true
```

**Explanation:**

The last node points back to the node at index `1`, creating a cycle:

```text
3 → 2 → 0 → -4
    ↑         ↓
    └─────────┘
```

Since a node can be reached again by following the `next` pointers, the linked list contains a cycle.

### Example 2

**Input:**

```text
head = [1, 2]
pos = 0
```

**Output:**

```text
true
```

**Explanation:**

The last node points back to the first node, creating a cycle:

```text
1 → 2
↑   ↓
└───┘
```

Therefore, the linked list contains a cycle.

### Example 3

**Input:**

```text
head = [1]
pos = -1
```

**Output:**

```text
false
```

**Explanation:**

The linked list contains only one node, and its `next` pointer is `null`. Therefore, there is no cycle.

### Example 4

**Input:**

```text
head = [10, 20, 30, 40, 50]
pos = -1
```

**Output:**

```text
false
```

**Explanation:**

The linked list terminates at the last node because its `next` pointer is `null`. No node can be reached again, so there is no cycle.

---

## [Problem 28: Find the Node Where Cycle Begins in a Linked List](Problem28.java)

**Problem Statement:**

Given the head of a **singly linked list**, determine whether the linked list contains a cycle.

If a cycle exists, return the **node where the cycle begins**.

If there is no cycle, return `null`.

The linked list must **not be modified**.

The integer `pos` represents the **0-based index** of the node that the last node points to. If `pos = -1`, the linked list does not contain a cycle.

Use **Floyd's Cycle Detection Algorithm** (slow and fast pointer technique) to detect the cycle and find its starting node.

### Example 1

**Input:**

```text
head = [3, 2, 0, -4]
pos = 1
```

**Linked List:**

```text
3 → 2 → 0 → -4
    ↑         ↓
    └─────────┘
```

**Output:**

```text
Node with value 2
```

**Explanation:**

The node at index `1` contains `2`.

The last node `-4` points back to the node containing `2`, creating the following cycle:

```text
2 → 0 → -4
↑         ↓
└─────────┘
```

Therefore, the node containing `2` is the beginning of the cycle.

### Example 2

**Input:**

```text
head = [1, 2]
pos = 0
```

**Linked List:**

```text
1 → 2
↑   ↓
└───┘
```

**Output:**

```text
Node with value 1
```

**Explanation:**

The node at index `0` contains `1`.

The last node `2` points back to the head node `1`, creating a cycle:

```text
1 → 2
↑   ↓
└───┘
```

Therefore, the node containing `1` is the beginning of the cycle.

### Example 3

**Input:**

```text
head = [1]
pos = -1
```

**Linked List:**

```text
1 → null
```

**Output:**

```text
null
```

**Explanation:**

`pos = -1` indicates that the last node does not point to any previous node.

Therefore, the linked list does not contain a cycle.

### Example 4

**Input:**

```text
head = [10, 20, 30, 40, 50]
pos = 2
```

**Linked List:**

```text
10 → 20 → 30 → 40 → 50
          ↑          ↓
          └──────────┘
```

**Output:**

```text
Node with value 30
```

**Explanation:**

The node at index `2` contains `30`.

The last node `50` points back to `30`, creating the cycle:

```text
30 → 40 → 50
↑         ↓
└─────────┘
```

Therefore, the node containing `30` is the beginning of the cycle.

---

