import java.util.Scanner;

public  class Distance_Traveled{

    public static void main(String [] args){

    Scanner distance = new Scanner(System.in);
    
    int time;

    System.out.println("Enter the time :" );
    int mm =  distance.nextInt();


    int mile =  (60 * mm);

    System.out.println("The distance the car will travel is :" +mm+ " " +mile );

    int kk = distance.nextInt();

    }
}