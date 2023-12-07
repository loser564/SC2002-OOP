import java.util.ArrayList;
import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of shapes: ");
        int totalNum = sc.nextInt();
        
        for(int i = 0; i < totalNum; i++){
            System.out.println("Choose the shape (1:Sphere, 2:Cuboid, 3:Pyramid):");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the radius of the Sphere:");
                    double radius = sc.nextDouble();
                    shapes.add(new Sphere(radius));
                    break;
                case 2:
                    System.out.println("Enter the width of the Cuboid");
                    double width = sc.nextDouble();
                    System.out.println("Enter the height of the Cuboid");
                    double height = sc.nextDouble();
                    System.out.println("Enter the length of the Cuboid");
                    double length = sc.nextDouble();
                    shapes.add(new Cuboid(width, height, length));
                    break;
                case 3:
                    System.out.println("Enter the base length of the Pyramid:");
                    double baseLength = sc.nextDouble();
                    System.out.println("Enter the slant height of the Pyramid:");
                    double slantHeight = sc.nextDouble();
                    shapes.add(new Pyramid(baseLength, slantHeight));
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
