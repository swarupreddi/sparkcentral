package org.sreddi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by swarup on 2/27/17.
 */
public class MyCalculator {

    private static final List<BinaryOperator> binaryOperators = new ArrayList<>();

    public MyCalculator() {

        binaryOperators.add(new BinaryOperatorPlus());
        binaryOperators.add(new BinaryOperatorMinus());
        binaryOperators.add(new BinaryOperatorDivide());
        binaryOperators.add(new BinaryOperatorTimes());
        binaryOperators.add(new BinaryOperatorExp());
    }

    //TODO: constructor that takes config and creates the list of operators in order of precedence

    public double evaluate(String expression, int start, int upper) {
        for (BinaryOperator op: binaryOperators) {
            int index = expression.indexOf(op.toString(), start);
            if (index >= start && index+op.length() < upper) {
                return op.eval(evaluate(expression, start, index), evaluate(expression, index+op.length(), upper));
            }
        }
        // TODO: check string is valid number
        String valString = expression.substring(start, upper).trim();
        return Double.valueOf(valString);
    }
}
