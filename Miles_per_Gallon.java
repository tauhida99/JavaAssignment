import java.util.Scanner;

public class Miles_per_Gallon{

    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the no of miles driven  : ");
        int miles = keyboard.nextInt();

        System.out.println("Enter the no of gallon of gas : ");
        int gallon = keyboard.nextInt();

        int MPG = (miles / gallon);
        System.out.println("The car's MPG  is  : " +MPG);
    }


}