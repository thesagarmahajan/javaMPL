package Polymorphism;

// Method Overloading
class areas{
    public double area(float r){
        return 3.14*r*r;
    }
    public int area(int l, int b){
        return l*b;
    }
}

class myareas extends areas{

    @Override
    public double area(float r){
        return r*r;
    }
    
}

public class PolymorphismExample {
    public static void main(String[] args) {
        areas ar = new areas();
        System.out.println(ar.area(1.3f));
        System.out.println(ar.area(10, 12));

        myareas mar = new myareas();
        System.out.println(mar.area(1.3f));
    }
}
