//////////////////////////////////////////////////////////////////
//
//Lecture3. Exercise1
//Set an array of integer number 10 elements long.
//Sort numbers in the array.
//Display the result.
//Make it possible to fill the array from the keyboard.
//
//
//////////////////////////////////////////////////////////////////


package com.leclure.tree.exercise.one;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 5, 7, 4, 2, 9, 8, 6, 3, 0};
        int numberOfFillingMethod = 0;

        while (numberOfFillingMethod != 1 && numberOfFillingMethod != 2) {
            System.out.println("Select the method of filling the array:\n" +
                    "1. automatic {1, 5, 7, 4, 2, 9, 8, 6, 3, 0}\n" +
                    "2. manual");

            numberOfFillingMethod = scanner.nextInt();

            switch (numberOfFillingMethod) {
                case 1:
                    break;
                case 2:
                    for (int index = 0; index < array.length; index++) {
                        System.out.println("Enter the element number " + index + ": ");
                        array[index] = scanner.nextInt();
                    }
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
        }

        System.out.print("Массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        Arrays.sort(array);

        System.out.print("\nОтсортированный массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
