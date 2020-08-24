//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang   
// id: your a1806522
// Semester:1
// Year:1
// Practical Number: Practical-05: Sorting Algorithms and Recursion Practice
//===================================
public class Student {
    private String name;
    private int physic;
    private int chemistry;
    private int math;
    private int average;

    // Default  Constructor
    Student(){}

    // Parametric  Constructor
    Student(String name, int physic, int chemistry, int math){
        this.name = name;
        this.physic = physic;
        this.chemistry = chemistry;
        this.math = math;
        this.average = (int)Math.round((physic+chemistry+math)*1.0/3);
    }

    // Sorting students in descending order through quick sort method
    public Student[] sortStudents(Student[] students){
        int size = students.length;
        if (size <= 1){
            return students;
        }else {
            // Creating pivot and set last element to it
            Student pivot = students[size-1];
            // Getting smaller array and recursing it
            Student[] smallerArray = getSmallerArray(students, pivot);
            smallerArray = sortStudents(smallerArray);
            // Getting smaller array and recursing it
            Student[] biggerArray = getBiggerArray(students,pivot);
            biggerArray = sortStudents(biggerArray);
            // Merging smaller pivot and bigger array
            return mergeArray(smallerArray, pivot, biggerArray);
        }
    }

    // Comparing other elements with pivot and put smaller elements in array
    private Student[] getSmallerArray(Student[] array, Student pivot) {

        int size = array.length;
        int count = 0;
        for (int i = 0; i < size; i++){
            // Comparing with pivot to find how many smaller elements to definition smaller array size
            if (compareStudentRanking(array[i],i, pivot,array.length-1) == 1){
                count++;
            }
        }
        // Creating smaller array
        // Comparing with pivot to find smaller one and adding in smaller array
        Student[] subArray = new Student[count];
        int j = 0;
        for (int i = 0; i < size; i++){
            if (compareStudentRanking(array[i],i, pivot,array.length-1) == 1){
                subArray[j] = array[i];
                j++;
            }

        }
        return subArray;
    }

    // Comparing other elements with pivot and put bigger elements in array
    private Student[] getBiggerArray(Student[] array, Student pivot) {

        int size = array.length;
        int count = 0;
        for (int i = 0; i < size; i++){
            // Comparing with pivot to find how many bigger elements to definition bigger array size
            if (compareStudentRanking(array[i],i, pivot,array.length-1) == -1){
                count++;
            }
        }
        // Creating bigger array
        // Comparing with pivot to find bigger one and  adding in bigger array
        Student[] subArray = new Student[count];
        int j = 0;
        for (int i = 0; i < size; i++){
            if (compareStudentRanking(array[i],i, pivot,array.length-1) == -1){
                subArray[j] = array[i];
                j++;
            }

        }
        return subArray;
    }

    // Merging smaller pivot and bigger array
    private Student[] mergeArray(Student[] smallerArray, Student pivot, Student[] biggerArray) {
        Student[] mergeArr = new Student[smallerArray.length+biggerArray.length+1];
        int j = 0;
        // From bigger to smaller to add in final array
        for (Student i : biggerArray){
            mergeArr[j] = i;
            j++;
        }
        mergeArr[j] = pivot;
        j++;

        for (Student i : smallerArray){
            mergeArr[j] = i;
            j++;
        }

        return mergeArr;
    }

    // Comparing students' grade and name
    private int compareStudentRanking(Student st1,int st1Idx, Student st2, int str2Idx) {
        int result = 0;
        result = compareElements(st1.average, st2.average, true);
        if (result == 0){
            // If their  average marks are the same, sorting their Physics marks in the descending order
            result = compareElements(st1.physic, st2.physic, true);
            if (result == 0){
                // If their Physics marks are the same, sorting their Chemistry marks in the descending order
                result = compareElements(st1.chemistry, st2.chemistry, true);
                if (result == 0) {
                    // If their  Chemistry marks are the same, sorting their Math marks in the descending order
                    result = compareElements(st1.math, st2.math, true);
                    if (result == 0){
                        // If their  Math marks are the same, sorting their name  in the ascending order
                        result = compareStrings(st1.name,st1Idx,st2.name,str2Idx);
                    }
                }
            }
        }
        return result;
    }
    

    // Comparing students' name
    private int compareStrings(String str1,int str1Idx, String str2,int str2Idx){
        int result = 0;
        int l1 = str1.length();
        int l2 = str2.length();
        // Finding the shortest length
        int l = Math.min(l1, l2);
        // Comparing char one by one
        for (int i = 0; i < l; i++){
            result = compareElements(str1.charAt(i),str2.charAt(i),false);
            if (result == 1){
                break;
            }
        }
        // If two string is equal within the shortest length
        // Comparing which one is longer
        if (result == 0){
            // Comparing their index whether is different
            if (str1Idx != str2Idx)
            result = l1 <= l2? -1 : 1;
        }

        return result;
    }

    // Compare two element to get sequence direction
    private int compareElements(int a, int b, boolean isDescending) {
        if (a == b){
            return 0;
        }else if(a < b) {
            if (isDescending) {
                return 1;
            }else {
                return -1;
            }
        }else {
            if (isDescending) {
                return -1;
            }else {
                return 1;
            }
        }
    }


    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setPhysic(int physic) {
        this.physic = physic;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public int getPhysic() {
        return physic;
    }

    public int getChemistry() {
        return chemistry;
    }

    public int getMath() {
        return math;
    }

    public int getAverage() {
        return average;
    }
}
