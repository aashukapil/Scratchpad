package com.learn.mockito.simple;

/**
 * Created by aashu on 27/11/16.
 * Using my mac in Singapore Bedok Court.
 */
@SuppressWarnings("ALL")
public class MathApplication {
    private CalculatorService calcService;

    public void setCalculatorService(CalculatorService calcService) {
        this.calcService = calcService;
    }

    public double add(double input1, double input2) {
        return calcService.add(input1, input2);
    }

    public double subtract(double input1, double input2) {
        return calcService.subtract(input1, input2);
    }

    public double multiply(double input1, double input2) {
        return calcService.multiply(input1, input2);
    }

    public double divide(double input1, double input2) {
        return calcService.divide(input1, input2);
    }
}
