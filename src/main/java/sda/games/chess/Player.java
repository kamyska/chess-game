package sda.games.chess;

import java.util.Scanner;

public class Player {

    public void getMove() {

        String move:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz ruch wpisujac pole z ktorego chcesz przeunac pionek na pole na ktore chcesz "
                            + "na pole na ktorre chcesz przesunac wstawiajac pomiedzy swoj wybor znak \">\", np:\n"
                            + "A1>H8");
        System.out.print("Ruch: " + move);
        int fromX = Integer.parseInt(charToInt(move.substring(0, 1)))
        int fromY;
        int toX;
        int toY;

        Move move = new Move();

    }

    public int charToInt(char c) {
        int number = 0;
        switch (c) {
            case 'A':
                number = 1;
                break;
            case 'B':
                number = 2;
                break;
            case 'C':
                number = 3;
                break;
            case 'D':
                number = 4;
                break;
            case 'E':
                number = 5;
                break;
            case 'F':
                number = 6;
                break;
            case 'G':
                number = 7;
                break;
            case 'H':
                number = 8;
                break;
            default:
                break;
        }
        return number;
    }

}
