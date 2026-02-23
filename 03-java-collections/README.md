# 03 — Java Collections Framework

The **Java Collections Framework (JCF)** is a unified architecture in `java.util` for storing and manipulating groups of objects. It provides:

- **Interfaces** that describe different abstract data types (lists, sets, queues, maps).
- **Implementations** (classes) that realize those interfaces with different performance and ordering characteristics.
- **Algorithms** (utility methods) that operate on collections (sorting, searching, shuffling, etc.).

All modern Java code that deals with groups of objects should prefer the Collections Framework over manually managed arrays wherever possible.

---

## 1. Big Picture

- **`Iterable<E>`** → root for anything usable in the enhanced `for` loop.
- **`Collection<E>`** → root of all collection types (except `Map`), extends `Iterable`.
  - **`List<E>`** → ordered, positional, allows duplicates.
  - **`Set<E>`** → no duplicates, models mathematical set.
  - **`Queue<E>` / `Deque<E>`** → elements with specific insertion/removal discipline (FIFO, LIFO, etc.).
- **`Map<K,V>`** → key–value associations (not a `Collection`, but part of the framework).

Most implementations live in `java.util` (and `java.util.concurrent` for concurrent versions).

---

## 2. Core Interfaces at a Glance

### 2.1 Collection hierarchy

- **`Iterable<E>`**
  - `Iterator<E> iterator()`
  - Enables enhanced `for` loop: `for (E e : iterable) { ... }`

- **`Collection<E>`** (extends `Iterable<E>`)  
  Common methods:
  - `int size()`, `boolean isEmpty()`
  - `boolean add(E e)`, `boolean addAll(Collection<? extends E> c)`
  - `boolean remove(Object o)`, `void clear()`
  - `boolean contains(Object o)`
  - `Iterator<E> iterator()`, `Object[] toArray()`

- **`List<E>`** (extends `Collection<E>`)  
  - Ordered, index-based, allows duplicates and `null` (most implementations).
  - Key methods: `get(int index)`, `set(int index, E e)`, `add(int index, E e)`, `remove(int index)`, `indexOf`, `lastIndexOf`, `listIterator()`.

- **`Set<E>`** (extends `Collection<E>`)  
  - No duplicates (`add` returns `false` if element already present).
  - Implementations differ in ordering and performance.

- **`Queue<E>`** (extends `Collection<E>`)  
  - Typically FIFO; may have priority-based ordering.
  - Core methods (pairs):
    - `offer(e)` / `add(e)`
    - `poll()` / `remove()`
    - `peek()` / `element()`

- **`Deque<E>`** (extends `Queue<E>`)  
  - Double-ended queue: insert/remove at both ends.
  - Supports stack-like (`push`, `pop`) and queue-like (`offerFirst`, `offerLast`, etc.) operations.

### 2.2 Map hierarchy

- **`Map<K,V>`** (key–value pairs, no duplicate keys)
  - `V put(K key, V value)`, `V get(Object key)`, `V remove(Object key)`
  - `boolean containsKey(Object key)`, `boolean containsValue(Object value)`
  - Views: `Set<K> keySet()`, `Collection<V> values()`, `Set<Map.Entry<K,V>> entrySet()`

---

## 3. Key Implementations & When to Use Them

### 3.1 Lists

- **`ArrayList<E>`**
  - Backed by a **resizable array**.
  - **Strengths**:
    - `get(i)` and `set(i, e)` are **O(1)**.
    - Appending at the end is **amortized O(1)**.
  - **Weaknesses**:
    - Inserting/removing in the middle requires shifting elements → **O(n)**.
  - **Use when**:
    - You do many random reads.
    - Insertions/removals are mostly at the end.

- **`LinkedList<E>`**
  - Doubly-linked list.
  - **Strengths**:
    - Insertion/removal at ends (head/tail) are **O(1)**.
    - Insertion/removal in the middle is **O(1)** once you have a reference/iterator to the node.
  - **Weaknesses**:
    - Random access (`get(i)`) is **O(n)**.
    - Higher memory overhead (node objects, pointers).
  - **Use when**:
    - Frequent insert/remove at ends.
    - You often modify the list while iterating via `ListIterator`.

