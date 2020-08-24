//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang   
// id: your a1806522
// Semester:1
// Year:1
// Practical Number: Practical-05: Sorting Algorithms and Recursion Practice
//===================================
public class QuickSort extends MySortAlg {

    @Override
    int[] sort(int[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);                          // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (array[j] > pivot) {
                i++;
                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            // partitionIdx is partitioning index, array[partitionIdx] is now correctly placed
            int partitionIdx = partition(array, low, high);
            // Recursively sort elements before partition and after partition
            quickSort(array, low, partitionIdx - 1);
            quickSort(array, partitionIdx + 1, high);
        }
        return array;
    }
}

