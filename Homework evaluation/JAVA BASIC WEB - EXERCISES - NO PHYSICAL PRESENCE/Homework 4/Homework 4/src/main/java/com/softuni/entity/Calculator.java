package com.softuni.entity;

public class Calculator {
    private double leftOperand;
    private double rightOpererand;
    private String operator;

    public Calculator(double leftOperand, double rightOpererand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOpererand = rightOpererand;
        this.operator = operator;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOpererand() {
        return rightOpererand;
    }

    public void setRightOpererand(double rightOpererand) {
        this.rightOpererand = rightOpererand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculateResult(){
        double result = 0.0;
        double leftOperand = this.leftOperand;
        double rightOperand = this.rightOpererand;
        String operator = this.operator;
        switch(operator){
            case "+":
                result = leftOperand + rightOperand;
                break;
            case "-":
                result = leftOperand - rightOperand;
                break;
            case "*":
                result = leftOperand * rightOperand;
                break;
            case "/":
                result = leftOperand / rightOperand;
                break;
            case "anomalify":
                result = (leftOperand + rightOperand) * 69 / 420;
                break;
        }
        return result;
    }
}
