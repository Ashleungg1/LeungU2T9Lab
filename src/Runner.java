public class Runner {
    public static void main(String[] args) {
        // first circle with 5.0 radius
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1.getInfo());
        // first circle with new radius 9.2
        circle1.setRadius(9.2);
        System.out.println(circle1.getInfo());

        // my own test code : setting new radius for circle1
        circle1.setRadius(9.99);
        System.out.println(circle1.getInfo());
        // creating a new circle (circle2)
        Circle circle2 = new Circle(1.0);
        System.out.println(circle2.getInfo());
    }
}
