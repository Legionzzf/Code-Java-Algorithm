//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang   
// id: your a1806522
// Semester:1
// Year:1
// Practical Number: Practical-05: Sorting Algorithms and Recursion Practice
//===================================
public class InsertionSort extends MySortAlg {

    @Override
    int[] sort(int[] array) {
        int k;
        int j;
        for (int i = 1; i < array.length; i++) {
            k = array[i];                        // picking the element to be inserted
            j = i - 1;
            while (j >= 0 && array[j] < k) {    // searching for the appropriate position at the left of i
                array[j + 1] = array[j];        // shift the element one place towards right
                j--;                            // decrement index
            }
            array[j + 1] = k;                   // place the element at the right position
        }
        return array;
    }
}
