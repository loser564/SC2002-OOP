public class Cuboid implements Shape{
    private double width;
    private double height;
    private double length;


    public Cuboid(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double Area(){
        return 2 * (width * height + height * length + width * length);
    }

    public double Volume(){
        return width * height * length;
    }

}