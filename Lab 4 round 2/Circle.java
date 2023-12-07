
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double Area() { return Math.PI * radius * radius; }
    public double Volume(){
        return 0;   
    }
}