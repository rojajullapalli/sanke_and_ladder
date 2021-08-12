package com.bridgelabz.dice;

public class SnakeAndLadder {
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("Welcome the Player to Starts The Snake And Ladder Game at position 0");

        int position = 0;

        while ( position < WINNING_POSITION ) {
            int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("The Value Of Dice is " +diceNumber);

            int dieCheck = (int) Math.floor(Math.random() * 100) % 3;

            switch (dieCheck) {
                case LADDER:
                    System.out.println("The player gets Ladder");
                    position += diceNumber;
                    break;
                case SNAKE:
                    System.out.println("the player gets Snake");
                    position -= diceNumber;
                    if (position <= 0)
                        position = 0;
                    break;
                default:
                    System.out.println("The player gets No Play");
                    break;
            }
            System.out.println("The Position of Player:" +position);
        }
    }
}
