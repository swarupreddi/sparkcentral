package org.sreddi;

/**
 * Created by swarup on 2/27/17.
 */
public class BinaryOperatorTimes extends BinaryOperator {
    public BinaryOperatorTimes() {
        super("*", 1);
    }

    @Override
    public double eval(double v1, double v2) {
        return v1 * v2;
    }
}

