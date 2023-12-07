import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height: ");
        int height = scanner.nextInt();
        if(height<=0){
            System.out.println("Error input!!");

        }
        else{
            for(int i=0; i<height; i++){
                char ch = (i%2 == 0) ? 'A' : 'B';

                for(int j = 0; j<=i;j++){
                    
                    if (ch == 'A'){
                        ch = 'B';
                        System.out.print("AA");
                    }
                    else{
                        ch = 'A';
                        System.out.print("BB");
                    }
                }

                System.out.println();

            }

        }



        scanner.close();

    }

}
