package by.popkov;

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class BackspacesInStringTest {
    private BackspacesInString backspacesInString = new BackspacesInString();

    @Test
    public void test1() {
        System.out.println("Input:abc#d##c");
        assertEquals(backspacesInString.cleanString("abc#d##c"), "ac");
        System.out.println("Output:ac");
    }

    @Test
    public void test2() {
        System.out.println("Input:abc##d######");
        assertEquals(backspacesInString.cleanString("abc##d######"), "");
        System.out.println("Output:");
    }

    @Test
    public void test3() {
        System.out.println("Input:#######");
        assertEquals(backspacesInString.cleanString("#######"), "");
        System.out.println("Output:");
    }

    @Test
    public void test4() {
        System.out.println("Input:");
        assertEquals(backspacesInString.cleanString(""), "");
        System.out.println("Output:");
    }
}