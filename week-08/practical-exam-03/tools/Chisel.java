//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: your a1806522
// Semester:1
// Year:2020
// Practical Exam Number:3
//===================================

public class Chisel extends HandTool {

// Constructor
    Chisel(float weight, float value){
        super(weight,value,true);
    }

    @Override
    void useTool(int n) {
       this.value -= n*0.02;
        if (this.value < 0){
            this.value = 0;
        }
        System.out.println("Scrape");
    }
}
