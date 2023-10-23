import java.text.DecimalFormat;
import java.util.Random;
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

        DecimalFormat df = new DecimalFormat("####0.0000"); // this is for formatting the double result to 4 decimal places

        System.out.println("Your weight on Earth is: " + df.format(dblResultMpala) + "kg.\nYour weight on Mars is : "+ dblResultMpala + "kg");

        // cast the double result to Int
        intResultMpala = (int) dblResultMpala;
        System.out.println("\n\nThe result when cast to Int is : " + intResultMpala + "kg");

        // cast the 'intResultMpala' to a char type
        charResultMpala = (char) intResultMpala;
        System.out.println("\n\nThe result when the Integer above is cast to a Char is : " + charResultMpala);

        // add the 'charResultMpala' with a random number

        while(true){
            // generate a random number
            Random rdm = new Random();
            int rdmNum = rdm.nextInt(50);

            if ((rdmNum + charResultMpala) <= 128){
                intFinalMpala = rdmNum + charResultMpala;
                System.out.println("The result with arithmetic operations applied is : " + intFinalMpala);
                break;
            }

        }

    }
}