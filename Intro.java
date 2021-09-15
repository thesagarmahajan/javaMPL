class calculator{

    float pi = 3.14f;

    int addition(int num1,int num2){
        return num1+num2;
    }
    int subtraction(int num1,int num2){
        return num1-num2;
    }
    double areaOfCircle(double r){
        return pi*r*r;
    }
}
class Intro{
    public static void main(String[] args) {
        calculator calc = new calculator(); // Initialized the object
        int ans = calc.addition(12, 34); // Use the object to access members
        // System.out.println(calc.areaOfCircle(12.32));
        System.out.println(calc.pi);
        
        
    }
}

