package by.popkov.java8;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanReadableTimeTest {

    @Test
    public void input0() {
        assertEquals("00:00:00", HumanReadableTime.makeReadable(0));
    }

    @Test
    public void input5() {
        assertEquals("00:00:05", HumanReadableTime.makeReadable(5));
    }

    @Test
    public void input60() {
        assertEquals("00:01:00", HumanReadableTime.makeReadable(60));
    }

    @Test
    public void input86399() {
        assertEquals("23:59:59", HumanReadableTime.makeReadable(86399));
    }

    @Test
    public void input359999() {
        assertEquals("99:59:59", HumanReadableTime.makeReadable(359999));
    }
}