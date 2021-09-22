package Encapsulation;

public class Circle {
    
    // 3.141592653589793238
    private double pi;

    public Circle(){
        System.out.println("Default Constructor");
        this.pi=3.14;
    }

    public Circle(double newpi){
        System.out.println("Parameterized Constructor");
        this.pi = newpi;
    }

    public double area(int r){
        return this.pi*r*r;
    }
}