- **Legacy list types**:
  - **`Vector<E>`**: like `ArrayList` but synchronized on each method; rarely needed now.
  - **`Stack<E>`**: legacy stack based on `Vector`; prefer `Deque` (`ArrayDeque`) for stack behavior.

### 3.2 Sets

- **`HashSet<E>`**
  - Backed by a **hash table**.
  - No ordering guarantees.
  - Avg time: **O(1)** for `add`, `remove`, `contains` (assuming good `hashCode`).
  - **Use when**:
    - You need fast membership tests, no ordering.

- **`LinkedHashSet<E>`**
  - Inherits from `HashSet` but maintains insertion order via a linked list.
  - Slightly more memory and minor overhead vs `HashSet`.
  - **Use when**:
    - You need `HashSet` speed but also **predictable iteration order** (insertion order).

- **`TreeSet<E>`**
  - Backed by a balanced tree (typically Red–Black tree).
  - Elements kept in **sorted order** (natural order or provided `Comparator`).
  - Operations cost **O(log n)**.
  - Supports range operations: `headSet`, `tailSet`, `subSet`, `first`, `last`, etc.
  - **Use when**:
    - You need a **sorted set** or need to do range queries.

### 3.3 Queues and Deques

- **`PriorityQueue<E>`**
  - Min-heap (by default) over elements.
  - `offer` / `poll` are **O(log n)**.
  - Iterator does **not** return elements in sorted order; only `peek`/`poll` give smallest (or largest with custom comparator).
  - **Use when**:
    - You need the “next” smallest/largest element efficiently (e.g. Dijkstra, top-k elements).

- **`ArrayDeque<E>`**
  - Resizable circular array implementing `Deque`.
  - **O(1)** amortized insert/remove at both ends.
  - Usually **faster than `LinkedList`** for queue/stack uses.
  - **Use when**:
    - You want a **stack** (`push`, `pop`) or **queue/deque** with high performance and no random access.

- **`LinkedList<E>` as a Queue/Deque**
  - Implements `Deque`; can be used as queue or stack.
  - Generally slower than `ArrayDeque` but fine for many cases.

### 3.4 Maps

- **`HashMap<K,V>`**
  - Hash table of buckets.
  - Avg **O(1)** `put`, `get`, `remove` (assuming good `hashCode` & load factor).
  - No ordering guarantees.
  - **Use when**:
    - General-purpose key–value store with no ordering requirement.

- **`LinkedHashMap<K,V>`**
  - HashMap that also maintains **insertion order** (or access order if configured).
  - Slightly more overhead than `HashMap`.
  - **Use when**:
    - You need deterministic iteration order or LRU-like eviction (via access-order + overrides).

- **`TreeMap<K,V>`**
  - Sorted map backed by a balanced tree.
  - Keys in **sorted order** (natural or via `Comparator`).
  - `get`, `put`, `remove` are **O(log n)**.
  - Supports range views: `headMap`, `tailMap`, `subMap`, `firstKey`, `lastKey`.
  - **Use when**:
    - You need **sorted keys** or range queries.

- **Other notable maps/sets** (brief):
  - `EnumSet`, `EnumMap`: highly efficient for `enum` keys.
  - `WeakHashMap`: keys are weakly referenced (useful for caches tied to key liveness).
  - `IdentityHashMap`: keys compared by `==` instead of `equals`.
  - Concurrent variants in `java.util.concurrent` (e.g. `ConcurrentHashMap`).

---

## 4. Complexity & Ordering Cheat Sheet

High-level guidelines (typical cases, not worst-case pathologies):

| Type                  | Implementation     | Ordering                 | Duplicates | Typical `add/get/remove` |
|-----------------------|-------------------|--------------------------|-----------|--------------------------|
| List                  | `ArrayList`       | insertion index-based    | yes       | O(1) / O(1) / O(n)      |
| List                  | `LinkedList`      | insertion order          | yes       | O(1) ends / O(n) index  |
| Set                   | `HashSet`         | none                     | no        | O(1) avg                |
| Set                   | `LinkedHashSet`   | insertion order          | no        | O(1) avg                |
| Set / SortedSet       | `TreeSet`         | sorted (natural/custom)  | no        | O(log n)                |
| Queue / Deque         | `ArrayDeque`      | insertion order          | yes       | O(1) ends               |
| Priority Queue        | `PriorityQueue`   | heap order (by priority) | yes       | O(log n)                |
| Map                   | `HashMap`         | none                     | —         | O(1) avg                |
| Map                   | `LinkedHashMap`   | insertion/access order   | —         | O(1) avg                |
| SortedMap / Navigable | `TreeMap`         | sorted keys              | —         | O(log n)                |

