package com.bridgelabz.dice;

public class SnakeAndLadder {
    public int position=0;
    public static void main(String[] args) {
        System.out.println("welcome to snake and ladder problem");
        double diceroll = Math.floor(Math.random() * 10) % 6+1;
        System.out.println(diceroll);
    }
}
