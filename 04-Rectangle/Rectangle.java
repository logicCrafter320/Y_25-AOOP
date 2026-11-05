// 4. Calculate and display the area and perimeter of a rectangle.
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width cannot be negative.");
        }
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayMeasurements() {
        System.out.printf("Length    : %.2f%n", length);
        System.out.printf("Width     : %.2f%n", width);
        System.out.printf("Area      : %.2f%n", calculateArea());
        System.out.printf("Perimeter : %.2f%n", calculatePerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        rectangle.displayMeasurements();
    }
}
