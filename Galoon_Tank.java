import  java.util.Scanner;
 public class Galoon_Tank{

     public static void main(String [] args){

         Scanner keyboard = new Scanner(System.in);

         System.out.println("Enter the amount of galoon of gas : ");
         int galoon = keyboard.nextInt();

         System.out.println("Enter the no of miles per galoon : ");
         int miles = keyboard.nextInt();


        System.out.println("Enter the price of gas per galoon : ");
        int price = keyboard.nextInt();

        int travel = (mile * price);
        System.out.println("The mile the car can travel  with the gas is : ");
    
        int cost = (250 * travel);
        System.out.println("The  amount of cost is : " +cost);

        int car = (cost * 5);
        System.out.println("The cost of travelling for 5 cars  is " +car);




     }
 }