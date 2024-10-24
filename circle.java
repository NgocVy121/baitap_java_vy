/*
public class Main2 {
    private double radius;

    public Main2() {
        radius = 1.0;
    }

    public Main2(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
    public Object getCircumference(){
        return 2*radius*Math.PI;
    }
}
*/
public class circle {
    private double radius = 1.0;

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "circle[radius=" + radius + "]";
    }
}
