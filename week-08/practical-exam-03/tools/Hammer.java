//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: your a1806522
// Semester:1
// Year:2020
// Practical Exam Number:3
//===================================

public class Hammer extends HandTool {

// Constructor
    Hammer(float weight, float value){
        super(weight,value,false);
    }

    @Override
    void useTool(int n) {
        this.value -= n*0.01;
        if (this.value < 0){
            this.value = 0;
        }
        System.out.println("Bang!");
    }
}

