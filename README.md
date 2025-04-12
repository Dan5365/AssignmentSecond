# My Data Structures Implementation

This project implements custom data structures in Java as part of a programming assignment. It includes physical data structures (MyArrayList, MyLinkedList) and logical data structures (MyStack, MyQueue, MyMinHeap).

## Structure

- **MyList.java**: Interface defining list operations.
- **MyArrayList.java**: Dynamic array-based list implementation.
- **MyLinkedList.java**: Doubly-linked list implementation.
- **MyStack.java**: Stack (LIFO) using MyArrayList.
- **MyQueue.java**: Queue (FIFO) using MyLinkedList.
- **MyMinHeap.java**: Min-heap using MyArrayList.
- **Test Classes**: Each data structure has a test class (e.g., MyArrayListTest.java).

## Design Choices

- **MyStack**: Uses MyArrayList for O(1) push/pop at the end.
- **MyQueue**: Uses MyLinkedList for O(1) enqueue/dequeue at opposite ends.
- **MyMinHeap**: Uses MyArrayList for efficient array-based heap operations.

## How to Run

1. Compile all `.java` files: `javac *.java`
2. Run a test class, e.g., `java MyArrayListTest`

## Dependencies

- Java (no external libraries except java.util.Iterator).

## Notes

- Generic types are used for flexibility.
- MyMinHeap uses `Comparable` for element comparison.
- All implementations avoid loops and handle edge cases.
