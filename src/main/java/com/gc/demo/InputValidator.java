package com.gc.demo;

import java.util.Scanner;

public class InputValidator {
    private boolean userCont;
    private int userInt;
    private Scanner input = new Scanner(System.in);


    public int getValidInt() {
        boolean validInt = false;
        do {
            if (input.hasNextInt()) {
                userInt = input.nextInt();
                validInt = true;
            } else {
                System.out.println("not an integer! Please enter an integer: ");
            }
            input.nextLine();
        }while (!validInt);
        return userInt;
    }


    private void checkForIntBetweenTwoNumbers(int minNumber, int maxNumber) {
        while (userInt < minNumber || userInt > maxNumber) {
            System.out.println("Not between "+ minNumber+" and "+maxNumber+"! Please enter an integer: ");
            getValidInt();
        }
    }

    public void checkForUserContinue(String message) {
        boolean validChoice = true;
        do {
            System.out.println(message);
            if (input.hasNextLine()) {
                String answer = input.next();
                validChoice = checkForValidChoice(answer);
            }
        } while (!validChoice);
        input.nextLine();
    }

    private boolean checkForValidChoice(String answer){
        boolean validChoice;
        if (answer.equalsIgnoreCase("y")) {
            userCont = true;
            validChoice = true;
        } else if (answer.equalsIgnoreCase("n")) {
            userCont = false;
            validChoice = true;
        } else {
            System.out.print("\nnot a valid choice! ");
            validChoice = false;
        }
        return validChoice;
    }


    public boolean isUserCont() {
        return userCont;
    }


}
