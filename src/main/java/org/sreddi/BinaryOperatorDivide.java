package org.sreddi;

/**
 * Created by swarup on 2/27/17.
 */
public class BinaryOperatorDivide extends BinaryOperator {
    public BinaryOperatorDivide() {
        super("/", 1);
    }

    @Override
    public double eval(double v1, double v2) {
        return v1 / v2;
    }
}

