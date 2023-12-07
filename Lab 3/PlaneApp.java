import java.util.Scanner; 

public class PlaneApp {
    public static void main (String[] args){
        Plane plane = new Plane();

        int choice;
        int SeatID;
        int CustomerID;
        System.out.println("Enter the number of your choice");
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("(1) Show number of empty seats");
            System.out.println("(2) Show the list of emty seats");
            System.out.println("(3) Show the list of seats assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    plane.showNumEmptySeats();
                    break;
                case 2:
                    System.out.println("The following seats are empty: ");
                    plane.showEmptySeats();
                    break;
                case 3: 
                    boolean val = true;
                    System.out.println("The seat assignments are as follow: ");
                    plane.showAssignedSeats(val);
                    break;
                case 4:
                    val = false;
                    System.out.println("The seat assignments are as follow: ");
                    plane.showAssignedSeats(val);
                    break;
                case 5:
                    System.out.println("Assigning seat...");
                    System.out.print("Please enter SeatID: ");
                    SeatID = sc.nextInt();
                    System.out.print("Please enter Customer ID: ");
                    CustomerID = sc.nextInt();
                    plane.assignSeat(SeatID, CustomerID);
                    break;
                case 6:
                    System.out.print("Enter SeatID to unassign customer from: ");
                    SeatID = sc.nextInt();
                    plane.unassignSeat(SeatID);
                    break;
                default: 
                    break;

                    



            }

        }while(choice!=7);
    }
}
