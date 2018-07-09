public class Main {
    public static void main(String[] args) {

        System.out.println("Interfaces");

        System.out.println("");

        System.out.println("Triangle");
        Triangle triangle = new Triangle();
        triangle.setCathetus1(2);
        triangle.setCathetus2(4);
        System.out.println("Triangle perimeter: "+triangle.Perimeter());
        System.out.println("Triangle area: "+triangle.Area());

        System.out.println("");

        System.out.println("Circle");
        Circle circle = new Circle();
        circle.setRadius(4.5);
        System.out.println("Circle perimeter: "+circle.Perimeter());
        System.out.println("Circle area: "+circle.Area());
    }
}
