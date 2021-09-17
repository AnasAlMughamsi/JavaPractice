import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {

        ArrayList<String> emailIDs = new ArrayList<>();

        emailIDs.add("FirstEmail@gmail.com");
        emailIDs.add("SecondEmail@gmail.com");
        emailIDs.add("ThridEmail@gmail.com");
        emailIDs.add("FourthEmail@gmail.com");
        emailIDs.add("FivthEmail@gmail.com");
        emailIDs.add("FristEmail@hotmail.com");
        emailIDs.add("SecondEmail@hotmail.com");
        emailIDs.add("ThirdEmail@hotmail.com");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the email you want to search for: ");
        String userInput = input.nextLine();

        boolean found = false;
        while (!found) {
            for (int i = 0; i < emailIDs.size(); i++) {
                if (userInput.equals(emailIDs.get(i))) {
                    System.out.println("That's the email you looking for: " + emailIDs.get(i));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Sorry, we cannot find the email... please try again");
                userInput = input.nextLine();
            }

        }

    }
}

