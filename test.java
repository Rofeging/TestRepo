public class CircleCalculator {

    // Define a public static final constant for Pi
    public static final double PI = 3.14159;

    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = calculateArea(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}
