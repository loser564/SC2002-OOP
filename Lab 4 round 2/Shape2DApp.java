import java.util.ArrayList;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        System.out.println("Enter total number of shapes: ");
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        
        for(int i = 0; i < total; i++){
            System.out.println("Choose the shape (1:Circle, 2:Triangle, 3:Rectangle):");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the radius of the Circle:");
                    double radius = sc.nextDouble();
                    shapes.add(new Circle(radius));
                    break;
                case 2:
                    System.out.println("Enter the base of the Triangle:");
                    double base = sc.nextDouble();
                    System.out.println("Enter the height of the Triangle:");
                    double heightT = sc.nextDouble();
                    shapes.add(new Triangle(base, heightT));
                    break;
                case 3:
                    System.out.println("Enter the width of the Rectangle:");
                    double width = sc.nextDouble();
                    System.out.println("Enter the height of the Rectangle:");
                    double heightR = sc.nextDouble();
                    shapes.add(new Rectangle(width, heightR));
                    break;
                default:
                    System.out.println("Invalid choice.");
                
            }
        }
        System.out.println("Calculating total area...");
        double totalArea = 0;
        for(Shape shape: shapes){
            totalArea += shape.Area();   
        }
        System.out.println("Total area: " + totalArea);




    }

}