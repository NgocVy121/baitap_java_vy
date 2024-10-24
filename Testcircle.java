public class Testcircle {
    public static void main(String[] args) {

        circle c1 = new circle(1.1);
        System.out.println(c1);
        circle c2 = new circle();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());

        System.out.println("area is: " + c1.getArea());
        System.out.println("circumference is: " + c1.getCircumference());
    }
}


