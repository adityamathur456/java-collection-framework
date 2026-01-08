# Java Collection Framework 🚀

This repository contains **implementations, examples, and explanations** of important classes and interfaces in the **Java Collection Framework (JCF)**.  
It covers Lists, Sets, Maps, Queues, and utility interfaces like `Comparable` and `Comparator`.

👉 Open this repository directly in **VS Code Web**:  
[Open in VS Code Web](https://vscode.dev/github/YourGitHubUsername/YourRepositoryName)

---

## 📌 What is the Java Collection Framework?
The Java Collection Framework is a **unified architecture** for storing and manipulating groups of objects.  
It provides:
- Interfaces (List, Set, Queue, Map, etc.)
- Classes (ArrayList, LinkedList, HashMap, etc.)
- Algorithms (Sorting, Searching, etc.)

---

## 📂 Repository Structure

- `ArrayList/` → Examples of dynamic arrays
- `Comparable/` → Natural ordering of objects
- `Comparator/` → Custom ordering of objects
- `HashMap/` → Key-Value pair mapping
- `HashSet/` → Unique elements storage
- `LinkedHashMap/` → Ordered key-value mapping
- `LinkedList/` → Doubly linked list implementation
- `PriorityQueue/` → Elements processed based on priority
- `Queue/` → FIFO-based collection
- `Stack/` → LIFO-based collection
- `TreeMap/` → Sorted key-value mapping
- `TreeSet/` → Sorted unique elements
- `Collection-framework-hierarchy.png` → Visual hierarchy diagram

---

## 📖 Definitions of Classes and Interfaces

### 🔹 `ArrayList`
- Resizable array implementation of the `List` interface.  
- Allows duplicate elements and maintains insertion order.  
- Fast random access but slower insertions/removals in the middle.  

### 🔹 `Comparable`
- Interface used to define the **natural ordering** of objects.  
- Method: `compareTo(Object o)`  

### 🔹 `Comparator`
- Interface used for **custom ordering** of objects.  
- Method: `compare(Object o1, Object o2)`  

### 🔹 `HashMap`
- Stores key-value pairs with **unique keys**.  
- Does not maintain order.  
- Allows one `null` key and multiple `null` values.  

### 🔹 `HashSet`
- Implements the `Set` interface.  
- Stores **unique elements** with no duplicates.  
- Backed by a `HashMap`.  

### 🔹 `LinkedHashMap`
- Similar to `HashMap` but maintains **insertion order**.  

### 🔹 `LinkedList`
- Implements both `List` and `Deque`.  
- Doubly linked list allowing fast insertions/deletions.  

### 🔹 `PriorityQueue`
- Queue where elements are processed based on **priority** (natural or custom comparator).  

### 🔹 `Queue`
- Interface for **FIFO** collections.  
- Implementations: `LinkedList`, `PriorityQueue`.  

### 🔹 `Stack`
- Legacy class (extends `Vector`).  
- **LIFO** (Last-In, First-Out).  

### 🔹 `TreeMap`
- Red-Black Tree based implementation of `NavigableMap`.  
- Stores keys in **sorted order**.  

### 🔹 `TreeSet`
- Implements `NavigableSet`.  
- Stores **unique elements in sorted order**.  

---

## 📊 Collection Framework Hierarchy

![Collection Framework Hierarchy](Collection-Framework.png)

---

## ⚡ How to Use
1. Clone the repository:
   ```bash
   git clone https://github.com/YourGitHubUsername/YourRepositoryName.git
