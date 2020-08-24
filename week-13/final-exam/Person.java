//==================================
// Foundations of Computer Science
// Student: Zhuofan Zhang
// id: a1806522
// Semester:1
// Year:2020
// Practical Number:Final
//===================================
public class Person {
    String name;
    int age;

    public Person(){
        this.name = "anon";
        this.age = -1;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
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
    public String toString() {
        return "Person:"+" "+name+" "+"is age:"+" "+age;
    }
}
