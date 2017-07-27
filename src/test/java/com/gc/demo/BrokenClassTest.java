package com.gc.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 7/27/2017.
 */
public class BrokenClassTest {

    BrokenClass bc = new BrokenClass();
    @Test
    public void isCardAMatch() throws Exception {
        assertTrue("failed!",bc.isCardAMatch("one upper", "one UPPER"));

    }

    @Test
    public void isCardNotAMatch() throws Exception {
        assertFalse("failed!",bc.isCardAMatch("two upper", "one UPPER"));

    }

    @Test //BROKEN because adding "s"
    public void baseEncodeFileName() throws Exception {
        assertEquals("failed", "c2VjcmV0", bc.baseEncodeFileName("secret"));
    }

    @Test //BROKEN because doesn't round up -- need to use ceil function
    public void roundUp() throws Exception {
        assertEquals("failed", 11, bc.roundUp(10.2f));
    }

    @Test
    public void sum() throws Exception {
        int result = bc.sum(Integer.MAX_VALUE, 1);
        assertEquals("failed!", Integer.MAX_VALUE, result);
    }

}