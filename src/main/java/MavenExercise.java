import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {

        System.out.println("Please enter a string");
        Scanner scn = new Scanner(System.in);
        String userInput = scn.nextLine();

        System.out.println("You Entered: " + userInput + ".");
        String userInputone = StringUtils.remove(userInput, ", ");
        boolean answer = StringUtils.isAlphaSpace(userInputone);
        if (answer){
            System.out.println(userInput + " is not a number.");
        } else {
            System.out.println(userInput + " contains a number");
        }
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));

    }
}
