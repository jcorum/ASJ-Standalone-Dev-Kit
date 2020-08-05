public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! My name is JGC.");
        System.out.println("2+7");
        System.out.println(2+7);
        System.out.println(2>7);
        double num = 7/4.0;
        System.out.println(num);

        Point a = new Point(3,4);
        System.out.println(a.getX() + a.getY());
        System.out.println("x = " + a.getX() + " and y = " + a.getY());
        System.out.println("x + y = " + (a.getX() + a.getY()));
        System.out.println(a);
        System.out.println(a.getQuadrant());
        System.out.println(a.distanceFromOrigin());



    }

}