package day06_practices;

public class Calculator {

    public static void main(String[] args) {

        char operator = '@';
        double n1 = 12.15;
        double n2 = 10.20;

        if(operator=='+'){
            System.out.println(n1+n2);
        } else if (operator=='-') {
            System.out.println(n1-n2);
        } else if (operator=='*') {
            System.out.println(n1*n2);
        }else if(operator=='/'){
            System.out.println(n1/n2);
        } else {
            System.out.println("invalid operator");
        }


    }
}
