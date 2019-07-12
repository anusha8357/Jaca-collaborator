package homework;

import java.util.Scanner;

public class HighLowGame {
    public static void game() {

        int i;

        //guess high or low price

        System.out.println("***** Welcome to the game *****");
        System.out.println(" Select the level of the game: ");
        System.out.println(" 1. Easy level ");
        System.out.println(" 2. Medium level ");
        System.out.println(" 3. Hard level ");
        String E = "E";
        String M = "M";
        String H = "H";
        String e = "e";

        Scanner p = new Scanner(System.in);
        String easy = p.nextLine();

        if (easy.equals(E) || easy.equals(e)) {
            System.out.println(" 1. Easy level selected.");
            System.out.println(" You have 3 attempts to guess the price.");
            System.out.println(" And the range of the price is between 1-99");

            int attempt = 3;
            for (i = 0; i < 3; i++) {
                System.out.println("Guess the price: ");
                double price = p.nextDouble();

                if (price >= 1 && price <= 99) {
                    if (price > 55) {
                        System.out.println("The guessed price is high");
                        System.out.println("You have  " + attempt-- + " attempts left");

                    } else if (price == 55) {
                        System.out.println("The guessed price is correct. ");
                        break;
                    } else if (price <= 55) {
                        System.out.println("The guessed price is low");
                        System.out.println("You have  " + attempt-- + " attempts left");
                    }
                }
            }
        }

        Scanner q = new Scanner(System.in);
        String medium = q.nextLine();

        if (medium.equals(M)) {
            System.out.println(" 2. Medium level selected. ");
            System.out.println(" You have 3 attempts to guess the price.");
            System.out.println(" The range for medium level is 100 to 200");

            int attempt = 2;

            for (i = 0; i < 3; i++) {
                System.out.println("Guess the price: ");
                double price = q.nextDouble();

                if (price >= 100 && price <= 199) {
                    if (price >= 159) {
                        System.out.println("The guessed price is high");
                        System.out.println("You have  " + attempt-- + " attempts left");

                    } else if (price == 159) {
                        System.out.println("The guessed price is correct. ");
                        break;
                    } else if (price <= 159) {
                        System.out.println("The guessed price is low");
                        System.out.println("You have  " + attempt-- + " attempts left");
                    }
                }
            }
        }

        Scanner r = new Scanner(System.in);
        String hard = r.nextLine();

        if (hard.equals(H)) {
            System.out.println(" Hard level selected. ");
            System.out.println(" You have 3 attempts to guess the price.");
            System.out.println(" The range for medium level is 200 to 350");

            int attempt = 2;

            for (i = 0; i < 3; i++) {
                System.out.println("Guess the price: ");
                double price = r.nextDouble();

                if (price >= 200 && price <= 350) {
                    if (price >= 287) {
                        System.out.println("The guessed price is high");
                        System.out.println("You have  " + attempt-- + " attempts left");

                    } else if (price == 287) {
                        System.out.println("The guessed price is correct. ");
                        break;
                    } else if (price <= 287) {
                        System.out.println("The guessed price is low");
                        System.out.println("You have  " + attempt-- + " attempts left");
                    }
                }
            }
        }
    }

    public static void main(String[] args){
            game();
        }
    }

