package day09_practices;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many shares, do you have ?");

        int shares = input.nextInt();

        System.out.println("how much your shares total value in the stock market ");

        double sharesValue = input.nextDouble();

        input.nextLine();

        System.out.println("Please enter name of the company do you have the most shares.");

        String companyName = input.nextLine();

        System.out.println("Your total stock market holding is " + sharesValue + " which is made up of " + shares + ". " + companyName + " is your company holdings.");


    }
}

