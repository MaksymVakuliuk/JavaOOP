//
//Написать ф-ю, которая принимает на вход массив чисел и
//возвращает его длину в байтах как результат.
//

//
//
//


package com.lecture.five.exercise.three;

import java.util.Scanner;

public class Main {

    private static int[] createAndFillingArray() {
        Scanner scanner = new Scanner(System.in);

        int[] array;

        System.out.print("Enter the length of array: ");
        array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element number %d of the array: ", i);
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int arrayLengthInBytes (int[] array) {
        return array.length*4;
    }

    public static void main(String[] args) {

        int[] array;

        array = createAndFillingArray();

        System.out.printf("Array length in bytes: %d", arrayLengthInBytes(array));

    }
}
