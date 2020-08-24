//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Exam Number:2
//===================================
public class HandlingArrays {
    //PrintArray method:
    public static void printArray(double [] testArray) {
        
    	String str = Arrays.toString(testArray);
    	System.out.println(str);
        System.out.print("[");
         for(int i = 0; i<testArray.length - 1;i++){
             System.out.print(testArray[i] + ", ");
         }
        System.out.println(testArray[testArray.length - 1] + "]");
     }
     //sumElements method:
    public static double[] sumElements(double [] firstArray, double [] secondArray) {
    	
    	double[] result = new double[firstArray.length];
    	if(firstArray.length == secondArray.length){
    		for(int i = 0; i< firstArray.length; i++){
    			result[i] = firstArray[i]+secondArray[i];
    		}
    	}else {
    		System.out.println("Error - Arrays different shape.");  		
    	}
		return result;
    }
    //reverseArray method:
    public static double[] reverseArray(double [] testArray) {   
        for (int i = 0; i<testArray.length/2; i++){
        		double tmp = testArray[i];
        		testArray[i] = testArray[testArray.length-1-i];
        		testArray[testArray.length-1-i] = tmp;
        }
        return testArray;
     }
}