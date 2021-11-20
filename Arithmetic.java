import java.util.Scanner;
public class Arithmetic{
    public static void main(String [] args){
        int first;
        int second;
        
        Scanner operator = new Scanner(System.in);
        
        System.out.print("Input the first no");
         first = operator.nextInt();
       
        System.out.print("Input second no ");
         second = operator.nextInt();
        int add = first + second;
        int pro = first * second;
        int diff = first - second;
        int quot = first / second;

        
        System.out.print("The sum of two no is :" + add + "\nThe product of two no is : " +pro +"\nThe difference of two no is :"+diff + 
                          "The quotient of two no is : " +quot);
        
       
    } 
}