import java.util.Scanner;
public class Easy{

    public static void main(String [] args){

        String last;

        Scanner information = new Scanner(System.in);

        System.out.print("Enter your first name ");
       String first =  information.next();

        System.out.print("Enter your last name ");
        last = information.next();

        System.out.println("Welcome " + first " " + last);
    }
}