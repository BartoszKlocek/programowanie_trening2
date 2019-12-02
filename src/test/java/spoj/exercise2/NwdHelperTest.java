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

    @Test
    public void getNwdTest(){
        //given
        NwdHelper nwdHelper = new NwdHelper();
        int result1 = nwdHelper.getNwd(6,15);
        int result2 = nwdHelper.getNwd(11,33);
        int result3 = nwdHelper.getNwd(6,18);
        int result4 = nwdHelper.getNwd(9,81);
        int result5 = nwdHelper.getNwd(13,15);
        //when
        //then
        assertEquals(3,result1);
        assertEquals(11,result2);
        assertEquals(12,result5);
    }

    @Test
    public void getCommonList(){
        //given
        NwdHelper nwdHelper = new NwdHelper();
        List<Integer> commonList = nwdHelper.getCommonList(6, 12);
        //when
        System.out.println(commonList.toString());
        //then



    }

}