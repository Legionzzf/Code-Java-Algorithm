//Student name: Zhuofan ZHang
//Student ID: a1806522
import java.util.Arrays;
public class BaseOperations {
    //Define reverseArray for int
    public static int[] reverseArray(int[] array){
     int a = 0;
     for(int i=0; i<array.length/2; i++){
         a = array[i];
         array[i] = array[array.length-i-1];
         array[array.length-i-1]=a;
     }
     return array;
    }
    //print int array
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
    //Define reverseArray for String
    public static String[] reverseArray(String[] array){
        String a = "a";
        for(int i=0; i<array.length/2; i++){
            a=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=a;
        }
        return array;
    }
    //print string array
    public static void printArray(String[] array){
        System.out.println((Arrays.toString(array)));
    }
    //Define reverseArray for float
    public static float[] reverseArray(float[] array){
        float a = 0.5f;
        for(int i =0; i<array.length/2; i++){
            a=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=a;
        }
        return array;
    }
    //print float array
    public static void printArray(float[] array){
        System.out.println(Arrays.toString(array));
    }
    //print reverse array
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4};
        printArray(intArray);
        intArray = reverseArray(intArray);
        System.out.println(Arrays.toString(intArray));

        String[] stringArray = {"A","B","C","D"};
        printArray(stringArray);
        stringArray = reverseArray(stringArray);
        System.out.println(Arrays.toString(stringArray));

        float[] floatArray ={1.0f,2.0f,3.0f,4.0f};
        printArray(floatArray);
        floatArray = reverseArray(floatArray);
        System.out.println(Arrays.toString(floatArray));
    }
}
