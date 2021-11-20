import java.util.Scanner;
public class Temperature{

    public static void main(String [] args){

        Scanner temp = new Scanner(System.in);

        

        System.out.print("Enter the ceiciuos temp :");
        float C = temp.nextInt();
       
        double fahren = (9 / 5) *C  + 32 ;

        System.out.print("The fahrein height temp  is :" +fahren);


    }
}