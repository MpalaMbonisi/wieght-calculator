import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException{

        Scanner scr = new Scanner(System.in);// create a Scanner object
        // ask user for their wieght on earth
        System.out.println("Please enter your weight on Earth -- {and press enter} :");

        // declaring all variables
        float weightMpala = scr.nextFloat();
        double dblResultMpala;
        int intResultMpala, intFinalMpala;
        char charResultMpala;

        // operations
        dblResultMpala = weightMpala * .38; // calculating user weight in Mars

        System.out.println("Your weight on Earth is: " + weightMpala + "kg.\nYour weight on Mars is : "+ dblResultMpala + "kg");
    }
}