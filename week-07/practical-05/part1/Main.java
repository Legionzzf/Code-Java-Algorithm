//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang   
// id: your a1806522
// Semester:1
// Year:1
// Practical Number: Practical-05: Sorting Algorithms and Recursion Practice
//===================================
public class Main {

    public static void main(String[] a){
        ////Define new array
        int[] array1 = new int[]{1,2,3,4,5,7,9,11,22,32,52,72,82,92,6};
        int[] array2 = new int[]{32,45,22,7,8,10,55,41,11,2,26,23,63,37};
        int[] array3 = new int[]{90,91,92,93,94,95,96,97,98,99};
        //Define new SortedArray
        int[] sortedArray1 = new int[]{92,82,72,52,32,22,11,9,7,6,5,4,3,2,1};
        int[] sortedArray2 = new int[]{63,55,45,41,37,32,26,23,22,11,10,8,7,2};
        int[] sortedArray3 = new int[]{99,98,97,96,95,94,93,92,91,90};

        //Create new object and testing insertion sort with input
        MySortAlg alg1 = new InsertionSort();
        System.out.println("Testing insertion sort with input 1: ");
        printArray(array1);
        int[] sorted1 = alg1.sort(array1.clone());
        System.out.println("sorted result is:");
        printArray(sorted1);
        System.out.println("Test passed: " + test(sorted1, sortedArray1));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Testing insertion sort with input 2: ");
        printArray(array2);
        int[] sorted2 = alg1.sort(array2.clone());
        System.out.println("sorted result is:");
        printArray(sorted2);
        System.out.println("Test passed: " + test(sorted2, sortedArray2));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Testing insertion sort with input 3: ");
        printArray(array3);
        int[] sorted3 = alg1.sort(array3.clone());
        System.out.println("sorted result is:");
        printArray(sorted3);
        System.out.println("Test passed: " + test(sorted3, sortedArray3));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //Create new object and testing merge sort with input
        MySortAlg alg2 = new InsertionSort();
        System.out.println("Testing merge sort with input 1: ");
        printArray(array1);
        int[] sorted4 = alg1.sort(array1.clone());
        System.out.println("sorted result is:");
        printArray(sorted4);
        System.out.println("Test passed: " + test(sorted4, sortedArray1));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Testing merge sort with input 2: ");
        printArray(array2);
        int[] sorted5 = alg1.sort(array2.clone());
        System.out.println("sorted result is:");
        printArray(sorted5);
        System.out.println("Test passed: " + test(sorted5, sortedArray2));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Testing merge sort with input 3: ");
        printArray(array3);
        int[] sorted6 = alg1.sort(array3.clone());
        System.out.println("sorted result is:");
        printArray(sorted6);
        System.out.println("Test passed: " + test(sorted6, sortedArray3));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //Create new object and testing quick sort with input
        MySortAlg alg3 = new InsertionSort();
        System.out.println("Testing quick sort with input 1: ");
        printArray(array1);
        int[] sorted7 = alg1.sort(array1.clone());
        System.out.println("sorted result is:");
        printArray(sorted7);
        System.out.println("Test passed: " + test(sorted7, sortedArray1));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Testing quick sort with input 2: ");
        printArray(array2);
        int[] sorted8 = alg1.sort(array2.clone());
        System.out.println("sorted result is:");
        printArray(sorted8);
        System.out.println("Test passed: " + test(sorted8, sortedArray2));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Testing quick sort with input 3: ");
        printArray(array3);
        int[] sorted9 = alg1.sort(array3.clone());
        System.out.println("sorted result is:");
        printArray(sorted9);
        System.out.println("Test passed: " + test(sorted9, sortedArray3));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Comparing using compare method 1: ");
        printArray(array1);
        System.out.println("and");
        printArray(array2);
        System.out.println("Output: " + compare(array1.clone(), array2.clone()));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Comparing using compare method 2: ");
        printArray(array2);
        System.out.println("and");
        printArray(sortedArray2);
        System.out.println("Output: " + compare(array2.clone(), sortedArray2));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Input: ");
        printArray(array3);
        System.out.println("Output: " + findSmallestSum(array3.clone()));

    }

    public static void printArray(int[] array) {
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean test(int[] arr1, int[] arr2){
        boolean equal = true;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                equal = false;
                break;
            }
        }
        return equal;
    }
    //question 7 Build compare method
    public static boolean compare(int[] arr1, int[] arr2){
        MySortAlg sorter = new QuickSort();
        int[] sortedArr1 = sorter.sort(arr1);
        int[] sortedArr2 = sorter.sort(arr2);
        return test(sortedArr1, sortedArr2);
    }
    //question 8 Build findSmallestSum method
    public static int findSmallestSum(int[] array){
        MySortAlg sorter = new QuickSort();
        int[] sortedArray = sorter.sort(array);
        return sortedArray[array.length - 1] + sortedArray[array.length - 2];
    }
}
