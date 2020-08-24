/*
*   Foundations of Computer Science
*   2020, Semester 01
*   Practical-Exam-04
*
*   student (id): a1806522
*   student (name): Zhuofan Zhang
*
* Note: in order to finish your exam you need to make changes in this class
* Problem 03
*/


public class Selection extends Sort{

	@Override
	public int [] sortIntByIndex(int [] arr){
		int [] index = this.getIndex(arr.length); 
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int min_idx = i; 
			for (int j = i+1; j<n; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j; 
				}
			}
			this.swap(arr, i, min_idx); 
			this.swap(index, i, min_idx); 
		}
		return index;
	}

	@Override
	public int [] sortInt(int [] arr){
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int min_idx = i; 
			for (int j = i+1; j<n; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j; 
				}
			}
			this.swap(arr, i, min_idx); 
		}
		return arr;
	}
	



	@Override
	public int [] sortStringByIndex(String [] arr){
		int n = arr.length;
		int[] indexArr = getIndex(n);
		for (int i = 0; i < n; i++){
			int minDex = i;
			for (int j = i+1; j < n; j++){
				if (arr[j].compareTo(arr[minDex]) < 0){
					minDex = j;
				}
			}
			int tmp = indexArr[minDex];
			indexArr[minDex] = indexArr[i];
			indexArr[i] = tmp;

			String tmpStr = arr[minDex];
			arr[minDex] = arr[i];
			arr[i] = tmpStr;
		}
		return indexArr;

	}

	@Override
	public String [] sortString(String [] arr){
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int min_idx = i; 
			for (int j = i+1; j<n; j++) {
				if (arr[j].compareTo(arr[min_idx]) < 0){
					min_idx = j; 
				}
			}
			this.swap(arr, i, min_idx); 
		}
		return arr;
	}


	public void swap(int[] array, int i, int j) {
		int tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}


	public void swap (String [] array, int i, int j) {
		String tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
	}

}
