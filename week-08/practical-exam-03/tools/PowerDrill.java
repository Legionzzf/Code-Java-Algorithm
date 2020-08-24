//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: your a1806522
// Semester:1
// Year:2020
// Practical Exam Number:3
//===================================

public class PowerDrill extends PowerTool {

// Constructor
    PowerDrill(float weight, float value){
        super(weight,value,800);
    }

    @Override
    void useTool(int n) {
        this.value -= n*0.03;
        if (this.value < 0){
            this.value = 0;
        }
        System.out.println("Zssh!");
    }
}
