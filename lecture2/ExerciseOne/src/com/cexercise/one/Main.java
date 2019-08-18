//////////////////////////////////////////////////////////////////////////////////////
//
//Read line 1
//Read line 2
//Read line 3
// Display:
// line 1 + line 3
//line 3 + line 2 + line 1
//line 1 + line 2 + line 3
//
//////////////////////////////////////////////////////////////////////////////////////

package com.cexercise.one;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = scanner.nextLine();

        System.out.println("Enter second string:");
        String s2 = scanner.nextLine();

        System.out.println("Enter first string:");
        String s3 = scanner.nextLine();

        System.out.println(s1 + s3);
        System.out.println(s3 + s2 + s1);
        System.out.println(s1 + s2 + s3);
    }
}
