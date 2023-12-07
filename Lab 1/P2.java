import java.util.Scanner;

public class P2 {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    // salary 
    System.out.print("Enter salary: ");
    
    String dollarSalary = scanner.nextLine();
    // removing $ sign
    String salaryString = dollarSalary.replace("$", "");

    // convert string to integer
    int salary = Integer.parseInt(salaryString);

    // merit score
    System.out.print("Enter merit score: ");
    int merit = scanner.nextInt();

    // if else loop
    // System.out.println("I reach here. ");
    if (salary>600 && salary <649){
        if(merit<10){
            System.out.println("Grade C");
            
        }
        else{
            System.out.println("Grade B");
            
        }
    }

    else if(salary>499 && salary<649){
        System.out.println("Grade C");
    }

    else if(salary>700 && salary<799){
        if(merit<20){
            System.out.println("Grade B");
        }

        else{
            System.out.println("Grade A");
        }
    }

    else if(salary>799 && merit>20){
        System.out.println("Grade A");
    }


    
    scanner.close();
    






    
}
}