---

## 5. Iteration & Traversal

### 5.1 Enhanced for-loop

Any `Iterable` (including all `Collection` implementations) supports:

```java
for (String s : list) {
    System.out.println(s);
}
```

Internally this uses an `Iterator`.

### 5.2 Iterator & ListIterator

- **`Iterator<E>`**
  - Methods: `boolean hasNext()`, `E next()`, `void remove()`.
  - Safe way to remove elements during iteration (fail-fast if structural changes occur outside iterator).

- **`ListIterator<E>`** (for lists only)
  - Bi-directional: `hasPrevious()`, `previous()`.
  - Can add/replace elements while iterating.

### 5.3 Iterating over maps

```java
for (Map.Entry<K, V> entry : map.entrySet()) {
    K key = entry.getKey();
    V value = entry.getValue();
}

for (K key : map.keySet()) { ... }
for (V value : map.values()) { ... }
```

---

## 6. Utility Classes: Collections & Arrays

### 6.1 `java.util.Collections`

Static helper methods for collections:

- **Sorting & shuffling**
  - `Collections.sort(list);`
  - `Collections.sort(list, comparator);`
  - `Collections.shuffle(list);`

- **Search & min/max**
  - `Collections.binarySearch(list, key);` (on sorted list)
  - `Collections.min(coll);`, `Collections.max(coll);`

- **Unmodifiable & synchronized views**
  - `Collections.unmodifiableList(list);`
  - `Collections.unmodifiableSet(set);`
  - `Collections.synchronizedList(list);` (legacy-style synchronization)

- **Others**
  - `Collections.reverse(list);`
  - `Collections.fill(list, value);`
  - `Collections.frequency(coll, element);`

### 6.2 `java.util.Arrays`

Utility methods for arrays (not collections, but often used together):

- `Arrays.sort(array);`
- `Arrays.binarySearch(array, key);`
- `Arrays.fill(array, value);`
- `Arrays.toString(array);`, `Arrays.deepToString(array);`

---

## 7. Common Usage Patterns

### 7.1 Frequency counting

```java
Map<Integer, Integer> freq = new HashMap<>();
for (int x : nums) {
    freq.put(x, freq.getOrDefault(x, 0) + 1);
}
```

### 7.2 Maintaining order without duplicates

```java
Set<String> seenInOrder = new LinkedHashSet<>();
for (String s : input) {
    seenInOrder.add(s); // duplicates ignored, order preserved
}
```

### 7.3 Priority-based processing (min-heap)

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(5);
pq.offer(1);
pq.offer(3);
while (!pq.isEmpty()) {
    System.out.println(pq.poll()); // 1, 3, 5
}
```

### 7.4 Using a deque as a stack

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(10);
stack.push(20);
int top = stack.pop(); // 20
```

---

## 8. Best Practices & Gotchas

- **Always override `equals` and `hashCode` together** for objects used as keys in maps or elements in hash-based sets.
- Prefer **interface types** in variable declarations: `List<String> list = new ArrayList<>();`.
- Choose implementation based on **access pattern**:
  - Random access → `ArrayList`.
  - Many insertions/removals at ends → `LinkedList` or `ArrayDeque`.
  - Need fast membership checks, no duplicates → `HashSet`.
  - Need sorted order → `TreeSet` / `TreeMap`.
- Be aware of **fail-fast iterators**:
  - Modifying a collection structurally while iterating with a normal iterator (except via iterator’s own `remove`) usually leads to `ConcurrentModificationException`.
- For true multi-threaded access, prefer **concurrent collections** (`ConcurrentHashMap`, `CopyOnWriteArrayList`, etc.) instead of manual synchronization or legacy synchronized classes (`Vector`, `Hashtable`).

This section should give you enough intuition to **choose the right collection** and understand the trade-offs when solving DSA problems in Java.

