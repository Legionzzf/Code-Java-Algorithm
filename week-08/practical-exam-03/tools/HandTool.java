//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: your a1806522
// Semester:1
// Year:2020
// Practical Exam Number:3
//===================================

abstract class HandTool extends Tool {

    boolean sharp;

// Constructor
    HandTool(float weight, float value, boolean sharp) {
        super(weight, value);
        this.weight = weight;
        this.value = value;
        this.sharp = sharp;
    }


    public boolean isSharp(){
        return this.sharp;
    }


}