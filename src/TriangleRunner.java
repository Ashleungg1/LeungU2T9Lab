public class TriangleRunner {
    public static void main(String[] args) {
        // creating two right triangle objects
        RightTriangle tri1 = new RightTriangle(3,4);
        RightTriangle tri2 = new RightTriangle(6.5,10.7);

        // storing their hypotenuses in variables
        double tri1hyp = tri1.hypotenuse();
        double tri2hyp = tri2.hypotenuse();

        System.out.println(tri1hyp + "\n" + tri2hyp);

        // my own tests
        RightTriangle tri3 = new RightTriangle(6,8);
        System.out.println(tri3.hypotenuse());
    }
}
