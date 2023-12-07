import java.util.Scanner;
public class Strings{
	public static void main(String[] args){
		insertionSorting();
	}
	
    	private static void insertionSorting() {
        	String[] strList;
        	int size;
        	Scanner scan = new Scanner(System.in);
        	System.out.print("\nHow many strings do you want to sort? ");
        	size = scan.nextInt();
        	strList = new String[size];
        	System.out.println("\nEnter the Strings...");
        	for (int i = 0; i < size; i++) {
            		strList[i] = scan.next();
        	}
        	// change to insertion sort
        	Sorting.insertionSort(strList);
        	System.out.println("\nYour strings in sorted order...");
        	for (int i = 0; i < size; i++) {
            		System.out.print(strList[i] + " ");
        	}
        	System.out.println();
    	}
}