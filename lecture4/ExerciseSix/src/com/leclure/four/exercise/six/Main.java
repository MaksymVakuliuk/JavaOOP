////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Find the elements with the largest and
//the smallest values.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.leclure.four.exercise.six;

import jdk.swing.interop.SwingInterOpUtils;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        int arrayLength;
        int[] array;
        int smallestElementOfArray;
        int largestElementOfArray;

        System.out.println("Enter length of the array: ");
        arrayLength = scanner.nextInt();
        array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element number " + i + " of array: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        smallestElementOfArray = array[0];
        largestElementOfArray = array[arrayLength-1];


        System.out.println("Smaller element of the array: " + smallestElementOfArray);
        System.out.println("Largest element of the array: " + largestElementOfArray);
    }
}
