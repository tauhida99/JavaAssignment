import java.util.Scanner;

public class Sale{
    
    public  static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        double profit = 0.23;

        System.out.print("Enter the projected amount " );
        int amount = scanner.nextInt();

        double add = (profit * amount);
                System.out.print("The profit made from that amount is " + add);


    }
}