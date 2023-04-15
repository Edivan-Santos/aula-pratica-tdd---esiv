package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }
}
