package Abstraction;

// Makes the statement the class A (circle) is B (shape)
public abstract class Shape {

    String color;

    public abstract double area();
    public abstract String getDetails();

    public Shape(String newColor){
        this.color = newColor;
    }

    public String getColor(){
        return this.color;
    }

}
