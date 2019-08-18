//////////////////////////////////////////////////////////////////////////////////////
//
//Read number 1
//Read number 2
//Display:
//number 1 + number 2 =
//number 1 - number 2 =
//number 1 * number 2 =
//number 1 / number 2 =
//number 1 % number 2 =
//number 1++ =
//++number 1 =
//
//////////////////////////////////////////////////////////////////////////////////////

package com.cexercise.two;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne;
        int numberTwo;

        System.out.print("Enter number 1: ");
        numberOne = scanner.nextInt();

        System.out.print("Enter number 2: ");
        numberTwo = scanner.nextInt();

        System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
        System.out.println(numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
        System.out.println(numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo));
        System.out.println(numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
        System.out.println(numberOne + " % " + numberTwo + " = " + (numberOne % numberTwo));
        System.out.println(numberOne + "++ " +  " = " + numberOne++);
        System.out.println("++ " + numberOne + " = " + ++numberOne);


    }
}
