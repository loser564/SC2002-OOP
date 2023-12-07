import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        // getting inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Starting: ");
        int startVal = scanner.nextInt();
        System.out.print("Ending: ");
        int endVal = scanner.nextInt();
        System.out.print("Increment: ");
        int incrementVal = scanner.nextInt();

        // error case
        if(startVal > endVal){
            System.out.println("Error input!!");
        }
        else{

        // exchange rate
        double exchangeRate = 1.82;

        

        // for loop
        // forming the table
        System.out.println("US$    S$");
        System.out.println("------------");
        for(int i=startVal; i<=endVal; i += incrementVal ){
            double sgd = i * exchangeRate;
            System.out.println(i + "      " + sgd);

        }
        
        //while loop
        // forming the table
        System.out.println("US$    S$");
        System.out.println("------------");

        int j=startVal;
        while (j<=endVal){
            
            double sgd = j * exchangeRate;
            System.out.println(j + "      " + sgd);
            j += incrementVal;

        }
        


        // do- while loop
        // do while loop executes code at least once 
        // before checking loop condition

        int k =startVal;
        System.out.println("US$    S$");
        System.out.println("------------");
        do{
            
            double sgd = k * exchangeRate;
            System.out.println(k + "      " + sgd);
            k += incrementVal;
        } while(k<=endVal);
        
    
    scanner.close();

    }
    
}
}



