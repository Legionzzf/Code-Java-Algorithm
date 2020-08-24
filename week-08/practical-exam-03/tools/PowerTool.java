//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: your a1806522
// Semester:1
// Year:2020
// Practical Exam Number:3
//===================================

abstract class PowerTool extends Tool {
    int power;

// Constructor
    PowerTool(float weight, float value, int power) {
        super(weight, value);
        this.power = power;
    }

//    Assessors
    public int getPower() {
        return power;
    }

}

