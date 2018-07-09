public class Circle implements Figure{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Perimeter() {
        return 2*Math.PI*getRadius() ;
    }

    public double Area() {
        return Math.PI*Math.pow(getRadius(),2);
    }
}
