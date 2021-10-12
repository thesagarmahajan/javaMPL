package JavaEight.FunctionalInterfaceAndLambda;
import java.util.Optional;

interface area{
    public abstract Optional<Double> getArea(double ...nums);
}

public class FunctionalInterfaceAndLambdaExample {
    public static void main(String[] args) {

        area circle = (nums)->{
            if(nums.length==1){
                return Optional.ofNullable(3.14*nums[0]*nums[0]);
            }
            return Optional.empty();
        };

        area rectangle = (nums) -> {
            if(nums.length==2){
                return Optional.ofNullable(nums[0]*nums[1]);
            }
            return Optional.empty();
        };

        Optional<Double> areaOfCircle = circle.getArea();
        Optional<Double> areaOfRectangle = rectangle.getArea(12,34);

        System.out.println(areaOfCircle.isPresent() ? "Area of circle: "+areaOfCircle.get() : "SOME ERROR");
        System.out.println(areaOfRectangle.isPresent() ? "Area of rectangle: "+areaOfRectangle.get() : "SOME ERROR");
        
        // Alternative to ternary operater
        /* if(areaOfCircle.isPresent()){
            System.out.println("Area of circle: "+areaOfCircle.get());
        }
        else{
            System.out.println("SOME ERROR");
        } */

    }



}
