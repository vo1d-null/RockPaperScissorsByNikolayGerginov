package com.example.rockpaperscissorsbynikolaygerginov;

import java.util.Scanner;
import java.util.Random;

public class Game {
    private static final String ROCK = "ROCK";
    private static final String PAPER = "PAPER";
    private static final String SCISSORS = "SCISSORS";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose your fighter - [r]ock,[p]aper,[s]cissors :");
        String playerMove = scan.next();
        if (playerMove.equals("r") || playerMove.equals("rock")
                || playerMove.equals("R") || playerMove.equals("ROCK")) {
            playerMove = ROCK;
            System.out.printf("You chose %s%n", playerMove);
        } else if (playerMove.equals("p") || playerMove.equals("paper")
                || playerMove.equals("P") || playerMove.equals("PAPER")) {
            playerMove = PAPER;
            System.out.printf("You chose %s%n", playerMove);
        } else if (playerMove.equals("s") || playerMove.equals("scissors")
                || playerMove.equals("S") || playerMove.equals("SCISSORS")) {
            playerMove = SCISSORS;
            System.out.printf("You chose %s%n", playerMove);
        } else {
            System.out.println("Invalid Input.Try again...");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMove = "";
        switch (computerRandomNumber) {
            case 0:
                computerMove = ROCK;
                break;
            case 1:
                computerMove = PAPER;
                break;
            case 2:
                computerMove = SCISSORS;
                break;
        }
        System.out.printf("The computer chose %s%n", computerMove);
        if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS) ||
                playerMove.equals(SCISSORS) && computerMove.equals(PAPER) ||
                playerMove.equals(PAPER) && computerMove.equals(ROCK)) {
            System.out.println("You win!");
        } else if (computerMove.equals(ROCK) && playerMove.equals(SCISSORS) ||
                computerMove.equals(SCISSORS) && playerMove.equals(PAPER) ||
                computerMove.equals(PAPER) && playerMove.equals(ROCK)) {
            System.out.println("You lose!");
        } else {
            System.out.println("This game is a draw!");
        }

    }
}
