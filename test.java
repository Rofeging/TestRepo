public class CircleCalculator {

    // Define a public static final constant for Pi
    public static double PI = 3.14159;

    public static String BAD_FIELD = "This should be final";
    public static String BAD_FIELD2 = "This should be final";
    public static String BAD_FIELD3 = "This should be final";
    public static String BAD_FIELD4 = "This should be final";

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
