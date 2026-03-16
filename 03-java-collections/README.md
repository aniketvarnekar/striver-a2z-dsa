# 03 — Java Collections Framework

---

## Table of Contents

1. [What Is the Collections Framework?](#1-what-is-the-collections-framework)
2. [The Core Interfaces](#2-the-core-interfaces)
3. [List — Ordered and Allows Duplicates](#3-list--ordered-and-allows-duplicates)
4. [Set — Unique Elements Only](#4-set--unique-elements-only)
5. [Queue and Deque — FIFO and Double-Ended](#5-queue-and-deque--fifo-and-double-ended)
6. [Map — Key-Value Pairs](#6-map--key-value-pairs)
7. [Iterating Collections](#7-iterating-collections)
8. [Sorting and Ordering](#8-sorting-and-ordering)
9. [The Collections Utility Class](#9-the-collections-utility-class)
10. [Fail-Fast vs Fail-Safe Iterators](#10-fail-fast-vs-fail-safe-iterators)
11. [Thread Safety in Collections](#11-thread-safety-in-collections)
12. [Choosing the Right Collection](#12-choosing-the-right-collection)
13. [Common Interview Questions and Answers](#13-common-interview-questions-and-answers)
14. [Common Pitfalls](#14-common-pitfalls)
15. [Quick Reference Cheat Sheet](#15-quick-reference-cheat-sheet)

---

## 1. What Is the Collections Framework?

The **Java Collections Framework (JCF)** is a unified architecture for storing, retrieving, and manipulating groups of objects. It lives in the `java.util` package and provides three things:

- **Interfaces** — Define what a collection can do (e.g., `List`, `Set`, `Map`).
- **Implementations** — Concrete classes that do it (e.g., `ArrayList`, `HashMap`).
- **Algorithms** — Utility methods for sorting, searching, and more (via the `Collections` class).

**Why it matters in interviews:**
Interviewers expect you to know not just how to use collections, but *why* you pick one over another. That reasoning — backed by an understanding of data structures and Big O complexity — is what separates a strong candidate from a weak one.

```java
// Without JCF — manual, fixed-size, error-prone
String[] names = new String[10];
names[0] = "Alice";

// With JCF — dynamic, type-safe, and expressive
List<String> names = new ArrayList<>();
names.add("Alice");
```

---

## 2. The Core Interfaces

Understanding the hierarchy is the single most important foundation to build before an interview.

```
Iterable
  └── Collection
        ├── List        → Ordered, indexed, allows duplicates
        ├── Set         → No duplicates allowed
        └── Queue       → FIFO ordering
              └── Deque → Double-ended queue (also used as a stack)

Map                     → Key-value pairs (does NOT extend Collection)
```

All interfaces define a *contract* — what operations are available. The implementing classes decide *how* those operations work internally, which determines their performance characteristics.

**Key interview point:** `Map` is not a subtype of `Collection`. Many candidates assume it is. They share similar utility methods (like iteration via `entrySet()`), but `Map` stands on its own in the hierarchy.

---

## 3. List — Ordered and Allows Duplicates

A `List` maintains **insertion order** and permits **duplicate elements**. Elements are accessible by index (zero-based).

### ArrayList

Backed by a resizable array. The default choice for most use cases.

```java
import java.util.ArrayList;
import java.util.List;

List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple");       // Duplicates are allowed
fruits.add(1, "Mango");    // Insert at index 1

System.out.println(fruits);          // [Apple, Mango, Banana, Apple]
System.out.println(fruits.get(2));   // Banana
fruits.remove("Mango");
System.out.println(fruits.size());   // 3
```

**Time complexity:**
| Operation | Complexity |
|---|---|
| `get(index)` | O(1) |
| `add()` at end | O(1) amortized |
| `add(index, element)` | O(n) — elements shift |
| `remove(index)` | O(n) — elements shift |
| `contains()` | O(n) — linear scan |

**How `ArrayList` grows:** It starts with an initial capacity of 10. When full, it allocates a new array at approximately 1.5x the current size and copies all elements over. This is why repeated additions are O(1) *amortized* — occasional resizes are expensive, but rare.

### LinkedList

Backed by a doubly-linked list. Each element (node) holds a value and pointers to the previous and next nodes.

```java
import java.util.LinkedList;

LinkedList<String> tasks = new LinkedList<>();
tasks.add("Write tests");
tasks.addFirst("Plan sprint");   // Add to front
tasks.addLast("Deploy");         // Add to back

System.out.println(tasks.getFirst()); // Plan sprint
System.out.println(tasks.getLast());  // Deploy
tasks.removeFirst();
```

**Time complexity:**
| Operation | Complexity |
|---|---|
| `get(index)` | O(n) — must traverse from head |
| `addFirst` / `addLast` | O(1) |
| `removeFirst` / `removeLast` | O(1) |
| `add(index, element)` | O(n) — traversal to position |

### ArrayList vs LinkedList — The Interview Question

| Criteria | ArrayList | LinkedList |
|---|---|---|
| Backing structure | Dynamic array | Doubly-linked list |
| Random access | O(1) | O(n) |
| Insert/delete at end | O(1) amortized | O(1) |
| Insert/delete at middle | O(n) | O(n) traversal + O(1) pointer update |
| Memory overhead | Low | Higher (two pointers per node) |
| Cache performance | Better (contiguous memory) | Worse (scattered in heap) |

**Verdict:** Use `ArrayList` by default. Use `LinkedList` only when you have frequent insertions and deletions at the head of the list, and do not need random access.

---

## 4. Set — Unique Elements Only

A `Set` enforces **uniqueness** — adding a duplicate element has no effect and returns `false`.

### HashSet

Backed by a `HashMap` internally. No guaranteed iteration order. The fastest `Set` for add, remove, and lookup.

```java
import java.util.HashSet;
import java.util.Set;

Set<String> countries = new HashSet<>();
countries.add("India");
countries.add("Brazil");
boolean added = countries.add("India");   // Duplicate — ignored

System.out.println(added);                    // false
System.out.println(countries.size());         // 2
System.out.println(countries.contains("India")); // true
```

**Time complexity:** `add`, `remove`, `contains` — O(1) average, O(n) worst case (hash collisions).

**How duplicates are detected:** `HashSet` calls `hashCode()` to find the bucket, then `equals()` to confirm identity. This is why overriding both methods on custom objects is critical — failing to do so means two logically identical objects will be treated as distinct.

### LinkedHashSet

Extends `HashSet` and maintains a linked list of entries to preserve **insertion order**.

```java
import java.util.LinkedHashSet;

Set<String> visited = new LinkedHashSet<>();
visited.add("Paris");
visited.add("Tokyo");
visited.add("Paris");   // Duplicate — ignored

System.out.println(visited); // [Paris, Tokyo]
```

**Use when:** You need uniqueness AND predictable iteration order.

### TreeSet

Backed by a Red-Black tree. Stores elements in **sorted natural order** (or by a provided `Comparator`).

```java
import java.util.TreeSet;

Set<Integer> scores = new TreeSet<>();
scores.add(50);
scores.add(20);
scores.add(80);
scores.add(20);   // Duplicate — ignored

System.out.println(scores);          // [20, 50, 80]
System.out.println(scores.first());  // 20
System.out.println(scores.last());   // 80
```

**Time complexity:** `add`, `remove`, `contains` — O(log n).

**Use when:** You need uniqueness AND elements in sorted order, or you need range-based operations.

### Set Comparison Summary

| | HashSet | LinkedHashSet | TreeSet |
|---|---|---|---|
| Order | None | Insertion | Sorted |
| Null allowed | Yes (one) | Yes (one) | No (throws NPE) |
| Performance | O(1) avg | O(1) avg | O(log n) |
| Backed by | HashMap | LinkedHashMap | TreeMap |

---

## 5. Queue and Deque — FIFO and Double-Ended

### Queue — First-In, First-Out

A `Queue` processes elements in FIFO order — the first element added is the first one removed.

```java
import java.util.LinkedList;
import java.util.Queue;

Queue<String> queue = new LinkedList<>();
queue.offer("Customer 1");
queue.offer("Customer 2");
queue.offer("Customer 3");

System.out.println(queue.peek());  // Customer 1 — inspect, do not remove
System.out.println(queue.poll());  // Customer 1 — inspect and remove
System.out.println(queue.size());  // 2
```

**Method pairs to know:**

| Action | Throws exception | Returns null/false |
|---|---|---|
| Insert | `add(e)` | `offer(e)` |
| Remove head | `remove()` | `poll()` |
| Inspect head | `element()` | `peek()` |

Prefer the null-returning variants (`offer`, `poll`, `peek`) in production code — they handle empty queues gracefully.

### ArrayDeque — Double-Ended Queue and Stack

`ArrayDeque` supports insertion and removal from both ends. It is backed by a resizable circular array and is faster than `LinkedList` for both queue and stack operations. It is also the **recommended replacement for the legacy `Stack` class**.

```java
import java.util.ArrayDeque;
import java.util.Deque;

// As a Deque
Deque<String> deque = new ArrayDeque<>();
deque.addFirst("Middle");
deque.addFirst("Front");
deque.addLast("Back");
System.out.println(deque); // [Front, Middle, Back]

// As a Stack (LIFO)
Deque<String> stack = new ArrayDeque<>();
stack.push("A");
stack.push("B");
stack.push("C");
System.out.println(stack.pop()); // C
System.out.println(stack.pop()); // B
```

**Interview point:** Why prefer `ArrayDeque` over `Stack`? The `Stack` class extends `Vector`, which is synchronized (thread-safe), making every operation slower even in single-threaded contexts. `ArrayDeque` has no synchronization overhead and is generally faster.

### PriorityQueue

Elements are dequeued in **priority order** (smallest first by default). Does not guarantee FIFO for elements of equal priority.

```java
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(30);
pq.offer(10);
pq.offer(20);

System.out.println(pq.poll()); // 10
System.out.println(pq.poll()); // 20
System.out.println(pq.poll()); // 30
```

Internally backed by a **min-heap**. To create a max-heap, pass `Comparator.reverseOrder()`.

```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
maxHeap.offer(30);
maxHeap.offer(10);
maxHeap.offer(20);
System.out.println(maxHeap.poll()); // 30
```

**Time complexity:** `offer` and `poll` — O(log n). `peek` — O(1).

---

## 6. Map — Key-Value Pairs

A `Map` stores **key-value associations**. Each key is unique; duplicate keys overwrite the existing value. Values may repeat.

### HashMap

The most widely used map. No guaranteed order. O(1) average for `get` and `put`.

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> scores = new HashMap<>();
scores.put("Alice", 95);
scores.put("Bob", 82);
scores.put("Alice", 99);  // Overwrites 95 with 99

System.out.println(scores.get("Alice"));              // 99
System.out.println(scores.getOrDefault("Eve", 0));    // 0 — key absent
System.out.println(scores.containsKey("Bob"));        // true
System.out.println(scores.containsValue(82));         // true
scores.remove("Bob");

// Useful modern methods
scores.putIfAbsent("Charlie", 88);
scores.computeIfAbsent("Diana", k -> 75);
```

**How HashMap works internally (a key interview topic):**

1. The key's `hashCode()` is computed and mapped to a bucket index.
2. If no entry exists at that bucket, the key-value pair is stored there.
3. If a collision occurs, entries are stored in a linked list at that bucket.
4. In Java 8+, when a bucket's linked list exceeds 8 entries, it is converted to a Red-Black tree for O(log n) worst-case performance.
5. When the load factor (default 0.75) is exceeded, the map rehashes — it roughly doubles in capacity and redistributes all entries.

**Interview point:** What happens if two keys have the same `hashCode` but different `equals`? They go into the same bucket and form a chain (collision). What if `equals` says they are the same but `hashCode` differs? The map stores them as two separate entries — violating the uniqueness contract. This is why `hashCode` and `equals` must be consistent.

### LinkedHashMap

Extends `HashMap` and maintains a doubly-linked list of entries to preserve **insertion order**.

```java
import java.util.LinkedHashMap;

Map<String, String> capitals = new LinkedHashMap<>();
capitals.put("India", "New Delhi");
capitals.put("France", "Paris");
capitals.put("Japan", "Tokyo");

capitals.forEach((country, capital) ->
    System.out.println(country + " -> " + capital));
// India -> New Delhi
// France -> Paris
// Japan -> Tokyo
```

### TreeMap

Backed by a Red-Black tree. Keeps keys in **sorted natural order** or by a provided `Comparator`. Implements `NavigableMap`.

```java
import java.util.TreeMap;

Map<String, Integer> wordCount = new TreeMap<>();
wordCount.put("banana", 3);
wordCount.put("apple", 7);
wordCount.put("cherry", 1);

System.out.println(wordCount);
// {apple=7, banana=3, cherry=1}

System.out.println(wordCount.firstKey());         // apple
System.out.println(wordCount.lastKey());          // cherry
System.out.println(wordCount.headMap("cherry"));  // {apple=7, banana=3}
```

**Time complexity:** `get`, `put`, `remove` — O(log n).

### Map Comparison Summary

| | HashMap | LinkedHashMap | TreeMap |
|---|---|---|---|
| Key order | None | Insertion | Sorted |
| Null keys | One allowed | One allowed | Not allowed |
| Performance (get/put) | O(1) avg | O(1) avg | O(log n) |
| Implements | Map | Map | NavigableMap, SortedMap |

---

## 7. Iterating Collections

### Enhanced For-Loop

The simplest and most readable approach.

```java
List<String> colors = List.of("Red", "Green", "Blue");

for (String color : colors) {
    System.out.println(color);
}
```

### forEach with Lambda

Clean and functional. Does not allow `break` or `continue`.

```java
colors.forEach(color -> System.out.println(color));

// Method reference equivalent
colors.forEach(System.out::println);
```

### Iterator — Safe Removal During Iteration

Never call `list.remove()` inside a regular for-each loop — it throws `ConcurrentModificationException`. Use an explicit `Iterator` instead.

```java
List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
Iterator<Integer> it = numbers.iterator();

while (it.hasNext()) {
    int n = it.next();
    if (n % 2 == 0) {
        it.remove(); // Safe removal
    }
}
System.out.println(numbers); // [1, 3, 5]
```

The modern, cleaner alternative:

```java
numbers.removeIf(n -> n % 2 == 0);
```

### Iterating a Map

```java
Map<String, Integer> map = new HashMap<>(Map.of("a", 1, "b", 2));

// Keys only
for (String key : map.keySet()) {
    System.out.println(key);
}

// Values only
for (int value : map.values()) {
    System.out.println(value);
}

// Key-value pairs (most common)
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
```

---

## 8. Sorting and Ordering

### Natural Order (Comparable)

Classes like `Integer`, `String`, and `Double` implement `Comparable<T>` — they define their own natural ordering via `compareTo()`.

```java
List<Integer> nums = new ArrayList<>(List.of(5, 1, 3, 2, 4));
Collections.sort(nums);
System.out.println(nums); // [1, 2, 3, 4, 5]
```

### Custom Order (Comparator)

Use `Comparator` to sort by any logic without modifying the class.

```java
List<String> names = new ArrayList<>(List.of("Charlie", "Alice", "Bob"));

// Sort by string length
names.sort(Comparator.comparingInt(String::length));
System.out.println(names); // [Bob, Alice, Charlie]

// Sort in reverse alphabetical order
names.sort(Comparator.reverseOrder());
System.out.println(names); // [Charlie, Bob, Alice]
```

### Sorting Custom Objects

```java
record Person(String name, int age) {}

List<Person> people = new ArrayList<>(List.of(
    new Person("Bob", 35),
    new Person("Alice", 28),
    new Person("Charlie", 28)
));

// Sort by age ascending, then name alphabetically
people.sort(Comparator.comparingInt(Person::age)
                       .thenComparing(Person::name));

people.forEach(p -> System.out.println(p.name() + " - " + p.age()));
// Alice - 28
// Charlie - 28
// Bob - 35
```

### Comparable vs Comparator — The Interview Question

| | Comparable | Comparator |
|---|---|---|
| Package | `java.lang` | `java.util` |
| Method | `compareTo(T o)` | `compare(T o1, T o2)` |
| Defined in | The class itself | External / separate class |
| Use case | Natural, default ordering | Custom, alternate ordering |
| Modifies class | Yes | No |

**Rule:** Use `Comparable` to define the default sort order of a class. Use `Comparator` when you need multiple sort orders or cannot modify the class.

---

## 9. The Collections Utility Class

`java.util.Collections` provides static utility methods that operate on any `Collection` or `List`.

```java
List<Integer> list = new ArrayList<>(List.of(3, 1, 4, 1, 5, 9, 2, 6));

Collections.sort(list);          // [1, 1, 2, 3, 4, 5, 6, 9]
Collections.reverse(list);       // [9, 6, 5, 4, 3, 2, 1, 1]
Collections.shuffle(list);       // Random order

System.out.println(Collections.min(list));           // Smallest
System.out.println(Collections.max(list));           // Largest
System.out.println(Collections.frequency(list, 1));  // Count of 1

// Binary search — list must be sorted first
Collections.sort(list);
int index = Collections.binarySearch(list, 5);

// Unmodifiable view — any mutation throws UnsupportedOperationException
List<String> fixed = Collections.unmodifiableList(new ArrayList<>(List.of("a", "b")));

// Thread-safe wrapper
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
```

---

## 10. Fail-Fast vs Fail-Safe Iterators

This is a common mid-to-senior interview topic but appears in beginner interviews too.

### Fail-Fast Iterators

Used by most standard collections (`ArrayList`, `HashMap`, `HashSet`, etc.). They maintain a `modCount` counter. If the collection is structurally modified after an iterator is created — by any means other than the iterator's own `remove()` — the iterator throws `ConcurrentModificationException` on the next access.

```java
List<String> list = new ArrayList<>(List.of("A", "B", "C"));
Iterator<String> it = list.iterator();
list.add("D"); // Structural modification

it.next(); // Throws ConcurrentModificationException
```

### Fail-Safe Iterators

Used by concurrent collections (`CopyOnWriteArrayList`, `ConcurrentHashMap`). They iterate over a snapshot or use internal mechanisms that tolerate concurrent modifications. They do not throw `ConcurrentModificationException` but may not reflect the most recent state of the collection.

```java
import java.util.concurrent.CopyOnWriteArrayList;

List<String> list = new CopyOnWriteArrayList<>(List.of("A", "B", "C"));
for (String s : list) {
    list.add("D"); // No exception — iterates over a snapshot
    System.out.println(s);
}
// Prints: A, B, C
```

**Summary:**

| | Fail-Fast | Fail-Safe |
|---|---|---|
| Throws on modification | Yes (ConcurrentModificationException) | No |
| Iterates over | Actual collection | Snapshot or safe view |
| Examples | ArrayList, HashMap | CopyOnWriteArrayList, ConcurrentHashMap |
| Memory overhead | Low | Higher (snapshot) |

---

## 11. Thread Safety in Collections

By default, collections in `java.util` are **not thread-safe**. Concurrent access from multiple threads without synchronization leads to data corruption.

### Legacy Thread-Safe Classes (avoid in new code)

`Vector` and `Hashtable` are synchronized at the method level — every operation locks the entire object. They are slow and considered legacy.

### Collections Wrappers

```java
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
Map<String, Integer> syncMap = Collections.synchronizedMap(new HashMap<>());
```

These work but require external synchronization when iterating.

### Concurrent Collections (preferred)

Found in `java.util.concurrent`. Designed for high-concurrency with fine-grained locking or lock-free algorithms.

| Class | Description |
|---|---|
| `ConcurrentHashMap` | Thread-safe map; locks only the affected bucket, not the whole map |
| `CopyOnWriteArrayList` | Thread-safe list; writes create a full copy; ideal for read-heavy workloads |
| `ConcurrentLinkedQueue` | Non-blocking, lock-free thread-safe queue |
| `BlockingQueue` (interface) | Supports blocking put/take; useful for producer-consumer patterns |

```java
import java.util.concurrent.ConcurrentHashMap;

Map<String, Integer> map = new ConcurrentHashMap<>();
map.put("A", 1);
map.put("B", 2);
// Safe for concurrent reads and writes without external synchronization
```

**Interview point:** Why prefer `ConcurrentHashMap` over `Collections.synchronizedMap()`?
`synchronizedMap` locks the entire map on every operation. `ConcurrentHashMap` in Java 8+ uses bucket-level locking — it locks only the individual bucket being modified, allowing much higher concurrency.

---

## 12. Choosing the Right Collection

| Requirement | Best Choice |
|---|---|
| Ordered list, frequent reads by index | `ArrayList` |
| Ordered list, frequent insertion at head | `LinkedList` |
| Unique elements, fastest operations | `HashSet` |
| Unique elements, preserve insertion order | `LinkedHashSet` |
| Unique elements, always sorted | `TreeSet` |
| FIFO queue | `ArrayDeque` |
| Stack (LIFO) | `ArrayDeque` |
| Priority-based retrieval | `PriorityQueue` |
| Key-value pairs, fastest access | `HashMap` |
| Key-value pairs, preserve insertion order | `LinkedHashMap` |
| Key-value pairs, sorted keys | `TreeMap` |
| Thread-safe list, read-heavy | `CopyOnWriteArrayList` |
| Thread-safe map, write-heavy | `ConcurrentHashMap` |

---

## 13. Common Interview Questions and Answers

**Q: What is the difference between `Collection` and `Collections`?**

`Collection` (singular) is an interface — the root of the collection hierarchy. `Collections` (plural) is a utility class containing static methods like `sort()`, `reverse()`, `shuffle()`, and `unmodifiableList()`.

---

**Q: What is the difference between `ArrayList` and `LinkedList`?**

`ArrayList` is backed by a dynamic array. It offers O(1) random access but O(n) insertion and deletion in the middle due to element shifting. `LinkedList` is backed by a doubly-linked list offering O(1) insertion and deletion at the ends, but O(n) random access. Prefer `ArrayList` in most situations.

---

**Q: What is the contract between `hashCode()` and `equals()`?**

If two objects are equal according to `equals()`, they must have the same `hashCode()`. The reverse is not required — two objects can have the same `hashCode()` without being equal (a collision). Violating this contract causes incorrect behavior in `HashMap`, `HashSet`, and similar hash-based collections.

---

**Q: How does `HashMap` handle collisions?**

All keys that hash to the same bucket form a chain. In Java 8+, when a bucket's chain exceeds 8 entries, it is converted to a balanced Red-Black tree, improving worst-case lookup from O(n) to O(log n).

---

**Q: What is the load factor in `HashMap`?**

The load factor (default 0.75) determines when the map resizes. When the number of entries exceeds `capacity * loadFactor`, the map doubles in capacity and rehashes all entries. A lower load factor reduces collisions but wastes memory. A higher load factor saves memory but increases collisions.

---

**Q: What is the difference between `HashMap` and `Hashtable`?**

`HashMap` is not synchronized and allows one null key and multiple null values. `Hashtable` is synchronized but slower, and does not allow null keys or values. `Hashtable` is a legacy class — use `ConcurrentHashMap` for thread-safe maps in modern code.

---

**Q: What is the difference between `HashMap` and `ConcurrentHashMap`?**

`HashMap` is not thread-safe. `ConcurrentHashMap` is thread-safe and achieves high concurrency by locking individual buckets rather than the entire map. It does not allow null keys or values, unlike `HashMap`.

---

**Q: What is the difference between `Comparable` and `Comparator`?**

`Comparable` is implemented by the class itself to define its natural ordering (`compareTo()`). `Comparator` is an external strategy object defining a custom ordering (`compare()`). Use `Comparable` for the default sort; use `Comparator` for alternate or multiple sort criteria.

---

**Q: What is a fail-fast iterator?**

An iterator that throws `ConcurrentModificationException` if the collection is structurally modified after the iterator is created — other than by the iterator's own `remove()` method. Most standard collections use fail-fast iterators.

---

**Q: When would you use `TreeMap` over `HashMap`?**

Use `TreeMap` when you need keys in sorted order or require range-based operations such as finding all keys less than a given value (`headMap()`), greater than a value (`tailMap()`), or the nearest key (`floorKey()`, `ceilingKey()`).

---

**Q: Can a `Set` contain null?**

`HashSet` and `LinkedHashSet` allow exactly one null element. `TreeSet` does not allow null because it compares elements for ordering, and comparing with null throws a `NullPointerException`.

---

**Q: What is the internal structure of `HashSet`?**

`HashSet` is backed by a `HashMap` where the elements are stored as keys and a constant dummy object is used as the value. This is why the behavior and performance of `HashSet` mirrors that of `HashMap`.

---

**Q: What is the difference between `poll()` and `remove()` in a Queue?**

Both retrieve and remove the head of the queue. `remove()` throws `NoSuchElementException` if the queue is empty. `poll()` returns null instead. Prefer `poll()` in most cases to avoid unchecked exceptions.

---

## 14. Common Pitfalls

### Using raw types instead of generics

```java
// Incorrect — no type safety, compiler warnings
List list = new ArrayList();

// Correct
List<String> list = new ArrayList<>();
```

### Modifying a collection during for-each iteration

```java
// Incorrect — throws ConcurrentModificationException
for (String s : list) {
    if (s.isEmpty()) list.remove(s);
}

// Correct — use removeIf or an explicit Iterator
list.removeIf(String::isEmpty);
```

### Mutating an immutable list from `List.of()`

```java
// Incorrect — List.of() returns an immutable list
List<String> names = List.of("Alice", "Bob");
names.add("Charlie"); // UnsupportedOperationException

// Correct — wrap in a mutable list
List<String> names = new ArrayList<>(List.of("Alice", "Bob"));
names.add("Charlie");
```

### Using a mutable object as a `HashMap` key

If an object's `hashCode()` changes after it is used as a key (because a field contributing to `hashCode()` is mutated), the map can no longer find the entry. Always use immutable objects (e.g., `String`, `Integer`, records) as map keys.

### Not overriding `hashCode()` when overriding `equals()`

Two custom objects that are `equals` must return the same `hashCode`. If only `equals` is overridden, `HashSet` and `HashMap` will treat logically identical objects as distinct entries.

### Assuming `HashMap` iteration order

`HashMap` does not guarantee insertion order or any other order. If order matters, use `LinkedHashMap` (insertion order) or `TreeMap` (sorted order).

---

## 15. Quick Reference Cheat Sheet

```
LISTS
  ArrayList       Resizable array. Fast read (O1). Slow mid-insert (On). Default choice.
  LinkedList      Doubly-linked. Fast head/tail ops (O1). Slow random access (On).

SETS
  HashSet         Fastest. No order. O(1) avg. Backed by HashMap.
  LinkedHashSet   Insertion order preserved. O(1) avg.
  TreeSet         Always sorted. O(log n). Backed by TreeMap.

QUEUES / DEQUES
  ArrayDeque      Fast queue and stack. Prefer over Stack and LinkedList.
  PriorityQueue   Min-heap. Smallest element polled first. O(log n) offer/poll.

MAPS
  HashMap         Fastest. No order. O(1) avg. Allows one null key.
  LinkedHashMap   Insertion order preserved. O(1) avg.
  TreeMap         Sorted keys. O(log n). Implements NavigableMap.

CONCURRENT
  ConcurrentHashMap     Thread-safe map. High concurrency. No null keys/values.
  CopyOnWriteArrayList  Thread-safe list. Safe iteration. Write-heavy cost.

UTILITY (java.util.Collections)
  sort()                Sort a List using natural or custom order
  reverse()             Reverse a List
  shuffle()             Randomize a List
  min() / max()         Find extremes
  frequency()           Count occurrences
  binarySearch()        Search a sorted List
  unmodifiableList()    Read-only wrapper
  synchronizedList()    Thread-safe wrapper (prefer concurrent classes instead)

KEY RULES
  - hashCode() and equals() must be consistent for hash-based collections
  - Use immutable objects as Map keys
  - Prefer ArrayDeque over Stack
  - Prefer ConcurrentHashMap over Hashtable or synchronizedMap
  - List.of() and Map.of() return immutable collections
```
