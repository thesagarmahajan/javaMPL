package JavaEight.FunctionalInterfaceAndLambda;
import java.util.Optional;


interface areas{
    public abstract Optional<Double> getArea(double ...nums);
}

class circle{
    private final double pi = 3.14;
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public Optional<Double> area(areas a){
        return a.getArea(this.radius);
    }
    
}

public class FunctionalInterfaceAndLambdaExample2 {

    public static void main(String[] args) {
        circle c1 = new circle(10);
        Optional<Double> areaOfCircle = c1.area((nums)->{
            if(nums.length==1){
                return Optional.ofNullable(c1.getPi()*nums[0]*nums[0]);
            }
            return Optional.empty();
        });
    }
}
