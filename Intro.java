import calculations.ScientificCalculator;

class Intro{
    public static void main(String[] args) {
        ScientificCalculator calculate = new ScientificCalculator(); // Initialized the object
        int ans = calculate.addition(12, 34); // Use the object to access members
        // System.out.println(calculate.areaOfCircle(12.32));
        System.out.println(ans);
    }
}