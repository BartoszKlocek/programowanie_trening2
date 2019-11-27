package spoj.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumbersTaskTest {
    @Test
    public void primeNumbersTask(){
        //given
        PrimeNumbersTask primeNumbersTask = new PrimeNumbersTask();
        String result = primeNumbersTask.isPrimeOrNot(5);
        String result1 = primeNumbersTask.isPrimeOrNot(7);
        String result2 = primeNumbersTask.isPrimeOrNot(9);
        //when
        //then
        assertEquals("TAK",result);
        assertEquals("TAK",result1);
        assertEquals("NIE",result2);
    }
}