////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Write the game "Tic Tac Toe" using
//two-dimensional arrays.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.leclure.four.exercise.five;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean check (int x,  int y, char[][] field) {
        boolean end = false;

        switch (x) {
            case 0:
               switch (y){
y
               }
                break;

            case 2:

                break;

            default:
                return end;
                break;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean endOfTheGame = false;
        char[][] playingField = new char[3][3];
        int coordinateX, coordinateY;
        int playerNumber = 1;

        for (char[] i : playingField) {
            Arrays.fill(i,' ');
        }

        do {

            System.out.println("Player " +  playerNumber + " enter coordinate \"x\": ");
            coordinateX = scanner.nextInt();
            System.out.println("Player " +  playerNumber + " enter coordinate \"y\": ");
            coordinateY = scanner.nextInt();

            if ((playerNumber == 1) && (playingField[coordinateX][coordinateY] == ' ')) {
                playingField[coordinateX][coordinateY] = 'x';
                playerNumber = 2;
            } else if (playingField[coordinateX][coordinateY] == ' ') {
                playingField[coordinateX][coordinateY] = '0';
                playerNumber = 1;
            } else {
                System.out.println("This cell is busy. Enter new coordinates.");
            }


            System.out.println();
            for (int i = 0 ; i < playingField.length; i++) {
                for(int j = 0; j < playingField[i].length; j++) {
                    System.out.print(playingField[i][j]);
                    if ( j != (playingField[i].length-1)) {
                        System.out.print ('|');
                    }
                }
                if (i != (playingField.length-1)) {
                    System.out.println("\n- - -");
                }
            }
            System.out.println("\n");


            endOfTheGame = check(coordinateX, coordinateY, playingField);


        } while (!endOfTheGame);

    }
}
