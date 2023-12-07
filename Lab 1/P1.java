import java.util.Scanner;


public class P1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a choice: ");
        char choice = scanner.next().charAt(0);

        choice = Character.toUpperCase(choice);

        switch(choice){

            case 'A': 
                System.out.println("Action movie fan");
                break;

            case 'C':
                System.out.println("Comedy movie fan");
                break;

            case 'D':
                System.out.println("Drama movie fan");
                break;

            default:
                System.out.println("Invalid choice");
                break;

    }
    scanner.close();
}
}