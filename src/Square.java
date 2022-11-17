public class Square extends  Shape{

    public Square(double a) {
        super(a);
    }

    @Override
    public double getPerimeter() {
        return getA()*4;
    }
}
