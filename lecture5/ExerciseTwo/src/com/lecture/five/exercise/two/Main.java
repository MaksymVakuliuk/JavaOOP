
//
//Написать функцию, которая принимает массив чисел в качестве
//аргумента, увеличивает его первые 3 элемента на 1 и
//возвращает их сумму как результат. После изменения массив и
//сумму надо вывести на экран.
//

//
//Write a function that takes an array of numbers as
//argument, increases its first 3 elements by 1 and
//returns their amount as a result. After changing the array and
//the amount must be displayed on the screen.
//

package com.lecture.five.exercise.two;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

//    private static void not(int[] array) {
//
//        for (int i = 0; i < 3; i++) {
//            array[i]++;
//        }
//
//
//    }

    private static int[] createAndFillingArray() {
        Scanner scanner = new Scanner(System.in);

        int[] array;

        System.out.println("Enter the length of array: ");
        array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element number %d of the array: ", i);
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;

        array =  createAndFillingArray();



        System.out.println(Arrays.toString(array));

    }
}
