# 01 — Basics

---

## Table of Contents

1. [Why Does Complexity Matter?](#1-why-does-complexity-matter)
2. [What is Time Complexity?](#2-what-is-time-complexity)
3. [What is Space Complexity?](#3-what-is-space-complexity)
4. [Big O Notation — Keeping it Simple](#4-big-o-notation--keeping-it-simple)
5. [Common Complexity Classes](#5-common-complexity-classes)
   - O(1) — Constant Time
   - O(log n) — Logarithmic Time
   - O(n) — Linear Time
   - O(n log n) — Linearithmic Time
   - O(n²) — Quadratic Time
   - O(2ⁿ) — Exponential Time
6. [How to Analyze Your Own Code](#6-how-to-analyze-your-own-code)
7. [Space Complexity in Practice](#7-space-complexity-in-practice)
8. [Best, Worst, and Average Case](#8-best-worst-and-average-case)
9. [Quick Reference Cheat Sheet](#9-quick-reference-cheat-sheet)
10. [Tips for Interviews and Practice](#10-tips-for-interviews-and-practice)

---

## 1. Why Does Complexity Matter?

Imagine you're searching for a name in a phonebook with 1,000 entries vs. one with 10,000,000 entries. The *strategy* you use to search determines how fast you find the name — regardless of how powerful your computer is.

**Complexity analysis** helps us answer:
- How much **time** will my code take as input grows?
- How much **memory** will my code use as input grows?

This lets you compare solutions and pick the most efficient one — a skill that's critical in real-world software and technical interviews.

> **Key Insight:** We don't measure time in seconds (which varies by machine). We measure it in *number of operations* relative to input size.

---

## 2. What is Time Complexity?

**Time complexity** describes how the number of steps your program takes *scales* as the input size (`n`) grows.

**Example — Two ways to sum numbers from 1 to n:**

```java
// Approach 1: Loop through every number
// If n = 1,000,000, this runs 1,000,000 times
int sumWithLoop(int n) {
    int total = 0;
    for (int i = 1; i <= n; i++) {
        total += i;
    }
    return total;
}

// Approach 2: Use a formula — always just 1 step!
int sumWithFormula(int n) {
    return n * (n + 1) / 2;
}
```

Both give the same answer. But `sumWithLoop` does **more work** as `n` grows, while `sumWithFormula` always does the same single calculation. Time complexity helps us see this difference clearly.

---

## 3. What is Space Complexity?

**Space complexity** describes how much extra memory your program uses as the input grows.

```java
// Low space usage — only one extra variable regardless of n
int findMax(int[] arr) {
    int max = arr[0];          // Just one extra variable
    for (int num : arr) {
        if (num > max) max = num;
    }
    return max;
}

// Higher space usage — creates a new array the same size as input
int[] doubleAll(int[] arr) {
    int[] result = new int[arr.length];  // New array of size n
    for (int i = 0; i < arr.length; i++) {
        result[i] = arr[i] * 2;
    }
    return result;
}
```

The first function uses a constant amount of memory. The second creates a new array, so memory usage grows with the input.

---

## 4. Big O Notation — Keeping it Simple

**Big O notation** is the standard way to express complexity. It describes the *upper bound* — essentially the worst-case growth rate of your algorithm.

Think of it this way:
- `n` = the size of your input (e.g., length of an array)
- `O(...)` = "on the order of..."

**How to read it:**

| Notation | Read as | Meaning |
|---|---|---|
| `O(1)` | "Oh of one" | Constant — doesn't matter how big n is |
| `O(n)` | "Oh of n" | Linear — grows in direct proportion to n |
| `O(n²)` | "Oh of n squared" | Quadratic — grows very fast |

**Simplification rules you need to know:**

1. **Drop constants** — `O(2n)` becomes `O(n)`. We only care about the *shape* of growth.
2. **Drop smaller terms** — `O(n² + n)` becomes `O(n²)`. The dominant term wins.

```java
void example(int[] arr) {
    // Step 1: One loop → O(n)
    for (int x : arr) System.out.println(x);

    // Step 2: Another loop → O(n)
    for (int x : arr) System.out.println(x * 2);

    // Total: O(n) + O(n) = O(2n) → simplified to O(n)
}
```

---

## 5. Common Complexity Classes

From fastest to slowest growth:

```
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ)
```

---

### O(1) — Constant Time

The operation takes the **same amount of time regardless** of input size.

```java
// Accessing an array element by index — always one step
int getFirst(int[] arr) {
    return arr[0];  // Doesn't matter if arr has 5 or 5 million elements
}

// HashMap lookup — also O(1) on average
Map<String, Integer> scores = new HashMap<>();
scores.put("Alice", 95);
int aliceScore = scores.get("Alice");  // O(1) — direct lookup
```

> **Think of it as:** Opening a locker with a key — same effort no matter how many lockers exist.

---

### O(log n) — Logarithmic Time

The input is **repeatedly halved** with each step. Even for very large inputs, this stays fast.

```java
// Binary Search — classic O(log n)
// Requires a SORTED array
int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left <= right) {
        int mid = (left + right) / 2;

        if (arr[mid] == target)   return mid;   // Found it!
        else if (arr[mid] < target) left = mid + 1;  // Search right half
        else                        right = mid - 1; // Search left half
    }
    return -1; // Not found
}
```

| n (input size) | Steps needed |
|---|---|
| 8 | 3 |
| 1,024 | 10 |
| 1,048,576 | 20 |

> **Think of it as:** Opening a dictionary to the middle, deciding which half has your word, and repeating — you find any word in just a few flips.

---

### O(n) — Linear Time

Work done grows **directly proportional** to input size. If input doubles, work doubles.

```java
// Linear search — check every element
int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {  // Visits each element once
        if (arr[i] == target) return i;
    }
    return -1;
}

// Summing all elements
int sumArray(int[] arr) {
    int sum = 0;
    for (int num : arr) sum += num;  // n additions for n elements
    return sum;
}
```

> **Think of it as:** Reading every page of a book to find a sentence — more pages means more time, proportionally.

---

### O(n log n) — Linearithmic Time

More complex than linear, but far better than O(n²). Most efficient **sorting algorithms** land here.

```java
// Merge Sort — O(n log n)
void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);       // Sort left half
        mergeSort(arr, mid + 1, right);  // Sort right half
        merge(arr, left, mid, right);    // Merge the two halves
    }
}
```

Also: Java's built-in `Arrays.sort()` for objects uses a variant of merge sort — O(n log n).

> **Think of it as:** Sorting a deck of cards by splitting it in half repeatedly, then merging sorted piles.

---

### O(n²) — Quadratic Time

Work grows as the **square** of input size. Two nested loops over the same data often signals this. Gets slow quickly.

```java
// Bubble Sort — O(n²)
void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {           // Outer loop: n times
        for (int j = 0; j < n - 1; j++) {  // Inner loop: n times
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

// Finding all pairs in an array — O(n²)
void printAllPairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            System.out.println(arr[i] + ", " + arr[j]);
        }
    }
}
```

| n | Operations |
|---|---|
| 10 | 100 |
| 100 | 10,000 |
| 1,000 | 1,000,000 |

> **Think of it as:** Comparing every student's grade with every other student's grade — it gets very tedious very quickly.

---

### O(2ⁿ) — Exponential Time

Work **doubles** with every single addition to the input. Only feasible for very small inputs.

```java
// Naive recursive Fibonacci — O(2ⁿ)
// Each call spawns two more calls — grows like a tree
int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);  // Two recursive calls!
}
```

For `fibonacci(50)`, this makes over **1 trillion** calls. Not practical.

> **Think of it as:** A rumour that every person tells two friends, who each tell two more — after 30 steps, over a billion people know.

> **Fix:** Use **memoization** (caching results) to reduce this to O(n).
```java
// Improved Fibonacci with memoization — O(n)
int fibonacci(int n, int[] memo) {
    if (n <= 1) return n;
    if (memo[n] != 0) return memo[n];  // Return cached result
    memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
    return memo[n];
}
```

---

## 6. How to Analyze Your Own Code

Follow these steps when looking at any piece of code:

### Step 1 — Identify loops

```java
// One loop → O(n)
for (int i = 0; i < n; i++) { ... }

// Two separate loops → O(n) + O(n) = O(n)
for (int i = 0; i < n; i++) { ... }
for (int j = 0; j < n; j++) { ... }

// Nested loops → O(n) × O(n) = O(n²)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) { ... }
}
```

### Step 2 — Look at what changes each iteration

```java
// Halving i each time → O(log n)
for (int i = n; i > 1; i = i / 2) {
    System.out.println(i);
}
```

### Step 3 — Check recursive calls

Each recursive call adds a level. Count how many calls are made total.

```java
// One call per level, n levels → O(n)
void countDown(int n) {
    if (n == 0) return;
    System.out.println(n);
    countDown(n - 1);  // One recursive call
}

// Two calls per level → O(2ⁿ)
void twoWays(int n) {
    if (n == 0) return;
    twoWays(n - 1);  // Two recursive calls
    twoWays(n - 1);
}
```

### Step 4 — Keep only the dominant term

```java
void combined(int[] arr) {
    // O(1) — constant
    System.out.println("Start");

    // O(n) — linear
    for (int x : arr) System.out.println(x);

    // O(n²) — quadratic
    for (int i = 0; i < arr.length; i++)
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[i] + arr[j]);

    // Total: O(1) + O(n) + O(n²) → O(n²)
}
```

---

## 7. Space Complexity in Practice

Space complexity counts:
- **Input space** (usually not counted — it's given)
- **Auxiliary space** — the *extra* memory your algorithm creates

### O(1) Space — Constant

```java
// Reverse an array in-place — only a few extra variables
void reverseInPlace(int[] arr) {
    int left = 0, right = arr.length - 1;  // Just two variables
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++; right--;
    }
}
```

### O(n) Space — Linear

```java
// Create a copy of the array — memory grows with input
int[] copyArray(int[] arr) {
    int[] copy = new int[arr.length];  // New array of size n
    for (int i = 0; i < arr.length; i++) copy[i] = arr[i];
    return copy;
}
```

### Recursion and Stack Space

Every recursive call uses a small amount of **stack memory**. Deep recursion can use a lot of space.

```java
// This recurses n times → O(n) space on the call stack
int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
```

> Deep recursion can cause a **StackOverflowError** in Java if `n` is very large. Iterative solutions avoid this.

---

## 8. Best, Worst, and Average Case

The same algorithm can behave differently depending on the input.

```java
// Linear Search
int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) return i;
    }
    return -1;
}
```

| Case | Scenario | Complexity |
|---|---|---|
| **Best Case** | Target is the first element | O(1) |
| **Average Case** | Target is somewhere in the middle | O(n/2) → O(n) |
| **Worst Case** | Target is last or not present | O(n) |

> **Big O typically describes the worst case.** This is what you'll be asked about most often in interviews and discussions.

---

## 9. Quick Reference Cheat Sheet

### Complexity Growth Comparison

| Operations (n) | O(1) | O(log n) | O(n) | O(n log n) | O(n²) | O(2ⁿ) |
|---|---|---|---|---|---|---|
| 8 | 1 | 3 | 8 | 24 | 64 | 256 |
| 64 | 1 | 6 | 64 | 384 | 4,096 | Huge |
| 1,024 | 1 | 10 | 1,024 | 10,240 | 1,048,576 | Infeasible |

### Common Algorithms and Their Complexities

| Algorithm | Time Complexity | Space Complexity |
|---|---|---|
| Array access by index | O(1) | O(1) |
| HashMap get/put (avg) | O(1) | O(n) |
| Binary Search | O(log n) | O(1) |
| Linear Search | O(n) | O(1) |
| Merge Sort | O(n log n) | O(n) |
| Quick Sort (avg) | O(n log n) | O(log n) |
| Bubble / Insertion Sort | O(n²) | O(1) |
| Naive Fibonacci | O(2ⁿ) | O(n) |

---

## 10. Tips for Interviews and Practice

1. **Always explain your reasoning.** Don't just state `O(n)` — walk through *why*.

2. **Count loops first.** One loop = O(n). Nested loops = O(n²). This covers 80% of cases.

3. **Watch for hidden loops.** Methods like `String.contains()`, `Collections.sort()`, or `Arrays.copyOf()` have costs too.

4. **Prefer O(n) over O(n²)** when possible — even if the O(n) solution uses a HashMap for extra space.

5. **Mention trade-offs.** "This is O(n log n) time but O(n) space. We could reduce space to O(1) with an in-place sort if memory is tight."

6. **Practice on small examples.** Trace through code with `n = 4` or `n = 5` to count actual steps.

7. **Don't over-optimise early.** Write a working brute-force first, then identify the bottleneck and improve it.
