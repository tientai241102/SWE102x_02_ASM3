package com.asm3.junit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLogic {


    @Test
    public void testFindMax() {
        System.out.println("test case find max");
        assertEquals(4, Calculation.findMax(new int[]{1, 3, 4, 2}));
        assertEquals(-2, Calculation.findMax(new int[]{-12, -3, -4, -2}));
    }

    @Test
    public void testCube() {
        System.out.println("test case cube");
        assertEquals(27, Calculation.cube(3));
    }


}