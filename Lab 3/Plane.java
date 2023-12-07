import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seats = new PlaneSeat[13];
    private int numEmptySeat;

    public Plane(){
        
        numEmptySeat = 12;
        for(int i=1; i<=12;i++){
            seats[i] = new PlaneSeat(i);
        }
        
    }
    private PlaneSeat[] sortSeats(){
        // sort by customer id
        PlaneSeat[] copiedSeats = Arrays.copyOf(seats,seats.length);
        Arrays.sort(copiedSeats, new custIDsort());
        return copiedSeats;
        

    }

    public void showNumEmptySeats(){
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats(){
        System.out.println("The following seats are empty: ");
        for(int i=1;i<=12;i++){
            if (!seats[i].isOccupied()){
                System.out.println("SeatID " + i);
            } 
        }
    }

    public void showAssignedSeats(boolean bySeatID) {
        if (bySeatID) {
            // Sort by seat id
            for (int i = 1; i <= 12; i++) {
                if (seats[i].isOccupied()) {
                    System.out.println("SeatID " + seats[i].getSeatID() + " assigned to CustomerID " +  seats[i].getCustomerID());
                }
            }
        } else {
            // Sort by customer id
            PlaneSeat[] temp = this.sortSeats();
            for (int i = 1; i <= 12; i++) {
                if (temp[i].isOccupied()) {
                    System.out.println("SeatID " + temp[i].getSeatID()  + " assigned to CustomerID " + temp[i].getCustomerID());
                }
            }
        }
    }

    public void assignSeat(int seatID, int custID){
        for (int i = 1;i<=12; i++){
            // if seat id is occupied
            if(seats[i].getSeatID() == seatID && seats[i].isOccupied() == true){
                System.out.println("Seat already assigned to a customer");
                break;
            }
            else if(seats[i].getSeatID() == seatID && seats[i].isOccupied() == false){
                seats[i].assign(custID);
                this.numEmptySeat --;
                System.out.println("Seat assigned! ");
                break;


            }
        }
        
    }

    public void unassignSeat(int seatID){
        for(int i = 1; i<=12; i++){
            if(seats[i].getSeatID() == seatID){
                seats[i].unassign();
                this.numEmptySeat++;
                System.out.println("Seat unassigned!");
                break;
            }
        }

        

    }




}

class custIDsort implements Comparator<PlaneSeat>{
    public int compare(PlaneSeat a, PlaneSeat b){
        if (a == null && b == null) {
            return 0;
        }
        if (a == null) {
            return -1;
        }
        if (b == null) {
            return 1;
        }
        return a.getCustomerID() - b.getCustomerID();
    }
}

