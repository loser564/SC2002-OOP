import java.util.Scanner;



public class Lab2p1 {
    public static void main(String[] args)
    {
    int choice;
    int m = 0;
    int n = 0;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Perform the following methods:");
        System.out.println("1: multiplication test");
        System.out.println("2: quotient using division by subtraction");
        System.out.println("3: remainder using division by subtraction");
        System.out.println("4: count the number of digits");
        System.out.println("5: position of a digit");
        System.out.println("6: extract all odd digits");
        System.out.println("7: quit");
        choice = sc.nextInt();
        switch (choice) {
            case 1: 
                mulTest();
                break;
            case 2: 
                System.out.print("Enter m: ");
                m = sc.nextInt();
                System.out.print("Enter n: ");
                n = sc.nextInt();
                int ans = divide(m,n);
                System.out.println(m + "/" +n + "=" + ans);
                

                break; 
            case 3: 
                System.out.print("Enter m: ");
                m = sc.nextInt();
                System.out.print("Enter n: ");
                n = sc.nextInt();
                int ans3 = modulus(m, n);
                System.out.println(m + "%" + n + "=" + ans3);
                break; 
            case 4:
                System.out.print("Enter n: ");
                n = sc.nextInt();
                int ans4 = countDigits(n);
                if (ans4 == 0){
                    System.out.println("Error input!!");
                }
                else{
                    System.out.println("count = " + ans4);
                
                }

                break;
            case 5:
                System.out.print("Enter n: ");
                n = sc.nextInt();
                System.out.print("Enter digit: ");
                int digit = sc.nextInt();
                int ans5 = position(n,digit);
                System.out.println("position: " + ans5);
                
                break; 
            case 6: 
                System.out.print("Enter n: ");
                long p = sc.nextLong();
                long ans6 = extractOddDigits(p);
                if(ans6 == 0){
                    System.out.println("Error input!!");
                }
                else{
                    System.out.println("oddDigits = " + ans6);
                }
            break; 
            case 7: 
                System.out.println("Program terminating ….");
                break;
                
            } 
        } while (choice != 7);
        sc.close();
        
    }
    
    public static void mulTest() {
        Scanner scannerMul = new Scanner(System.in);
        int correctAnswers = 0;
        
        for (int i = 0; i < 5; i++) {
            // Generate two random one-digit integers
            int num1 = (int) (Math.random() * 9) + 1; // Random integer between 1 and 9
            int num2 = (int) (Math.random() * 9) + 1;
    
            
            int correctAnswer = num1 * num2;
    
            // ask
            System.out.print("How much is " + num1 + " times " + num2 + "? ");
            int studentAnswer = scannerMul.nextInt();
    
            // check
            if (studentAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswers++;

            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }
        }
    
        // Print the number of correct answers
        System.out.println(correctAnswers + " answers out of 5 are correct.");
        
    }
    public static int divide(int m, int n){
        
        int divisions = 0;

        while (m >=n){
            m -=n;
            divisions ++;
        }
        
        return divisions; 
        
       

    }

    public static int modulus(int m, int n){
        int remainder = 0;

        if(m>=n){
            remainder = m - n;
            while (remainder > n){
                remainder = remainder-n;
            }
        }
        else{
            remainder = m;
        }
        
        return remainder;
    }

    public static int countDigits(int n){
        int digits = 0;

        if (n<0){
            digits = 0;
        }
        else{
            while (n >0){
                n = divide(n,10);
                digits ++;
            }
            
        }
        return digits;
    }

    public static int position(int n, int digit){
        int position = 1;
        int lastDigit = 0;

        while ( n> 0){
            lastDigit = n%10;
            if (lastDigit == digit){
                return position;
            }
            else{
                position ++ ;
                n = n/10;
            }
            
        }
        return -1;
        
    }

    public static long extractOddDigits(long n){
        long oddDigits = 0;
        long multiplier = 1; // keeps track of placement

        if(n>0){
            while (n>0){
                long lastDigit = n%10;
                if (lastDigit %2 != 0){
                    oddDigits += lastDigit * multiplier;
                    multiplier *=10;
                }

                n = n/10;
            }
            if (oddDigits == 0){
                return -1; 
            }

            return oddDigits;
        }
        else{
            return 0;
        }

    
}
}






