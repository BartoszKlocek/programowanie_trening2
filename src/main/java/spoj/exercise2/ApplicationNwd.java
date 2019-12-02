package spoj.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ApplicationNwd {
    public static void main(String[] args) {
        NwdHelper nwdHelper = new NwdHelper();
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        System.out.println("Input:");
        int amountTests = scInt.nextInt();
        int[] tab1 = new int[amountTests];
        for (int i = 0; i < amountTests; i++) {
            String txt = scString.nextLine();
            String[] tab = txt.split(" ");
            int a = Integer.valueOf(tab[0]);
            int b = Integer.valueOf(tab[1]);
            int c = nwdHelper.getNwd(a, b);
            tab1[i] = c;
        }
        System.out.println("Output:");
        for (int j = 0; j < amountTests; j++) {
            System.out.println(tab1[j]);
        }
    }
}