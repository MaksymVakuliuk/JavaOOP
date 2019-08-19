//
//Using the console, the users enters mathematical expression like "1+33-4*7".
//To write a program to calculate its value. A priority operations are not taken into account.
//

package com.lecture.four.exercise.eigth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mathematicalExpression= "";
        String operandNumberOne = "";
        String operandNumberTwo = "";
        String output = "";
        char operator;
        double value = 0;

        System.out.println(mathematicalExpression.length());

        System.out.println("Enter mathematical expression like \"1+33-4*7\": ");
        mathematicalExpression = scanner.nextLine();
        output = mathematicalExpression;

        for (int i = 0; Character.isDigit(mathematicalExpression.charAt(i));i++) {
            operandNumberOne = operandNumberOne.concat(Character.toString(mathematicalExpression.charAt(i)));
        }
        value  = Double.parseDouble(operandNumberOne);
        mathematicalExpression = mathematicalExpression.replaceFirst(operandNumberOne,"");

        do {
            operandNumberTwo = "";
            operator =  mathematicalExpression.charAt(0);
            mathematicalExpression = mathematicalExpression.replaceFirst(String.format("\\%s", String.valueOf(operator)),"");
            for (int i = 0; i < mathematicalExpression.length() && Character.isDigit(mathematicalExpression.charAt(i));i++) {
                operandNumberTwo = operandNumberTwo.concat(Character.toString(mathematicalExpression.charAt(i)));
            }
            mathematicalExpression = mathematicalExpression.replaceFirst(operandNumberTwo,"");

            switch (operator) {
                case '+' :
                    value += Double.parseDouble(operandNumberTwo);
                    break;
                case '-':
                    value -= Double.parseDouble(operandNumberTwo);
                    break;
                case '*':
                    value *= Double.parseDouble(operandNumberTwo);
                    break;
                case '/':
                    value /= Double.parseDouble(operandNumberTwo);
                    break;
                default :
                    break;
            }
        } while (mathematicalExpression.length() != 0);

        output = output.concat(" = " + Double.toString(value));
        System.out.println(output);

    }
}
