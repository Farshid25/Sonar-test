package com;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Testing {

 taxCalculator t = new taxCalculator();

    @Test
    public void checkIfSalarisIsNull() {
        if (t.getInkomen(9) == 0) {
            fail("The failing test");
        }
    }
@Ignore
    @Test
    public void test_fail() {
        fail("Let's test the failing unit test");
    }
}

