//////////////////////////////////////////////////////////////////////////////
//
//Write a program for flipping an array.
//
///////////////////////////////////////////////////////////////////////////////////

package com.leclure.tree.exercise.five;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp;
        int[] array;

        System.out.print("Enter length of a array: ");
        array = new int[scanner.nextInt()];

        System.out.println("Enter the array: ");
        for (int index = 0; index < array.length; index++) {
            System.out.print("Enter element number " + index + " of the array: ");
            array[index] = scanner.nextInt();
        }

        for (int index = 0; index < array.length/2; index++) {
            temp = array[index];
            array[index] = array[(array.length-1) - index];
            array[(array.length-1) - index] = temp;
        }

        System.out.print("Reverse array: ");
        for(int element : array) {
            System.out.print(element + " ");
        }

    }
}
