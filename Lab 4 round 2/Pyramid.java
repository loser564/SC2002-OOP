public class Pyramid implements Shape {
    private double baseLength;
    private double slantHeight;
    private double height;

    public Pyramid(double baseLength, double slantHeight) {
        this.baseLength = baseLength;
        this.slantHeight = slantHeight;
    }

    public double Area() {
        return baseLength * baseLength + 2 * baseLength * slantHeight;
    }

    public double Volume() {
        return 1/3 * baseLength * baseLength * height;
    }

}
