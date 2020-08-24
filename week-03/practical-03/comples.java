//Student name: Zhuofan ZHang
//Student ID: a1806522
import java.util.Scanner;
class ComplexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initialization the data1 for real and imaginary part
        System.out.println("the real part and the imaginary part of first complex number:");
        Complex data1 = new Complex();
        System.out.println("the real part and the imaginary part of second complex number:");
        Complex data2 = new Complex();
        System.out.println("a) Addition of the two complex numbers(add) ");
        System.out.println("b) Subtraction of the two complex numbers(sub)");
        System.out.println("c) Multiplication of the two complex numbers(multiplication) ");
        System.out.println("d) Division of the two complex numbers(division)");
        System.out.print("Option: ");
        char newChar = input.next().charAt(0);
        //use while loop to choose check the user input
        while(newChar =='a'){
            Complex result_add = data1.add(data2);
            result_add.print();
            break;
        }
        while(newChar =='b'){
            Complex result_sub = data1.sub(data2);
            result_sub.print();
            break;
        }
        while(newChar =='c'){
            Complex result_multiplication = data1.multiplication(data2);
            result_multiplication.print();
            break;
        }
        while(newChar =='d'){
            Complex result_division = data1.division(data2);
            result_division.print();
            break;
        }
    }
}
class Complex {
    //initialization the double for real and image
    double real = 0;
    double image = 0;
    //
    Complex() {
        //Reads a variable of type double.
        Scanner input = new Scanner(System.in);
        double real = input.nextDouble();
        double image = input.nextDouble();
        Complex(real, image);
    }
    //Calling properties in this class
    private void Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }
    //Calling properties in this class
    Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }
    //get the real part
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    //get the real image part
    public double getImage() {
        return image;
    }
    public void setImage(double image) {
        this.image = image;
    }
    //Addition of complex numbers
    Complex add(Complex x) {
        double real2 = x.getReal();
        double image2 = x.getImage();
        double newReal = real + real2;
        double newImage = image + image2;
        Complex result = new Complex(newReal, newImage);
        return result;
    }
    //Subtraction of complex numbers
    Complex sub(Complex x) {
        double real2 = x.getReal();
        double image2 = x.getImage();
        double newReal = real - real2;
        double newImage = image - image2;
        Complex result = new Complex(newReal, newImage);
        return result;
    }
    //Multiplication of complex numbers
    Complex multiplication(Complex x) {
        double real2 = x.getReal();
        double image2 = x.getImage();
        double newReal = real * real2 - image * image2;
        double newImage = image * real2 + real * image2;
        Complex result = new Complex(newReal, newImage);
        return result;
    }
    //Division of complex number
    Complex division(Complex x) {
        double real2 = x.getReal();
        double image2 = x.getImage();
        double newReal = (real * real2 + image * image2) / (real2 * real2 + image2 * image2);
        double newImage = (image * real2 - real * image2) / (real2 * real2 + image2 * image2);
        Complex result = new Complex(newReal, newImage);
        return result;
    }
    //use if else loop to determining the addition and subtraction of the imaginary part
    public void print() {
        if (image > 0) {
            System.out.println(real + " + " + image + "i");
        } else if (image < 0) {
            System.out.println(real + "" + image + "i");
        } else {
            System.out.println(real);
        }
    }
}