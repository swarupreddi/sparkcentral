package org.sreddi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by swarup on 2/27/17.
 */
public class MyCalculatorTest {
    @Test
    public void testEvaluate() throws Exception {

        MyCalculator calc = new MyCalculator();
        assertEquals(1, (int) calc.evaluate("1",  0, 1));
        assertEquals(2, (int) calc.evaluate(" 3 -1 ",  0, 6));
        assertEquals(3, (int) calc.evaluate("1+2",  0, 3));
        assertEquals(6, (int) calc.evaluate("2 * 3",  0, 5));
        assertEquals(2, (int) calc.evaluate("4 / 2",  0, 5));
        assertEquals(4, (int) calc.evaluate("2^2",  0, 3));

        String expr = "1 + 1  - 4 * 4";
        assertEquals(-14, (int) calc.evaluate(expr, 0, expr.length()));

        expr = "4 / 2 +  3 * 2^2";
        assertEquals(14, (int) calc.evaluate(expr, 0, expr.length()));
    }

}