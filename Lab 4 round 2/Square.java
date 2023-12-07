public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    public double Area() {
        return side * side;
    }

    public double Volume(){
        return 0;   
    }

    

}
