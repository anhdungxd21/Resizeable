public class Program {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.getArea());
        circle.resize(100);
        System.out.println(circle.getArea());
    }
}
