package Abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Circle c1 = new Circle("RED", 5.7f);
        System.out.println(c1.area());
        System.out.println(c1.getDetails());
        System.out.println(c1.getColor());
        c1.roll(10);
    }
}
