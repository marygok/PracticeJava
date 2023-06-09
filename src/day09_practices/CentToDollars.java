package day09_practices;

import java.util.Scanner;

public class CentToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Cents");
        int cent = input.nextInt();

        int convert = cent / 100;
        int remain = cent % 100;

        System.out.println(cent+" cents equal to: "+convert+" dollars and "+remain+" cents");

    }

}

