import java.util.Scanner;

public class Sale_Tax{

    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the amount of purchase : ");
        double purchase = keyboard.nextInt();

        System.out.println("The amount of purchase is : ");
        double amount = keyboard.nextdouble();

        double country = (purchase * 0.02);
        System.out.println("The Country sales tax is  : " +country);

        double state = ( purchase * 0.04);
        System.out.println("The state sales tax  is : " +state);

        double sales_tax = (country + state );
        System.out.println("The toal sales tax  is : " +sales_tax);

        double sale = (purchase + sales_tax);
        System.out.println("The total of the sale is : " +sale);



    }

    
}