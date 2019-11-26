package spoj.exercise1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PrimeNumbersHelperTest {
    @Test
    public void primeNumbersHelperTest(){
        //given
        PrimeNumbersHelper primeNumbersHelper = new PrimeNumbersHelper();
        List<Integer> primeList = primeNumbersHelper.primeNumbers();

        //when

        //then
        assertEquals("2, 3, 5, 7, 11",primeList.toString());

    }

}