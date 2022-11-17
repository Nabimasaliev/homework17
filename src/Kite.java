public class Kite extends Shape{

    public Kite(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return (getA()*2)+(getB()*2);
    }
}
