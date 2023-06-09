package day06_practices;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '5';

        boolean isDigit = ch >= '0' && ch <= '9';
        boolean isLetter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        boolean isSpecialChar = !isDigit && !isLetter;

        String result = "";

        if (isDigit) {
            result = "Digit";
        }
        if (isLetter) {
            result = ch + "Alphabetic";
        }
        if (isSpecialChar) {
            result = "Special Character";
        }
        System.out.println(result);


    }
}
