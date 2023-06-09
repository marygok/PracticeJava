package day13_practices;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String s = "Java java  python python";
        String w = "java";

        System.out.println(frequencyOfWord(s,w));
        System.out.println(frequencyOfWord2(s,w));



    }

    public static int frequencyOfWord(String sentence, String word){

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        sentence = sentence.replace(" ","");

        int startLength = sentence.length();
        sentence = sentence.replace(word,"");

        return (startLength -sentence.length()) / word.length();


    }

    public static int frequencyOfWord2(String sentence, String word){

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        String temp = sentence.replace(word, "a".repeat(word.length()-1));

        int frequency = sentence.length() - temp.length();

        return frequency;

    }
}
