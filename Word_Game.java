import java.util.Scanner;
public class Word_Game{

    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your NAME :");
        String name = keyboard.nextline();

        System.out.println("Enter your AGE : ");
        int age = keyboard.nextInt();

        System.out.println("Enter your CITY : ");
        Sting city = keyboard.nextline();

        System.out.println("Input the name of COLLEGE : ");
        String college = keyboard.nextline();

        System.out.println("Enter your PROFESSIONALITY : ");
        Sting professional = keyboard.nextLine();

        System.out.println("Input type of ANIMAL you like : ");
        String animal = keyboard.nextLine();

        System.out.println("Input the PETNAME  of animal : ");
        String pet = keyboard.nextLine();

        System.out.println(name+"Who live in " +city+ ". At the age of " +age+ " ," name+"Went to college at " +college+
                          " . "name+ "Graduated and went to work as a " +professional+ ". Then" +name+ "adopted " +animal+ "named" + pet+
                          "They both lived happily ever after 3 " );




    }
}
