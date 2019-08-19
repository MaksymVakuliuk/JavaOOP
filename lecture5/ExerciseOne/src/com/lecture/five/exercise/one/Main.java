//
//Write a function that takes as arguments
//one line X, an integer Y and a floating point Z and
//returns as a result a string in the form "S = x + y + z".
//

package com.lecture.five.exercise.one;

import java.util.Scanner;

public class Main {

    static String calculation(String x, int y, double z) {

        double sum = 0;

        sum = Double.parseDouble(x) + y  + z;
        return String.format("%.2f = %s + %d + %.2f", sum, x, y,z);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    String x = "";
	    int y = 0 ;
	    double z = 0;

        System.out.print("Enter x: ");
        x = scanner.nextLine();
        System.out.print("Enter the y(must be integer): ");
        y = scanner.nextInt();
        System.out.print("Enter the z: ");
        z = scanner.nextDouble();

        System.out.println(calculation(x,y,z));
    }
}
