package day11_practices;

import java.util.Scanner;

public class FullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String f = input.next().toLowerCase();

        f = ("" + f.charAt(0)).toUpperCase() + f.substring(1);

        System.out.println("Enter your last name:");
        String l = input.next().toLowerCase();
        l = (""+l.charAt(0)).toUpperCase() + l.substring(1);

        System.out.println(f + " " + l);

        input.close();

    }

}