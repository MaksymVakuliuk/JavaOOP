//
//Написать ф-ю для объединения 2-х массивов в один. Вывести
//результат на консоль.
//


package com.lecture.five.exercise.four;

import java.util.Arrays;
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

    private static int[] arrayMerges (int[] array1, int[] array2) {

        int[] arrayMerges =  new int[array1.length+array2.length];

        System.arraycopy(array1, 0, arrayMerges, 0, array1.length);
        System.arraycopy(array2, 0, arrayMerges, array1.length, array2.length);

        return  arrayMerges;
    }


    public static void main(String[] args) {

        int[] array1;
        int[] array2;
        int[] arrayMerges;

        System.out.println("Array 1:");
        array1 = createAndFillingArray();
        System.out.println("Array 2:");
        array2 = createAndFillingArray();

        arrayMerges = arrayMerges(array1, array2);

        System.out.printf("Array merges: %s", Arrays.toString(arrayMerges));


    }
}
