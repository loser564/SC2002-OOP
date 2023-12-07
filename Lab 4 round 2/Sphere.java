public class Sphere implements Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }
    public double Area() 
    { return 4 * Math.PI * radius * radius; }

    public double Volume(){
        return 4/3 * Math.PI * radius * radius * radius;
    }
}
