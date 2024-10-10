// Java implementation of QuickSort Algorithm using Recursion
public class QuickSort {
    
    // Function to perform QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the partition index
            int partitionIndex = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Function to partition the array on the basis of the pivot
    public static int partition(int[] array, int low, int high) {
        // Select the pivot element (we'll choose the last element)
        int pivot = array[high];
        int i = (low - 1); // Index of the smaller element

        // Rearranging the elements around the pivot
        for (int j = low; j < high; j++) {
            // If the current element is smaller than the pivot
            if (array[j] < pivot) {
                i++; // Move the smaller element to the left
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at index i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the partition index
    }

    // Function to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] array = {10, 80, 30, 90, 40, 50, 70};

        System.out.println("Original Array:");
        printArray(array);

        // Call quickSort on the entire array
        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}
