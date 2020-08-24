//Student Name: Zhuofan Zhang
//Student id: a1806522
public class BinarySearch extends MySearchAlg {
    @Override
    int search(int[] array, int num) {

        int head = 0;//Initial head number
        int end = array.length - 1;//Initial last number
        int mid = (head + end) / 2;
        //Termination condition
        while (head <= end) {
            if (array[mid] < num) {
                head = mid + 1;
                //get the target number
            } else if (array[mid] == num) {
                return mid;
            } else {//arr[mid]>num
                end = mid - 1;
            }
            mid = (head + end) / 2;
        }
        return -1;
    }
}
