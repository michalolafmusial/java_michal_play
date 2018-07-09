public class Triangle implements Figure{

    private double cathetus1;
    private double cathetus2;


    public double getCathetus1() {
        return cathetus1;
    }

    public void setCathetus1(double cathetus1) {
        this.cathetus1 = cathetus1;
    }

    public double getCathetus2() {
        return cathetus2;
    }

    public void setCathetus2(double cathetus2) {
        this.cathetus2 = cathetus2;
    }

    public double Perimeter() {
        return getCathetus1()+getCathetus2()+Math.sqrt(Math.pow(getCathetus1(),2)+Math.pow(getCathetus2(),2));
    }

    public double Area() {
        return getCathetus1()*getCathetus2()/2;
    }
}
