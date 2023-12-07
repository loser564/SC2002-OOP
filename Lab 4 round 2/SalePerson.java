
public class SalePerson implements Comparable<SalePerson>{
	private String firstName;
	private String lastName;
   	private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales){
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }   
	@Override
    public String toString(){
        return firstName + " " + lastName + " " + totalSales;
    }
	@Override
    public boolean equals(Object obj){
        if(obj instanceof SalePerson){
            SalePerson other = (SalePerson) obj;
            return firstName.equals(other.firstName) && lastName.equals(other.lastName);
        }
        return false;
    }
	@Override
    public int compareTo(SalePerson other){
    	int salesCompare = Integer.compare(other.totalSales, this.totalSales);
	if(salesCompare != 0){
		return salesCompare;
	}
	else{
		return this.lastName.compareTo(other.lastName);		
	    }
	}

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getTotalSales(){
        return totalSales;
    }
}