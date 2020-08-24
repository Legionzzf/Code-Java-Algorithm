//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Exam Number:2
//===================================
public class Calculator{
		//sum
		public int sum(int numA, int numB){
			// calculate the sum of numA & numB;
			int sum = numA + numB;
			// return the result;
			return sum;
		}

		//sum;
		public int sub(int numA, int numB){
			int sub = numA - numB;
			return sub;
		}

		//multiply
		public float multiply(float numA, float numB){
			float multiply = numA * numB;
			return multiply;
		}

		//division
		public float division(float numA, float numB){
			if (numB == 0) {
				return -99;
			}else {
				float division = numA / numB;
				return division;
			}
		}
}
