package spoj.exercise3;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CountingLettersTest {


    @Test
    public void getLettersTabTest(){
        //given
        CountingLetters countingLetters = new CountingLetters();
        char[] tab = countingLetters.getCharactersTab();
        //System.out.println(Arrays.toString(tab));
        //when
        //then
        assertEquals("[A, B, C, D, E, F, G, H, I, J, K, " +
                "L, M, N, O, P, Q, R, S, " +
                "T, U, V, W, X, Y, Z, " +
                "a, b, c, d, e, f, g, " +
                "h, i, j, k, l, m, n, " +
                "o, p, q, r, s, t, u, " +
                "v, w, x, y, z]",Arrays.toString(tab));

    }

    @Test
    public void countLetterTest(){
        //given
        CountingLetters countingLetters = new CountingLetters();
        countingLetters.countLetter("Bartoszek");
        //when
        //then

    }
}