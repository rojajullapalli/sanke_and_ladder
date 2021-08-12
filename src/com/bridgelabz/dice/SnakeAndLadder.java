package com.bridgelabz.dice;

public class SnakeAndLadder {

    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Welcome the Player to Starts The Snake And Ladder Game at position 0");

        int position1 = 0, position2 = 0;
        int dieRole1 = 0, dieRole2 = 0;

        while (position1 < WINNING_POSITION && position2 < WINNING_POSITION) {
            int diceNumber1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("The Value Of Dice is " + diceNumber1);
            dieRole1++;

            int dieCheck = (int) Math.floor(Math.random() * 100) % 3;

            switch (dieCheck) {
                case LADDER:
                    System.out.println("The player gets Ladder");
                    position1 += diceNumber1;
                    break;
                case SNAKE:
                    System.out.println("the player gets Snake");
                    position1 -= diceNumber1;
                    if (position1 <= 0)
                        position1 = 0;
                    break;
                default:
                    System.out.println("The player gets No Play");
                    break;
            }
            System.out.println("The Position of first Player:" + position1);
            if (position1 > WINNING_POSITION) {
                position1 -= diceNumber1;
                System.out.println("The Position of first Player:" + position1);
            }
            if (dieCheck == LADDER) {
                diceNumber1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
                System.out.println("The Value Of Dice2 is " + diceNumber1);
                position1 += diceNumber1;
            }
            if (position1 > WINNING_POSITION) {
                position1 -= diceNumber1;
                System.out.println("The Position of first Player:" + position1);
            }
            if (position1 == WINNING_POSITION) {
                break;
            }

            int diceNumber2 = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("The Value Of Dice is " + diceNumber2);
            dieRole2++;

            int dieCheck2 = (int) Math.floor(Math.random() * 100) % 3;

            switch (dieCheck2) {
                case LADDER:
                    System.out.println("The second player gets Ladder");
                    position2 += diceNumber2;
                    break;
                case SNAKE:
                    System.out.println("the second player gets Snake");
                    position2 -= diceNumber2;
                    if (position2 <= 0)
                        position2 = 0;
                    break;
                default:
                    System.out.println("The second player gets No Play");
                    break;
            }
            System.out.println("The Position of the Second Player:" + position2);
            if (position2 > 100) {
                position2 -= diceNumber2;
                System.out.println("The Position of Second Player:" + position2);
            }
            if (dieCheck2 == LADDER) {
                diceNumber2 = (int) Math.floor(Math.random() * 10) % 6 + 1;
                System.out.println("The Value Of Dice2 is " + diceNumber2);
                position2 += diceNumber2;
            }

            if (position2 > 100) {
                position2 -= diceNumber2;
                System.out.println("The Position of Second Player:" + position2);
            }
        }

        System.out.println("The Final Position of the First Player:" + position1);
        System.out.println("The Final Position of the Second Player:" + position2);

        System.out.println("The Total number of Times Die Role :" + dieRole1);
        System.out.println("The Total number of Times Die Role :" + dieRole2);

        if (position1 == 100)
            System.out.println("THE FIRST PLAYER WON THE GAME");
        else
            System.out.println("THE SECOND PLAYER WON THE GAME");
    }
}
