import java.util.Scanner;
public class Simple{
    public static void main(String [] args){

    Scanner variable = new Scanner(System.in);

    System.out.print("Enter the first name ");
    String first = variable.nextLine();

    System.out.print("Enter the last name ");
    String last = variable.nextLine();

    System.out.print("Input the age in year ");
    int age = variable.nextInt();

    System.out.println("Welcome " +first+ " "  +last+ ", You are "+age +" second old");
    
    }
}