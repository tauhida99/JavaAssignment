import java.util.Scanner;

public class Land_Calculation{

    public static void main(String [] args){
        
        Scanner calculate = new Scanner(System.in);

        System.out.println("Enter the total square feet  of land  : ");

        int trac = calculate.nextInt();
       
        int acre = 43560;

        int square = (trac / acre);

        System.out.println("The no of acres in the trac is : " + square) ;
        

    }
}