package com.leclure.tree.exercise.three;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int[] firstHalfOfArray = new int[array.length/2];
        int[] secondHalfOfArray = new int[array.length/2];

        System.out.println("Enter a array.");

        for (int index = 0; index < array.length; index++) {
            System.out.print("Enter element number " + index + " of the array: ");
            array[index] = scanner.nextInt();
        }

        System.arraycopy(array, 0, firstHalfOfArray, 0, array.length/2);
        System.arraycopy(array, array.length/2, secondHalfOfArray, 0, array.length/2);

        Arrays.sort(firstHalfOfArray);
        Arrays.sort(secondHalfOfArray);

        System.out.print("Sorted first half of the array: ");
        for(int element : firstHalfOfArray) {
            System.out.print(element + " ");
        }

        System.out.print("\nSorted second half of the array: ");
        for(int element : secondHalfOfArray) {
            System.out.print(element + " ");
        }

    }
}
