//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang   
// id: your a1806522
// Semester:1
// Year:1
// Practical Number: Practical-05: Sorting Algorithms and Recursion Practice
//===================================
public class MergeSort extends MySortAlg {

    @Override
    int[] sort(int[] array) {
        return mergeSort(array, 0, array.length - 1);
    }

    void merge(int array[], int leftPos, int midPos, int rightPos) {
        int i, j, k;
        int leftSize = midPos - leftPos + 1;
        int rightSize = rightPos - midPos;

        // create temporary arrays
        int[] tempLeft = new int[leftSize];
        int[] tempRight = new int[rightSize];

        // copy data to temporary arrays tempLeft[] and tempRight[]
        for (i = 0; i < leftSize; i++) {
            tempLeft[i] = array[leftPos + i];
        }
        for (j = 0; j < rightSize; j++) {
            tempRight[j] = array[midPos + 1 + j];
        }

        // merge the temporary arrays back into array[leftPos..rightPos]
        i = 0;
        j = 0;
        k = leftPos;                            // Initial index of merged subarray
        while (i < leftSize && j < rightSize) {
            if (tempLeft[i] >= tempRight[j]) {
                array[k] = tempLeft[i];
                i++;
            } else {
                array[k] = tempRight[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of tempLeft[]
        while (i < leftSize) {
            array[k] = tempLeft[i];
            i++;
            k++;
        }

        // Copy the remaining elements of tempRight[]
        while (j < rightSize) {
            array[k] = tempRight[j];
            j++;
            k++;
        }
    }

    // left index and right index of the sub-array to be sorted sorted are passed
    int[] mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;

            // Sort first and second sub-arrays
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
        return array;
    }

}