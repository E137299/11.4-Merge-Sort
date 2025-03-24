# 11.4 Merge Sort

**Objective:**  
Learn to implement the Merge Sort algorithm in Java using recursion and array manipulation.

---

### **Background**
Merge Sort is a classic **divide and conquer** algorithm that breaks down an array into smaller parts, sorts them, and then merges the sorted parts to produce a fully sorted array.

Steps:
1. Divide the array into two halves.
2. Recursively sort each half.
3. Merge the two sorted halves into a single sorted array.

---

### **Instructions**
You are given a Java class `MergeSorter` with a `main()` method to test your implementation. Your task is to write the method:

```java
public static void mergeSort(int[] array)
```

This method should sort the input array in ascending order using the **merge sort algorithm**. You must also write a helper method:

```java
public static void merge(int[] array, int[] left, int[] right)
```

---

###  **Starter Code**

```java
public class MergeSorter {
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before sorting:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    public static void mergeSort(int[] array) {
        // Your code here
    }

    public static void merge(int[] array, int[] left, int[] right) {
        // Your code here
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```

---

###  **Requirements**
- Your `mergeSort()` method must sort the array in place.
- Your algorithm must use recursion.
- Your `merge()` method must correctly merge two sorted halves into the original array.
- Do **not** use built-in sorting methods (like `Arrays.sort()`).

---

###  **Hints**
- Use `System.arraycopy()` or manual loops to split arrays.
- The base case is when the array has one or zero elements.
- Make sure to handle merging arrays of different lengths correctly.

