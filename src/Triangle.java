public class Triangle extends Shape{

    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }
    @Override
    public double getPerimeter() {
        return getA()+getB()+getC();
    }
}
