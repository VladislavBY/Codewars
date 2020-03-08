package by.popkov;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonantValueTest {

    @Test
    public void test1() {
        assertEquals(26, ConsonantValue.solve("zodiac"));
    }

    @Test
    public void test2() {
        assertEquals(80, ConsonantValue.solve("chruschtschov"));
    }
    @Test
    public void test3() {
        assertEquals(38, ConsonantValue.solve("khrushchev"));
    }
    @Test
    public void test4() {
        assertEquals(57, ConsonantValue.solve("strength"));
    }
    @Test
    public void test5() {
        assertEquals(73, ConsonantValue.solve("catchphrase"));
    }
    @Test
    public void test6() {
        assertEquals(103, ConsonantValue.solve("twelfthstreet"));
    }
    @Test
    public void test7() {
        assertEquals(80, ConsonantValue.solve("mischtschenkoana"));
    }
}