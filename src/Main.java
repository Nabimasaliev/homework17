import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3,2,6);
        System.out.println("Perimeter of triangle: "+triangle.getPerimeter());

        Shape rectangle = new Rectangle(6,8);
        System.out.println("Perimeter of rectangle: "+rectangle.getPerimeter());

        Shape square = new Square(9);
        System.out.println("Perimeter of square: "+square.getPerimeter());

        Shape trapezoid = new Trapezoid(4,5,8,6);
        System.out.println("Perimeter of trapezoid: "+trapezoid.getPerimeter());


        Shape kite = new Kite(4,6);
        System.out.println("Perimeter of kite: "+kite.getPerimeter());
    }
}