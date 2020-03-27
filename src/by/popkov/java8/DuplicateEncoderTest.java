package by.popkov.java8;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {

    @Test
    public void encode1() {
        assertEquals("(((", DuplicateEncoder.encode("din"));
    }

    @Test
    public void encode2() {
        assertEquals("()()()", DuplicateEncoder.encode("recede"));
    }

    @Test
    public void encode3() {
        assertEquals(")())())", DuplicateEncoder.encode("Success"));
    }

    @Test
    public void encode4() {
        assertEquals("))((", DuplicateEncoder.encode("(( @"));
    }

    @Test
    public void encode5() {
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
    }

    @Test
    public void encode6() {
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }

}