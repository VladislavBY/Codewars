package by.popkov;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitalRootTest {

    @Test
    public void input_16_output_7() {
        assertEquals(7, DigitalRoot.digital_root(16));
    }
    @Test
    public void input_456_output_6() {
        assertEquals(6, DigitalRoot.digital_root(456));
    }
}