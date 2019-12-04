package spoj.exercise3;

import java.util.Scanner;

public class ApplicationCountingLetters {
    public static void main(String[] args) {
        CountingLetters obj1 = new CountingLetters();
        Scanner scTxt = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        System.out.println("Input:");
        String txt = " ";
        int testsAmount = scInt.nextInt();
        for (int i = 1; i<=testsAmount ; i++){
            String txtInput = scTxt.nextLine();
            txt = txt + txtInput;

        }
        obj1.countLetter(txt);

    }
}
