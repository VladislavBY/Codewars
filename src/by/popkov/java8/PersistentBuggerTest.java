package by.popkov.java8;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersistentBuggerTest {
    @Test
    public void Test_1() {
        assertEquals(3, PersistentBugger.persistence(39));
    }

    @Test
    public void Test_2() {
        assertEquals(0, PersistentBugger.persistence(4));
    }

    @Test
    public void Test_3() {
        assertEquals(2, PersistentBugger.persistence(25));
    }

    @Test
    public void Test_4() {
        assertEquals(4, PersistentBugger.persistence(999));
    }

}