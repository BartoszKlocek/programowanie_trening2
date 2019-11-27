package spoj.exercise2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NwdHelperTest {
    @Test
    public void nwdHelperTest(){
        //given
        NwdHelper nwdHelper = new NwdHelper();
        List<Integer> list1 = nwdHelper.primeFactors(12);
        List<Integer> list3 = nwdHelper.primeFactors(24);
        List<Integer> list5 = nwdHelper.primeFactors(33);
        List<Integer> list7 = nwdHelper.primeFactors(45);

        //when
        List<Integer> list2 = Arrays.asList(2,2,3);
        List<Integer> list4 = Arrays.asList(2,2,2,3);
        List<Integer> list6 = Arrays.asList(3,11);
        List<Integer> list8 = Arrays.asList(3,3,5);


        //then
        assertEquals(list2,list1);
        assertEquals(list4,list3);
        assertEquals(list6,list5);
        assertEquals(list8,list7);
    }

}