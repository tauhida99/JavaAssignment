import java.util.Scanner;

public class Total_Purchase{

    public static void main(String [] args){

        int item1 ;
        int item2 ;
        int item3 ;
        int item4 ;
        int item5 ;

        Scanner price = new Scanner(System.in);

        System.out.print("Enter  the price of \n"+item1+  "Enter the price of  \n " +item2 + "Enter the price of \n" +item3 + 
        "Enter the price of \n " +item4 + "Enter the price of  \n " +item5 );

        scanner = price.nextInt();
       
        int subtotal = (item1 + item2 + item3 + item4 + item5);

        System.out.println("The sum of the sale price is : " +subtotal);


        float sale_tax = 0.06;

        System.out.println("The amount of sale tax is : " +sale_tax );

        int tax = (subtotal * 0.06);

        System.out.println("The total purchase is  : " +tax);






    }
}