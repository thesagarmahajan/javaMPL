package Abstraction;

public class Circle extends Shape implements Wheel{

    private float radius;

    public Circle(String newColor, float newRadius) {
        super(newColor);
        this.radius = newRadius;
        //TODO Auto-generated constructor stub
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 3.14*this.radius*this.radius;
    }

    @Override
    public String getDetails() {
        // TODO Auto-generated method stub
        return "This is the circle having color: "+super.getColor()
        +" And radius: "+this.radius;
    }

    @Override
    public void roll(int rotations) {
        // TODO Auto-generated method stub
        System.out.println("Rolled and travelled distance= "+2*3.14*this.radius*rotations);
        
    }

    
}
