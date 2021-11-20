import java.util.Scanner;
public class Difficult{

    public static void main(String [] args){

        Scanner mm = new Scanner(System.in);

        System.out.print("Input  first NO ");
        int x = mm.nextInt();

        System.out.print("Input second NO ");
        int y = mm.nextInt();

        int div = x / y ;
        int rem = x % y ;

        System.out.println("The quotient of these no is "+div + " \nThe remainder of these no is " +rem);
        

       
        

    
    }
}