////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Given an array of 10 integers. Display the sum of all its elements except the first and
//last one.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.lecture.four.exercise.four;

public class Main {

    public static void main(String[] args) {

        int[] array = {3, 1, 2, 3, 4, 5, 6, 7, 8,5};

        for (int index = 1; index < array.length - 1; index++) {
            System.out.print(array[index] + " ");
        }

    }
}
