/*==================================
Foundations of Computer Science
Student: Zhuofan Zhang
id: a1806522
Semester:1
Year:2020
Practical Exam Number:5
===================================*/
class Student {
    public String name;
    public int age;
    public int period;
    //Basic Constructor

    public Student(){
        this.name = "unknown";
        this.age = 0;
        this.period = 0;
    }
    //constructor with all parameters
    public Student(String tmpName, int tmpAge, int tmpPeriod){
       this.name = tmpName;
       this.age = tmpAge;
       this.period = tmpPeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
