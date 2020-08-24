//Student Name: Zhuofan Zhang
//Student id: a1806522
public class LinearSearch extends MySearchAlg {
    @Override
    int search(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            // if they are equal -> found an item
            if (array[i] == num) {
                // return its position
                return i;
            }
        }
        // Item is not in this array
        return -1;
    }
}
