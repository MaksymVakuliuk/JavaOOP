package com.leclure.tree.exercise.two;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;
        int temp;

        System.out.println("Enter length of the array: ");
        array = new int[scanner.nextInt()];

        System.out.println("Enter the array: ");
        for (int index = 0; index < array.length; index++) {
            System.out.println("Enter element number " + index + " of the array: ");
            array[index] = scanner.nextInt();
        }

        temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;

        System.out.println("New array: ");
        for (int ellement : array) {
            System.out.println(ellement + " ");
        }

    }
}
