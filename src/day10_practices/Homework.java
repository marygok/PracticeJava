package day10_practices;

public class Homework {

    public static void main(String[] args) {

        String str1 = new String("Cydeo"); // heap
        String str4 = new String("Cydeo"); // heap

        System.out.println(str1 == str4);

        String str2 = "Cydeo"; // string pool
        String str3 = "Cydeo"; // string pool

        System.out.println(str2 == str3);

        System.out.println("============================================");

        String s = "Cydeo";

        s = s.concat(" School");

        System.out.println(s);














    }
}
