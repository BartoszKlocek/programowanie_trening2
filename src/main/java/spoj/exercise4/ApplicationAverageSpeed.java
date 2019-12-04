package spoj.exercise4;

/*
VSR - Predkość średnia

Pociąg z miejscowości A do B jedzie z prędkością v1, a wraca z miejscowości B do A z prędkością v2.
Obliczyć średnią prędkość na całej trasie. Uwaga: Dane wejściowe będą tak dobrane, aby wynik był liczba całkowitą.
Wejście

Na wejściu znajduje się dokładnie jedna liczba całkowita t (1<=t<=1000) oznaczająca liczbę zestawów danych.
W wierszach od 2 do t+1 znajdują się dwie liczby całkowite oddzielone spacja v1 oraz v2 (1<=v1,v2<=10000).
Wyjście

Wyjście składa się z t wierszy. W każdym wierszu powinna znaleźć się dokładnie jedna liczba całkowita oznaczająca średnią prędkość.
Przykład

Wejście:
2
50 50
60 40

Wyjście:
50
48


 */

import java.util.Scanner;



public class ApplicationAverageSpeed {

    public static void main(String[] args) {
        AverageSpeed averageSpeed = new AverageSpeed();
        Scanner sc = new Scanner(System.in);
        Scanner scTxt = new Scanner(System.in);
        String txt = "4343 3434";
        String[] tab = txt.split(" ");

        System.out.println("Input:");
        int t;
        do {
            t = sc.nextInt();
        }
        while (t<1 || t>1000);
        int[] tab2 = new int[t];
        for (int i=0 ; i<t; i++){
          String txt1 =   scTxt.nextLine();
          String[] tab1 = txt1.split(" ");
          int a = Integer.valueOf(tab1[0]);
          int b = Integer.valueOf(tab1[1]);
          int c = averageSpeed.getAverageSpeed(a,b);
          tab2[i]=c;
        }

        System.out.println("Output:");
        for (int j = 0; j<t ; j++){
            System.out.println(tab2[j]);
        }

    }



}
