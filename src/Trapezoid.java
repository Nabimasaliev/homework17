public class Trapezoid extends Shape{

    private double d;

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public Trapezoid(double a, double b, double c, double d) {
        super(a, b, c);
        this.d=d;
    }

    @Override
    public double getPerimeter() {
        return getA()+getB()+getC()+getD();
    }
}
