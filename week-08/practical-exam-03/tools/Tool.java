//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: your a1806522
// Semester:1
// Year:2020
// Practical Exam Number:3
//===================================

abstract class Tool implements Asset {

    float weight;
    float value;

//    Constructor
    Tool(float weight, float value) {
        this.weight = weight;
        this.value = value;
    }

//    Assessors
    @Override
    public float getValue() {
        return this.value;
    }

    public float getWeight() {
        return this.weight;
    }

    abstract void useTool(int n);
}

