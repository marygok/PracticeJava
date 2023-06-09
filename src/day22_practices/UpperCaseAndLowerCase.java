package day22_practices;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";

        char upperCase = 0;
        char lowerCase = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isUpperCase(each));
            upperCase++;
            if (Character.isLowerCase(each));
            lowerCase++;
        }

        System.out.println(upperCase == lowerCase);




    }
}



/*
6. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";
        output:
            true
        Note: Use Wrapper class methods
 */
