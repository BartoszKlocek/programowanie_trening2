package spoj.exercise3;
/*
JZLICZ - Zliczacz liter

Koło Młodych Miłośników Łamania Szyfrów pracuje nad odszyfrowaniem pewnego starożytnego manuskryptu.
Jądrem systemu ma być samouczący się analizator tekstu, a jego pierwszym modułem ma być "zliczacz liter", którego opracowanie powierzono Tobie.

Opracuj program ZLI, który:
- wczyta ze standardowego wejścia tekst do analizy,
- dla każdej litery obliczy liczbę jej wystąpień w tekście,
- wypisze wynik na standardowe wyjście.
Wejście

W pierwszym wierszu N - liczba wierszy tekstu do analizy (N ≤ 150).
W każdym z następujących N wierszy ciąg złożony z maksymalnie 200 znaków spośród małych i wielkich liter alfabetu łacińskiego ('a'..'z', 'A'..'Z') oraz spacji.
Wyjście

W kolejnych wierszach litery od 'a' do 'z' i od 'A' do 'Z' w tej kolejności, a po każdej literze spacja i liczba wskazująca, ile razy ta litera wystąpiła w tekście.

Uwaga: Pomiń litery, które nie występują w tekście.
Przykład

Wejście:
2
ala ma kota
Ola ma psa

Wyjście:
a 7
k 1
l 2
m 2
o 1
p 1
s 1
t 1
O 1


 */


import java.util.ArrayList;
import java.util.List;

public class CountingLetters {

    public char[] getCharactersTab() {
        char[] tab1 = new char[52];
        char ch1 = 'A';
        char ch2 = 'a';
        for (int i = 0; i <= 25; i++) {
            tab1[i] = ch2;
            ch2++;
        }
        for (int i = 26; i <= 51; i++) {
            tab1[i] = ch1;
            ch1++;
        }
        return tab1;
    }

    public void countLetter(String txt) {
        char[] tab2 = txt.toCharArray();
        char[] tab1 = getCharactersTab();
        for (int i = 0; i < tab1.length; i++) {
            List<Character> list = new ArrayList<>();
            for (int j = 0; j < tab2.length; j++) {
                if (tab1[i] == tab2[j]) {
                    list.add(tab2[j]);
                }
            }
            if (list.size() != 0) {
                System.out.println(tab1[i] + " " + list.size());
            }
        }
    }


}
