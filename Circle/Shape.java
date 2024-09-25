package Circle;

public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        Circle circle2 = new Circle(14, "blue");

        Square square = new Square(5, "red");
        Square square2 = new Square(14, "blue");

        Rectangle rectangle = new Rectangle(5, 10, "red");
        Rectangle rectangle2 = new Rectangle(14, 20, "blue");

        System.out.println("Circle 1");
        System.out.println("---------");
        System.out.println("Circle 1 Area: " + circle.getArea());
        System.out.println("Circle 1 Color: " + circle.getColor());
        System.out.println("Circle 1 Radius: " + circle.getRadius());
        System.out.println();

        System.out.println("Circle 2");
        System.out.println("---------");
        System.out.println("Circle 2 Area: " + circle2.getArea());
        System.out.println("Circle 2 Color: " + circle2.getColor());
        System.out.println("Circle 2 Radius: " + circle2.getRadius());
        System.out.println();

        System.out.println("Square 1");
        System.out.println("---------");
        System.out.println("Square 1 Area: " + square.getArea());
        System.out.println("Square 1 Color: " + square.getColor());
        System.out.println("Square 1 Side: " + square.getSide());
        System.out.println();

        System.out.println("Square 2");
        System.out.println("---------");
        System.out.println("Square 2 Area: " + square2.getArea());
        System.out.println("Square 2 Color: " + square2.getColor());
        System.out.println("Square 2 Side: " + square2.getSide());
        System.out.println();

        System.out.println("Rectangle 1");
        System.out.println("---------");
        System.out.println("Rectangle 1 Area: " + rectangle.getArea());
        System.out.println("Rectangle 1 Color: " + rectangle.getColor());
        System.out.println("Rectangle 1 Length: " + rectangle.getLength());
        System.out.println("Rectangle 1 Width: " + rectangle.getWidth());
        System.out.println();

        System.out.println("Rectangle 2");
        System.out.println("---------");
        System.out.println("Rectangle 2 Area: " + rectangle2.getArea());
        System.out.println("Rectangle 2 Color: " + rectangle2.getColor());
        System.out.println("Rectangle 2 Length: " + rectangle2.getLength());
        System.out.println("Rectangle 2 Width: " + rectangle2.getWidth());

    }
}
