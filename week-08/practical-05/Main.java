//Student Name: Zhuofan Zhang
//Student id: a1806522
public class Main {
    //boolean test method
    private static boolean test(int result, int ans){
        if (result == ans) {
            return true;
        } else {
            return false;
        }
    }
    //finalMaxVal method
    private static int findMaxVal(int array[]){
        int max = array[0];
        int maxIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    //get the {} for array
    private static String arrayToString(int[] arr) {
        String a = "{";
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1)
                a += arr[i] + "}";
            else
                a += arr[i] + ", ";
        }
        return a;
    }
    //test three times
    public static void main(String[] args) {
        //Test Linear search
        System.out.println("Testing the Linear Search");
        int testArr1[] = {1, 3, 5, 7 , 19, 7, -9};
        int testSearch1 = 7;
        System.out.println("Searching " + testSearch1 + " in： array = " + arrayToString(testArr1));
        int AnsResult1 = new LinearSearch().search(testArr1, testSearch1);
        int RealResult1 = 3;
        boolean Status1 = test(AnsResult1, RealResult1);
        System.out.println("Ans Result: " + AnsResult1);
        System.out.println("real Result: " + RealResult1);
        System.out.println("Compare result: " + Status1);
        //Test Binary search
        System.out.println("\nTesting the Binary Search");
        int testArr2[] = {-9, -3, 5, 9, 12, 15, 20};
        int testSearch2 = -3;
        System.out.println("Searching " + testSearch2 + " in： array = " + arrayToString(testArr2));
        int AnsResult2 = new BinarySearch().search(testArr2, testSearch2);
        int RealResult2 = 1;
        boolean Status2 = test(AnsResult2, RealResult2);
        System.out.println("Ans Result: " + AnsResult2);
        System.out.println("Real Result: " + RealResult2);
        System.out.println("Compare result: " + Status2);
        //Test another Binary search
        System.out.println("\nTesting another Binary Search");
        int testArr3[] = {2, 3, 8, 13, 19, 25, 33, 35};
        int testSearch3 = 2;
        System.out.println("Searching " + testSearch3 + " in： array = " + arrayToString(testArr3));
        int AnsResult3 = new BinarySearch().search(testArr3, testSearch3);
        int RealResult3 = 0;
        boolean Status3 = test(AnsResult3, RealResult3);
        System.out.println("Ans Result: " + AnsResult3);
        System.out.println("Real Result: " + RealResult3);
        System.out.println("Compare result: " + Status3);

        // testing the findMaxVal method
        System.out.println("\nTesting the findMaxVal method");
        int testArr4[] = {1, 9, 6, 8, 3, 30, 29, 15, 13};
        int resultMaxIndex = findMaxVal(testArr4);
        int expectedMaxIndex = 5;
        System.out.println("Array = "+ arrayToString(testArr4));
        boolean status = test(resultMaxIndex, expectedMaxIndex);
        System.out.println("Ans Result: " + resultMaxIndex);
        System.out.println("Real Result: " + expectedMaxIndex);
        System.out.println("Compare result: " + status);
    }
}
