package com.gc.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 7/27/2017.
 */
public class BoomFizzTest {
    @Test
    public void boomTest1() throws Exception {
        BoomFizz bf = new BoomFizz();
        String expected = "1";
        String actual = bf.boom(1);
        // assertion
        assertEquals("Your code sucks!", expected, actual);
    }

    @Test
    public void boomTest7 () throws Exception {
        BoomFizz bf = new BoomFizz();
        String expected = "Boom!";
        String actual = bf.boom(7);
        // assertion
        assertEquals("Your code sucks!", expected, actual);
    }

}