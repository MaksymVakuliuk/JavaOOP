/////////////////////////////////////////////////////////////////////
//
//Find arithmetic mean of the array.
//
/////////////////////////////////////////////////////////////////////

package com.leclure.tree.exercise.four;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;
        int arrayLength;
        double arithmeticMeanOfTheArray = 0;

        System.out.print("Enter a length of a array: ");
        arrayLength =scanner.nextByte();

        array = new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            System.out.print("Enter element number " + index + " of the array: ");
            array[index] = scanner.nextInt();
        }

        for (int element : array) {
            arithmeticMeanOfTheArray += element;
        }
        arithmeticMeanOfTheArray /= arrayLength;

        System.out.println("Arithmetic mean of the array: " + arithmeticMeanOfTheArray);

    }
}
