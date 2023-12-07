public class PlaneSeat{
    private int seatID;
    private boolean assigned;
    private int customerID;


    public PlaneSeat(int seat_id){
        this.seatID = seat_id;
    }

    public int getSeatID(){
        return seatID;
    }
    public int getCustomerID(){
        return customerID;
    }
    public boolean isOccupied(){
        return assigned;
    }

    public void assign(int cust_id){
        assigned = true;
        customerID = cust_id;
    }

    public void unassign(){
        assigned = false;
        customerID = 0;

    }







}