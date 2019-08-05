//////////////////////////////////////////////////////////////////////////////////////////
//
//Display numbers form 10 to 20 using all known cycles.
//
//////////////////////////////////////////////////////////////////////////////////////////

package com.leclure.four.exercise.one;

public class Main {

    public static void main(String[] args) {

        int i = 10;

        System.out.println("\nCycle \"while\": ");
        while (i < 20) {
            System.out.print(i++ + " ");
        }

        System.out.println("\nCycle \"for\": ");
        for (i = 10; i < 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nCycle \"do..while\": ");
        i = 10;
        do {
            System.out.print(i++ + " ");
        } while (i < 20);

        
    }
}
