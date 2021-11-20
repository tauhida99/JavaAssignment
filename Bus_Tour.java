import java.util.Scanner;
 public class Bus_Tour{

     public static void main(String [] args){

         Scanner scanner = new Scanner(System.in);

         System.out.println("Input the no of participants : ");
         int participant = scanner.nextInt();

         int revenue = (participant * 2500);

         System.out.println("The revenue company will generate for the tour is : " +revenue);

        
     }
 }