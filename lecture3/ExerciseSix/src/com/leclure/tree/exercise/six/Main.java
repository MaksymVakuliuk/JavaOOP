//////////////////////////////////////////////////////////////////////////////
//
//Write a program that allows you to set the length of the array from 
//the keyboard, fill it elements, and  then display the desired element by
// its index on the console.
//
///////////////////////////////////////////////////////////////////////////////////


package com.leclure.tree.exercise.six;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;

        System.out.print("Enter length of a array: ");
        array = new int[scanner.nextInt()];

        System.out.println("Enter the array: ");
        for (int index = 0; index < array.length; index++) {
            System.out.print("Enter element number " + index + " of the array: ");
            array[index] = scanner.nextInt();
        }

        System.out.print("Array: ");
        for(int element : array) {
            System.out.print(element + " ");
        }

        System.out.print("\nEnter the index of thr item you want to display: ");
        System.out.println("Desired element: " + array[scanner.nextInt()]);

    }
}

