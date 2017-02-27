package org.sreddi;

/**
 * Created by swarup on 2/27/17.
 */
public abstract class BinaryOperator {
    private String operatorString;
    private int priority;
    private int operatorStringLength; // used as valid flag as well. -1 means unfit for use

    public BinaryOperator(String operatorString, int priority) {
        this.operatorString = operatorString;
        this.priority = priority;
        this.operatorStringLength = operatorString == null || operatorString.equals("") ? -1 : operatorString.length();
    }

    public String toString() {
        return operatorString;
    }

    public int length() {
        return operatorStringLength;
    }
    public abstract double eval(double val1, double val2);
}
