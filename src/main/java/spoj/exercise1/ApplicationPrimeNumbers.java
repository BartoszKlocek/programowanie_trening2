package spoj.exercise1;

import java.util.Scanner;
/*
PRIME_T - Liczby Pierwsze
Sprawdź, które spośród danych liczb są liczbami pierwszymi
Input
n - liczba testów n<100000, w kolejnych liniach n liczb z przedziału [1..10000]
Output
Dla każdej liczby słowo TAK, jeśli liczba ta jest pierwsza, słowo: NIE, w przeciwnym wypadku.
Example
Input:
3
11
1
4
Output:
TAK
NIE
NIE



 */


public class ApplicationPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeNumbersTask primeNumbersTask = new PrimeNumbersTask();

        System.out.println("Input:");
        int testsAcount = sc.nextInt();
        int number;
        int[] tab1 = new int[testsAcount];
        for (int i = 0; i < testsAcount; i++) {
            number = sc.nextInt();
            tab1[i] = number;
        }
        System.out.println("Output:");

        for (int j = 0; j < testsAcount; j++) {
            System.out.println(primeNumbersTask.isPrimeOrNot(tab1[j]));
        }
    }
}
