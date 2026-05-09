package tp_java;
public class TestShape {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle(5, 3);

        System.out.println("Rectangle -> Area: " +
                rect.area() +
                " | Perimeter: " +
                rect.perimeter());

        Circle circle = new Circle(4);

        System.out.printf(
                "Circle -> Area: %.2f | Perimeter: %.2f%n",
                circle.area(),
                circle.perimeter());
    }
}