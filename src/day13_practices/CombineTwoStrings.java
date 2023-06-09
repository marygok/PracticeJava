package day13_practices;

public class CombineTwoStrings {

    public static void main(String[] args) {

        System.out.println(combine("one","eight"));

    }

    public static String combine (String str1, String str2){
        String result = str1 + str2;

        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            result = str1 + str2.substring(1);
        }

        return result;

    }
}
