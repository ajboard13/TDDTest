package com.gc.demo;

/**
 * Created by user on 7/27/2017.
 */
public class BoomFizz {

    // accepts integer input values and returns "Boom" if the input is divisible by 7 or contains 7, otherwise return the input value
    private boolean checkSeven(int number) {
        int temp = number;
        for (int i = 0; i <= String.valueOf(number).length(); i++) {
            int numAtEnd = temp % 10;
            if (numAtEnd == 7) {
                return true;
            }
            temp = temp / 10;
        }
        return false;
    }

    public String boom(int number) {
        boolean containsSeven =checkSeven(number);

        if (number == 7 || number % 7 == 0 || containsSeven){
            return "Boom!";
        }
            return String.valueOf(number);
    }
}
