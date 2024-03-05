package week8;

import java.util.Scanner;

public class IAm {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter sentences, . to end.");
        String sentence = keyboard.nextLine();
        String result = "The qualities are ";

        while (!sentence.equals(".")) {

            if (sentence.startsWith("I am ")){
                result = result + sentence.substring(5) + ", ";
            }
            sentence = keyboard.nextLine();
        } // End of the while loop
        System.out.println(result);



    } // End of the main method

} // End of the IAm class
