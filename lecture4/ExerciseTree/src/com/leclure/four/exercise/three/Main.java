//////////////////////////////////////////////////////////////////////////////////////////
//
//Fill the array with numbers from 100 to 0.
//
//////////////////////////////////////////////////////////////////////////////////////////

package com.leclure.four.exercise.three;

public class Main {

    public static void main(String[] args) {

        int[] array =  new int [100];

        for (int index = 0; index < array.length; index++) {
            array[index] = array.length-index;
        }

        for (int i : array) {
            System.out.println(i);
        }

    }
}
