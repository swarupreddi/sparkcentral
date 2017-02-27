package org.sreddi;

/**
 * Created by swarup on 2/27/17.
 */
public class BinaryOperatorExp extends BinaryOperator {
    public BinaryOperatorExp() {
        super("^", 0);
    }

    @Override
    public double eval(double v1, double v2) {
        return Math.pow(v1, v2);
    }
}

