package spoj.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class AverageSpeedTest {
    @Test
    public void getAverageSpeedTest(){
        //given
        AverageSpeed averageSpeed = new AverageSpeed();
        int a = averageSpeed.getAverageSpeed(40,60);
        int b = averageSpeed.getAverageSpeed(50,50);
        int c = averageSpeed.getAverageSpeed(60,60);
        //when
        //then
        assertEquals(48,a);
        assertEquals(50,50);
        assertEquals(60,60);
    }

}