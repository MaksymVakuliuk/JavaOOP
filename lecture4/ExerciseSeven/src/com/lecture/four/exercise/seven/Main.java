////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Find in the array a number that repeats
//most times. Do not use collection.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.lecture.four.exercise.seven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array;
        int counter = 0;
        int maxAmount = 0;
        int indexOfMaxCounterElement = 0;

        System.out.print("Enter length of the array: ");
        array = new int[scanner.nextInt()];

        System.out.println("Enter the array: ");

        for (int index  = 0; index < array.length; index++) {
            System.out.print("Enter element number " + index + " of the array: ");
            array[index] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                counter = (array[i] == array[j]) ? ++counter : counter;
            }
            if (maxAmount < counter) {
                maxAmount = counter;
                indexOfMaxCounterElement = i;
            }
            counter = 0;
        }

        System.out.println();
        System.out.print("Number that repeat most time in the array: ");
        System.out.println(array[indexOfMaxCounterElement]);
    }
}